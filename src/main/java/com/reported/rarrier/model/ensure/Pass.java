package com.reported.rarrier.model.ensure;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Author: cdy
 * @Date: 2019/2/27 11:48
 * @Version 1.0
 */
@Table(name = "Pass")
public class Pass {

    @Id
    @Column(name = "pkid")
    private Integer pkid;

    @Column(name = "ApplyId")
    private Integer applyId;

    @Column(name = "SLTSection")
    private String sLTSection;

    @Column(name = "PassNote")
    private String passNote;

    @Column(name = "Logon_Name")
    private String logon_Name;

    @Column(name = "Display_Name")
    private String display_Name;

    @Column(name = "PassTime")
    private Date passTime;

    public Integer getPkid() {
        return pkid;
    }

    public void setPkid(Integer pkid) {
        this.pkid = pkid;
    }

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
    }

    public String getsLTSection() {
        if(sLTSection == null){
            return sLTSection;
        }
        return sLTSection.trim();
    }

    public void setsLTSection(String sLTSection) {
        this.sLTSection = sLTSection;
    }

    public String getPassNote() {
        return passNote;
    }

    public void setPassNote(String passNote) {
        this.passNote = passNote;
    }

    public String getLogon_Name() {
        return logon_Name;
    }

    public void setLogon_Name(String logon_Name) {
        this.logon_Name = logon_Name;
    }

    public String getDisplay_Name() {
        return display_Name;
    }

    public void setDisplay_Name(String display_Name) {
        this.display_Name = display_Name;
    }

    public Date getPassTime() {
        return passTime;
    }

    public void setPassTime(Date passTime) {
        this.passTime = passTime;
    }
}
