package com.reported.rarrier.model.ensure;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @Author: cdy
 * @Date: 2019/2/23 13:26
 * @Version 1.0
 */
@Table(name = "FaultType")
public class FaultType {

    @Column(name = "FaultTypeID")
    private Integer faultTypeID;

    @Column(name = "FaultType")
    private String faultType;

    public Integer getFaultTypeID() {
        return faultTypeID;
    }

    public void setFaultTypeID(Integer faultTypeID) {
        this.faultTypeID = faultTypeID;
    }

    public String getFaultType() {
        if(faultType == null){
            return faultType;
        }
        return faultType.trim();
    }

    public void setFaultType(String faultType) {
        this.faultType = faultType;
    }
}
