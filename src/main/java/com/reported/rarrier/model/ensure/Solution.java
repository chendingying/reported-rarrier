package com.reported.rarrier.model.ensure;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by CDZ on 2018/12/13.
 */
@Table(name = "Solution")
public class Solution {

    @Column(name = "SolutionId")
    Integer solutionId;
    @Column(name = "ApplyId")
    String applyId;
    @Column(name = "SLTSection")
    String sLTSection;
    @Column(name = "SNote")
    String sNote;
    @Column(name = "SLTDate")
    Date sLTDate;
    @Column(name = "Logon_Name")
    String logon_Name;
    @Column(name = "Display_Name")
    String display_Name;
    @Column(name = "SolutionFlag")
    Integer solutionFlag;

    public Integer getSolutionId() {
        return solutionId;
    }

    public void setSolutionId(Integer solutionId) {
        this.solutionId = solutionId;
    }

    public String getApplyId() {
        if(applyId == null){
            return applyId;
        }
        return applyId.trim();
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public String getsLTSection() {
        return sLTSection;
    }

    public void setsLTSection(String sLTSection) {
        this.sLTSection = sLTSection;
    }

    public String getsNote() {
        return sNote;
    }

    public void setsNote(String sNote) {
        this.sNote = sNote;
    }

    public Date getsLTDate() {
        return sLTDate;
    }

    public void setsLTDate(Date sLTDate) {
        this.sLTDate = sLTDate;
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

    public Integer getSolutionFlag() {
        return solutionFlag;
    }

    public void setSolutionFlag(Integer solutionFlag) {
        this.solutionFlag = solutionFlag;
    }
}
