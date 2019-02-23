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
    private Integer FaultTypeID;

    @Column(name = "FaultType")
    private String FaultType;

    public Integer getFaultTypeID() {
        return FaultTypeID;
    }

    public void setFaultTypeID(Integer faultTypeID) {
        FaultTypeID = faultTypeID;
    }

    public String getFaultType() {
        if(FaultType == null){
            return FaultType;
        }
        return FaultType.trim();
    }

    public void setFaultType(String faultType) {
        FaultType = faultType;
    }
}
