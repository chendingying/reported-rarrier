package com.reported.rarrier.model.ensure;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

/**
 * Created by CDZ on 2018/12/7.
 */
@Table(name = "Apply")
public class Apply {

    @Id
    @Column(name = "ApplyId")
    private Integer applyId;

    @Column(name = "EquipTypeCode")
    private Integer equipTypeCode;

    @Column(name = "EquipNameCode")
    private String equipNameCode;

    @Column(name = "EquipCustomsCode")
    private String equipCustomsCode;

    @Column(name = "ApplyNote")
    private String applyNote;

    @Column(name = "ApplyDept")
    private String applyDept;

    @Column(name = "ApplyOU")
    private String applyOU;

    @Column(name = "ApplySec")
    private String applySec;

    @Column(name = "ApplyLogon_Name")
    private String applyLogon_Name;

    @Column(name = "ApplyDisplayName")
    private String applyDisplayName;

    @Column(name = "ApplyDate")
    private Date applyDate;

    @Column(name = "ApplyPhone")
    private String applyPhone;

    @Column(name = "FeedBackType")
    private String feedBackType;

    @Column(name = "FeedBackNote")
    private String  feedBackNote;

    @Column(name = "FBLogon_Name")
    private String fBLogon_Name;

    @Column(name = "FBDisplayName")
    private String fBDisplayName;

    @Column(name = "FBDate")
    private Date fBDate;

    @Column(name = "SLTSection")
    private Integer sLTSection;

    @Column(name = "SolutionFlag")
    private Integer solutionFlag;

    @Column(name = "TroubleCodeStr")
    private String troubleCodeStr;

    @Column(name = "Sort")
    private String sort;

    @Column(name = "SLLogon_Name")
    private String sLLogon_Name;

    @Column(name = "SLDisplayName")
    private String sLDisplayName;

    @Column(name = "SLDate")
    private Date sLDate;

    @Column(name = "UploadFile")
    private String uploadFile;

    @Column(name = "CLDate")
    private Date cLDate;

    @Transient
    private Date applyDateBegin;

    @Transient
    private Date applyDateEnd;


    public Date getApplyDateBegin() {
        return applyDateBegin;
    }

    public void setApplyDateBegin(Date applyDateBegin) {
        this.applyDateBegin = applyDateBegin;
    }

    public Date getApplyDateEnd() {
        return applyDateEnd;
    }

    public void setApplyDateEnd(Date applyDateEnd) {
        this.applyDateEnd = applyDateEnd;
    }

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
    }

    public Integer getEquipTypeCode() {
        return equipTypeCode;
    }

    public void setEquipTypeCode(Integer equipTypeCode) {
        this.equipTypeCode = equipTypeCode;
    }

    public String getEquipNameCode() {
        return equipNameCode;
    }

    public void setEquipNameCode(String equipNameCode) {
        this.equipNameCode = equipNameCode;
    }

    public String getEquipCustomsCode() {
        if(equipNameCode == null){
            return equipCustomsCode;
        }
        return equipCustomsCode.trim();
    }

    public void setEquipCustomsCode(String equipCustomsCode) {
        this.equipCustomsCode = equipCustomsCode;
    }

    public String getApplyNote() {
        if(applyNote == null){
            return applyNote;
        }
        return applyNote.trim();
    }

    public void setApplyNote(String applyNote) {
        this.applyNote = applyNote;
    }

    public String getApplyDept() {
        if(applyDept == null){
            return applyDept;
        }
        return applyDept.trim();
    }

    public void setApplyDept(String applyDept) {
        this.applyDept = applyDept;
    }

    public String getApplyOU() {
        if(applyOU == null){
            return applyOU;
        }
        return applyOU.trim();
    }

    public void setApplyOU(String applyOU) {
        this.applyOU = applyOU;
    }

    public String getApplySec() {
        if(applySec == null){
            return applySec;
        }
        return applySec.trim();
    }

    public void setApplySec(String applySec) {
        this.applySec = applySec;
    }

    public String getApplyLogon_Name() {
        if(applyLogon_Name == null){
            return applyLogon_Name;
        }
        return applyLogon_Name.trim();
    }

    public void setApplyLogon_Name(String applyLogon_Name) {
        this.applyLogon_Name = applyLogon_Name;
    }

    public String getApplyDisplayName() {
        if(applyDisplayName == null){
            return applyDisplayName;
        }
        return applyDisplayName.trim();
    }

    public void setApplyDisplayName(String applyDisplayName) {
        this.applyDisplayName = applyDisplayName;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getApplyPhone() {
        if(applyPhone == null){
            return applyPhone;
        }
        return applyPhone.trim();
    }

    public void setApplyPhone(String applyPhone) {
        this.applyPhone = applyPhone;
    }

    public String getFeedBackType() {
        if(feedBackType == null){
            return feedBackType;
        }
        return feedBackType.trim();
    }

    public void setFeedBackType(String feedBackType) {
        this.feedBackType = feedBackType;
    }

    public String getFeedBackNote() {
        if(feedBackNote == null){
            return feedBackNote;
        }
        return feedBackNote.trim();
    }

    public void setFeedBackNote(String feedBackNote) {
        this.feedBackNote = feedBackNote;
    }

    public String getfBLogon_Name() {
        if(fBLogon_Name == null){
            return fBLogon_Name;
        }
        return fBLogon_Name.trim();
    }

    public void setfBLogon_Name(String fBLogon_Name) {
        this.fBLogon_Name = fBLogon_Name;
    }

    public String getfBDisplayName() {
        if(fBDisplayName == null){
            return fBDisplayName;
        }
        return fBDisplayName.trim();
    }

    public void setfBDisplayName(String fBDisplayName) {
        this.fBDisplayName = fBDisplayName;
    }

    public Date getfBDate() {
        return fBDate;
    }

    public void setfBDate(Date fBDate) {
        this.fBDate = fBDate;
    }

    public Integer getsLTSection() {
        return sLTSection;
    }

    public void setsLTSection(Integer sLTSection) {
        this.sLTSection = sLTSection;
    }

    public Integer getSolutionFlag() {
        return solutionFlag;
    }

    public void setSolutionFlag(Integer solutionFlag) {
        this.solutionFlag = solutionFlag;
    }

    public String getTroubleCodeStr() {
        if(troubleCodeStr == null){
            return troubleCodeStr;
        }
        return troubleCodeStr.trim();
    }

    public void setTroubleCodeStr(String troubleCodeStr) {
        this.troubleCodeStr = troubleCodeStr;
    }

    public String getSort() {
        if(sort == null){
            return sort;
        }
        return sort.trim();
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getsLLogon_Name() {
        if(sLLogon_Name == null){
            return sLLogon_Name;
        }
        return sLLogon_Name.trim();
    }

    public void setsLLogon_Name(String sLLogon_Name) {
        this.sLLogon_Name = sLLogon_Name;
    }

    public String getsLDisplayName() {
        if(sLDisplayName == null){
            return sLDisplayName;
        }
        return sLDisplayName.trim();
    }

    public void setsLDisplayName(String sLDisplayName) {
        this.sLDisplayName = sLDisplayName;
    }

    public Date getsLDate() {
        return sLDate;
    }

    public void setsLDate(Date sLDate) {
        this.sLDate = sLDate;
    }

    public String getUploadFile() {
        if(uploadFile == null){
            return uploadFile;
        }
        return uploadFile.trim();
    }

    public void setUploadFile(String uploadFile) {
        this.uploadFile = uploadFile;
    }

    public Date getcLDate() {
        return cLDate;
    }

    public void setcLDate(Date cLDate) {
        this.cLDate = cLDate;
    }
}
