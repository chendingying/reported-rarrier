package com.reported.rarrier.model.ensure;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * Created by CDZ on 2018/12/8.
 */
@Table(name = "EquipName")
public class EquipName {
    //设备名称编号
    @Column(name = "EquipNameCode")
    private String EquipNameCode;
    //设备名称
    @Column(name = "EquipNameMess")
    private String EquipNameMess;

    public String getEquipNameCode() {
        return EquipNameCode;
    }

    public void setEquipNameCode(String equipNameCode) {
        EquipNameCode = equipNameCode;
    }

    public String getEquipNameMess() {
        return EquipNameMess;
    }

    public void setEquipNameMess(String equipNameMess) {
        EquipNameMess = equipNameMess;
    }
}
