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
    private String equipNameCode;
    //设备名称
    @Column(name = "EquipNameMess")
    private String equipNameMess;

    public String getEquipNameCode() {
        if(equipNameCode == null){
            return equipNameCode;
        }
        return equipNameCode.trim();
    }

    public void setEquipNameCode(String equipNameCode) {
        this.equipNameCode = equipNameCode;
    }

    public String getEquipNameMess() {
        if(equipNameMess == null){
            return equipNameMess;
        }
        return equipNameMess.trim();
    }

    public void setEquipNameMess(String equipNameMess) {
        this.equipNameMess = equipNameMess;
    }
}
