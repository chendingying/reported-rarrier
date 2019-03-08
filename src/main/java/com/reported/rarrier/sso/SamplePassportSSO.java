package com.reported.rarrier.sso;

import cn.gov.customs.casp.config.ConfigReader;
import cn.gov.customs.casp.sdk.h4a.BeanReaderHelper;
import cn.gov.customs.casp.sdk.h4a.accredit.ws.IAccreditReaderIsUserInRolesCupaaFaultArgsFaultFaultMessage;
import cn.gov.customs.casp.sdk.h4a.accredit.ws.UserCategory;
import cn.gov.customs.casp.sdk.h4a.entity.ObjectParentOrganizations;
import cn.gov.customs.casp.sdk.h4a.entity.ObjectsDetail;
import cn.gov.customs.casp.sdk.h4a.enumdefines.AccreditCategory;
import cn.gov.customs.casp.sdk.h4a.enumdefines.DelegationCategories;
import cn.gov.customs.casp.sdk.h4a.enumdefines.ViewCategory;
import cn.gov.customs.casp.sdk.h4a.ogu.ws.IOguReaderGetObjectParentOrganizationsCupaaFaultArgsFaultFaultMessage;
import cn.gov.customs.casp.sdk.h4a.ogu.ws.IOguReaderGetObjectsDetailCupaaFaultArgsFaultFaultMessage;
import cn.gov.customs.casp.sdk.h4a.ogu.ws.ObjectCategory;
import cn.gov.customs.casp.sdk.h4a.ogu.ws.OrganizationCategory;
import cn.gov.customs.casp.sdk.h4a.passport.IAccreditBeanReader;
import cn.gov.customs.casp.sdk.h4a.passport.IOguBeanReader;
import cn.gov.customs.casp.sdk.h4a.sso.IPassportSSO;
import cn.gov.customs.casp.sdk.h4a.sso.passport.Ticket;
import cn.gov.customs.casp.sdk.h4a.sso.passport.util.CookieCenter;
import cn.gov.customs.casp.sdk.h4a.util.H4aDefaultConstants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: cdy
 * @Date: 2019/1/3 14:50
 * @Version 1.0
 */
@Configuration
public class SamplePassportSSO implements IPassportSSO {

    @Value("${html.url}")
    private String url;
    @Override
    public void LogOut(HttpServletRequest request, HttpServletResponse response) {
        CookieCenter cc = new CookieCenter(request, response);
        HttpSession session = request.getSession(true);
        session.setAttribute("TICKET", null);
        cc.clearCookie();

    }

    @Override
    public void Login(Ticket ticket, HttpServletRequest request, HttpServletResponse response, String time) {
        HttpSession session = request.getSession(true);
        StringBuffer userId = new StringBuffer();
        userId.append(ticket.getLn());
        userId.append("&");
        userId.append(ticket.getAbm());

        String objectDetailsLastParam = ConfigReader.getConfigValue("h4a-config.xml", "object_param", "parameter_obj", "getBeanObjectsDetail_lastParam");
        String organizationLastParam = ConfigReader.getConfigValue("h4a-config.xml", "object_param", "parameter_obj", "organizationCategory_lastParam");
        if(null == objectDetailsLastParam){
            objectDetailsLastParam="";
        }
        if(null == organizationLastParam){
            organizationLastParam="";
        }
        IOguBeanReader oguBeanReaderHelper = BeanReaderHelper.getIOguBeanReader();
        try {
            ObjectsDetail[] objectDetails = oguBeanReaderHelper.
                    getBeanObjectsDetail(
                            H4aDefaultConstants.DEFAULT_BASE_VIEW,
                            ViewCategory.ViewCode, userId.toString(),
                            ObjectCategory.USER_IDENTITY, "",
                            OrganizationCategory.NONE, objectDetailsLastParam);
            if(null != objectDetails && objectDetails.length>0){
                ObjectsDetail objectDeatil = objectDetails[0];//这里为了编写示例默认取第一个人员，默认第一个是主职，其他都是兼职，

                ObjectParentOrganizations[] objectParentOrganizationses = oguBeanReaderHelper.getBeanObjectParentOrganizations(
                        H4aDefaultConstants.DEFAULT_BASE_VIEW,
                        ViewCategory.ViewCode, objectDeatil.getAll_path_name(),
                        ObjectCategory.USER_ALL_PATH_NAME, "",OrganizationCategory.ORG_ORIGINAL_SORT,
                        false,false,"","ORG_CLASS,ORG_TYPE,CUSTOMS_CODE"
                );
                String orgId = "";
                if(objectParentOrganizationses != null){
                    for(ObjectParentOrganizations objectParentOrganizations : objectParentOrganizationses){
                        if(objectParentOrganizations.getDisplay_name().equals("汕头海关")){
                            orgId = objectParentOrganizations.getOrg_guid();
                        }
                        if(!orgId.equals("") && objectParentOrganizations.getParent_guid().equals(orgId)){
                            objectDeatil.setGroup_guid(objectParentOrganizations.getOrg_guid());
                            objectDeatil.setLast_name(objectParentOrganizations.getDisplay_name());
                        }
                    }
                }

                //如果业务系统需要使用到兼职用户需要自行编写业务逻辑实现兼职用户的情况
                session.setAttribute("user", objectDeatil);
                session.setAttribute("userIP", request.getRemoteAddr());
                ObjectParentOrganizations[] objectOrganizations = oguBeanReaderHelper.
                        getBeanObjectParentOrganizations(
                                H4aDefaultConstants.DEFAULT_BASE_VIEW,
                                ViewCategory.ViewCode, objectDeatil.getAll_path_name(),
                                ObjectCategory.USER_ALL_PATH_NAME, "",
                                OrganizationCategory.NONE, false, false,
                                "", organizationLastParam);
                if(null != objectOrganizations && objectOrganizations.length>0){
                    session.setAttribute("organization", objectOrganizations);
                }
                ObjectsDetailForm objectsDetailForm = new ObjectsDetailForm(objectDeatil);
                //判断是否是管理员
                IAccreditBeanReader acdit = BeanReaderHelper.getIAccreditBeanReader();
//                Boolean systemAdmin  = acdit.isUserInRolesBean(objectDeatil.getAll_path_name(),  UserCategory.USER_ALL_PATH_NAME, "",
//                        cn.gov.customs.casp.sdk.h4a.accredit.ws.OrganizationCategory.NONE,"TECHSUPPORT",
//                        AccreditCategory.Code,"CCIC_VIEW",AccreditCategory.Code,"SYSTEM_ADMIN",AccreditCategory.Code, DelegationCategories.All
//                );
//                objectsDetailForm.setUserAdmin(systemAdmin);
                Boolean returnObject  = acdit.isUserInRolesBean(objectDeatil.getAll_path_name(),  UserCategory.USER_ALL_PATH_NAME, "",
                        cn.gov.customs.casp.sdk.h4a.accredit.ws.OrganizationCategory.NONE,"TECHSUPPORT",
                        AccreditCategory.Code,"CCIC_VIEW",AccreditCategory.Code,"JSOPER",AccreditCategory.Code,DelegationCategories.All
                );

                if(returnObject){
                    objectsDetailForm.setUserType("gly");
                }else{
                    Boolean returnGLD  = acdit.isUserInRolesBean(objectDeatil.getAll_path_name(),  UserCategory.USER_ALL_PATH_NAME, "",
                            cn.gov.customs.casp.sdk.h4a.accredit.ws.OrganizationCategory.NONE,"TECHSUPPORT",
                            AccreditCategory.Code,"CCIC_VIEW",AccreditCategory.Code,"JSCSECTION",AccreditCategory.Code,DelegationCategories.All
                    );
                    if(returnGLD){
                        objectsDetailForm.setUserType("ry");
                    }else{
                        objectsDetailForm.setUserType("无");

                    }
                }
                session.setAttribute("objectsDetailForm",objectsDetailForm);

            }
        } catch (IOguReaderGetObjectsDetailCupaaFaultArgsFaultFaultMessage | IOguReaderGetObjectParentOrganizationsCupaaFaultArgsFaultFaultMessage  e) {
            e.printStackTrace();
        } catch (IAccreditReaderIsUserInRolesCupaaFaultArgsFaultFaultMessage iAccreditReaderIsUserInRolesCupaaFaultArgsFaultFaultMessage) {
            iAccreditReaderIsUserInRolesCupaaFaultArgsFaultFaultMessage.printStackTrace();
        }
    }
}
