package com.reported.rarrier.sso;

import cn.gov.customs.casp.sdk.h4a.entity.ObjectParentOrganizations;
import cn.gov.customs.casp.sdk.h4a.entity.ObjectsDetail;

import java.util.List;

/**
 * @Author: cdy
 * @Date: 2019/1/7 10:54
 * @Version 1.0
 */
public class ObjectsDetailForm {

    private String userType;

    private Boolean userAdmin;

    private ObjectsDetail objectsDetail;

    public ObjectsDetailForm(ObjectsDetail objectsDetail){
        this.objectsDetail = objectsDetail;
    }



    public String getUserType() {
        return userType;
    }

    public Boolean getUserAdmin() {
        return userAdmin;
    }

    public void setUserAdmin(Boolean userAdmin) {
        this.userAdmin = userAdmin;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public ObjectsDetail getObjectsDetail() {
        return objectsDetail;
    }

    public void setObjectsDetail(ObjectsDetail objectsDetail) {
        this.objectsDetail = objectsDetail;
    }

}
