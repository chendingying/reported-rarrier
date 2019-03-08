package com.reported.rarrier.sso;

import cn.gov.customs.casp.sdk.h4a.BeanReaderHelper;
import cn.gov.customs.casp.sdk.h4a.accredit.ws.IAccreditReaderIsUserInRolesCupaaFaultArgsFaultFaultMessage;
import cn.gov.customs.casp.sdk.h4a.accredit.ws.UserCategory;
import cn.gov.customs.casp.sdk.h4a.entity.ObjectsDetail;
import cn.gov.customs.casp.sdk.h4a.enumdefines.AccreditCategory;
import cn.gov.customs.casp.sdk.h4a.enumdefines.DelegationCategories;
import cn.gov.customs.casp.sdk.h4a.passport.IAccreditBeanReader;
import com.reported.rarrier.util.ObjectRestResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author: cdy
 * @Date: 2019/1/7 10:54
 * @Version 1.0
 */
@Configuration
@RestController
@RequestMapping("/api/admin/sso")
public class SSOController {

    @Value("${jsp.url}")
    private String url;

    @GetMapping("/session")
    public ObjectRestResponse<ObjectsDetailForm> SSOSession(HttpServletRequest request, HttpServletResponse response) throws IOException, IAccreditReaderIsUserInRolesCupaaFaultArgsFaultFaultMessage {
        HttpSession session = request.getSession(true);
        ObjectsDetailForm objectsDetailForm = (ObjectsDetailForm)session.getAttribute("objectsDetailForm");
        ObjectRestResponse objectRestResponse = new ObjectRestResponse();
        if(objectsDetailForm != null){
            objectRestResponse.setData(objectsDetailForm);
        }else{
            Object o = request.getSession().getAttribute("user");
            if(o == null){
                objectRestResponse.setMessage("登录界面");
                objectRestResponse.setData(url);
            }else{
                ObjectsDetail objectDetail = new ObjectsDetail();
                ObjectsDetailForm objectsDetail = new ObjectsDetailForm(objectDetail);

                if(o instanceof  ObjectsDetail){
                    objectDetail = (ObjectsDetail)o;
                }
                IAccreditBeanReader acdit = BeanReaderHelper.getIAccreditBeanReader();
                Boolean systemAdmin  = acdit.isUserInRolesBean(objectDetail.getAll_path_name(),  UserCategory.USER_ALL_PATH_NAME, "",
                        cn.gov.customs.casp.sdk.h4a.accredit.ws.OrganizationCategory.NONE,"SJDX",
                        AccreditCategory.Code,"CCIC_VIEW",AccreditCategory.Code,"SYSTEM_ADMIN",AccreditCategory.Code, DelegationCategories.All
                );
                objectsDetail.setUserAdmin(systemAdmin);
                Boolean returnObject  = acdit.isUserInRolesBean(objectDetail.getAll_path_name(),  UserCategory.USER_ALL_PATH_NAME, "",
                        cn.gov.customs.casp.sdk.h4a.accredit.ws.OrganizationCategory.NONE,"SJDX",
                        AccreditCategory.Code,"CCIC_VIEW",AccreditCategory.Code,"DWYH",AccreditCategory.Code, DelegationCategories.All
                );

                if(returnObject){
                    objectsDetail.setUserType("dw");
                }else{
                    Boolean returnGLD  = acdit.isUserInRolesBean(objectDetail.getAll_path_name(),  UserCategory.USER_ALL_PATH_NAME, "",
                            cn.gov.customs.casp.sdk.h4a.accredit.ws.OrganizationCategory.NONE,"SJDX",
                            AccreditCategory.Code,"CCIC_VIEW",AccreditCategory.Code,"GRYH",AccreditCategory.Code,DelegationCategories.All
                    );
                    if(returnGLD){
                        objectsDetail.setUserType("gr");
                    }else{
                        objectsDetail.setUserType("无");
                    }
                }
                session.setAttribute("objectsDetailForm",objectsDetail);
                objectRestResponse.setMessage("重新获取数据");
                objectRestResponse.setData(objectsDetail);
            }

        }
        return objectRestResponse;
    }
}
