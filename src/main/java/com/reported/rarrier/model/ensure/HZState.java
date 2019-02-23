package com.reported.rarrier.model.ensure;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @Author: cdy
 * @Date: 2019/2/23 14:03
 * @Version 1.0
 */
@Table(name = "HZ_State")
public class HZState {
    @Column(name = "HZS_ID")
    private Integer HZS_ID;

    @Column(name = "HZS_Name")
    private String HZS_Name;

    public Integer getHZS_ID() {
        return HZS_ID;
    }

    public void setHZS_ID(Integer HZS_ID) {
        this.HZS_ID = HZS_ID;
    }

    public String getHZS_Name() {
        return HZS_Name;
    }

    public void setHZS_Name(String HZS_Name) {
        this.HZS_Name = HZS_Name;
    }
}
