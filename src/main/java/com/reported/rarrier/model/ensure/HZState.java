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
    private Integer hZS_ID;

    @Column(name = "HZS_Name")
    private String hZS_Name;

    public Integer gethZS_ID() {
        return hZS_ID;
    }

    public void sethZS_ID(Integer hZS_ID) {
        this.hZS_ID = hZS_ID;
    }

    public String gethZS_Name() {
        if(hZS_Name == null){
            return hZS_Name;
        }
        return hZS_Name.trim();
    }

    public void sethZS_Name(String hZS_Name) {
        this.hZS_Name = hZS_Name;
    }
}
