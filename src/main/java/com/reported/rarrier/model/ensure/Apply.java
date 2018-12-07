package com.reported.rarrier.model.ensure;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by CDZ on 2018/12/7.
 */
@Table(name = "Apply")
public class Apply {
    @Column(name = "ApplyId")
    private Integer ApplyId;

    @Column(name = "EquipTypeCode")
    private Integer EquipTypeCode;

    @Column(name = "EquipNameCode")
    private String EquipNameCode;

    @Column(name = "EquipCustomsCode")
    private String EquipCustomsCode;

    @Column(name = "ApplyNote")
    private String ApplyNote;

    @Column(name = "ApplyDept")
    private String ApplyDept;

    @Column(name = "ApplyOU")
    private String ApplyOU;

    @Column(name = "ApplySec")
    private String ApplySec;

    @Column(name = "ApplyLogon_Name")
    private String ApplyLogon_Name;

    @Column(name = "ApplyDisplayName")
    private String ApplyDisplayName;

    @Column(name = "ApplyDate")
    private Date ApplyDate;

    @Column(name = "ApplyPhone")
    private String ApplyPhone;

    @Column(name = "FeedBackType")
    private String FeedBackType;

    @Column(name = "FeedBackNote")
    private String  FeedBackNote;

    @Column(name = "FBLogon_Name")
    private String FBLogon_Name;

    @Column(name = "FBDisplayName")
    private String FBDisplayName;

    @Column(name = "FBDate")
    private Date FBDate;

    @Column(name = "SLTSection")
    private Integer SLTSection;

    @Column(name = "SolutionFlag")
    private Integer SolutionFlag;

    @Column(name = "TroubleCodeStr")
    private String TroubleCodeStr;

    @Column(name = "Sort")
    private String Sort;

    @Column(name = "SLLogon_Name")
    private String SLLogon_Name;

    @Column(name = "SLDisplayName")
    private String SLDisplayName;

    @Column(name = "SLDate")
    private Date SLDate;

    @Column(name = "UploadFile")
    private String UploadFile;

    @Column(name = "CLDate")
    private Date CLDate;

    public Integer getApplyId() {
        return ApplyId;
    }

    public void setApplyId(Integer applyId) {
        ApplyId = applyId;
    }

    public Integer getEquipTypeCode() {
        return EquipTypeCode;
    }

    public void setEquipTypeCode(Integer equipTypeCode) {
        EquipTypeCode = equipTypeCode;
    }

    public String getEquipNameCode() {
        if(EquipNameCode == null){
            return EquipNameCode;
        }
        return EquipNameCode.trim();
    }

    public void setEquipNameCode(String equipNameCode) {
        EquipNameCode = equipNameCode;
    }

    public String getEquipCustomsCode() {
        if(EquipNameCode == null){
            return EquipNameCode;
        }
        return EquipNameCode.trim();
    }

    public void setEquipCustomsCode(String equipCustomsCode) {
        EquipCustomsCode = equipCustomsCode;
    }

    public String getApplyNote() {
        if(ApplyNote == null){
            return ApplyNote;
        }
        return ApplyNote.trim();
    }

    public void setApplyNote(String applyNote) {
        ApplyNote = applyNote;
    }

    public String getApplyDept() {
        if(ApplyDept == null){
            return ApplyDept;
        }
        return ApplyDept.trim();
    }

    public void setApplyDept(String applyDept) {
        ApplyDept = applyDept;
    }

    public String getApplyOU() {
        if(ApplyOU == null){
            return ApplyOU;
        }
        return ApplyOU.trim();
    }

    public void setApplyOU(String applyOU) {
        ApplyOU = applyOU;
    }

    public String getApplySec() {
        if(ApplySec == null){
            return ApplySec;
        }
        return ApplySec.trim();
    }

    public void setApplySec(String applySec) {
        ApplySec = applySec;
    }

    public String getApplyLogon_Name() {
        if(ApplyLogon_Name == null){
            return ApplyLogon_Name;
        }
        return ApplyLogon_Name.trim();
    }

    public void setApplyLogon_Name(String applyLogon_Name) {
        ApplyLogon_Name = applyLogon_Name;
    }

    public String getApplyDisplayName() {
        if(ApplyDisplayName == null){
            return ApplyDisplayName;
        }
        return ApplyDisplayName.trim();
    }

    public void setApplyDisplayName(String applyDisplayName) {
        ApplyDisplayName = applyDisplayName;
    }

    public Date getApplyDate() {
        return ApplyDate;
    }

    public void setApplyDate(Date applyDate) {
        ApplyDate = applyDate;
    }

    public String getApplyPhone() {
        if(ApplyPhone == null){
            return ApplyPhone;
        }
        return ApplyPhone.trim();
    }

    public void setApplyPhone(String applyPhone) {
        ApplyPhone = applyPhone;
    }

    public String getFeedBackType() {
        if(FeedBackType == null){
            return FeedBackType;
        }
        return FeedBackType.trim();
    }

    public void setFeedBackType(String feedBackType) {
        FeedBackType = feedBackType;
    }

    public String getFeedBackNote() {
        if(FeedBackNote == null){
            return FeedBackNote;
        }
        return FeedBackNote.trim();
    }

    public void setFeedBackNote(String feedBackNote) {
        FeedBackNote = feedBackNote;
    }

    public String getFBLogon_Name() {
        if(FBLogon_Name == null){
            return FBLogon_Name;
        }
        return FBLogon_Name.trim();
    }

    public void setFBLogon_Name(String FBLogon_Name) {
        this.FBLogon_Name = FBLogon_Name;
    }

    public String getFBDisplayName() {
        if(FBDisplayName == null){
            return FBDisplayName;
        }
        return FBDisplayName.trim();
    }

    public void setFBDisplayName(String FBDisplayName) {
        this.FBDisplayName = FBDisplayName;
    }

    public Date getFBDate() {
        return FBDate;
    }

    public void setFBDate(Date FBDate) {
        this.FBDate = FBDate;
    }

    public Integer getSLTSection() {
        return SLTSection;
    }

    public void setSLTSection(Integer SLTSection) {
        this.SLTSection = SLTSection;
    }

    public Integer getSolutionFlag() {
        return SolutionFlag;
    }

    public void setSolutionFlag(Integer solutionFlag) {
        SolutionFlag = solutionFlag;
    }

    public String getTroubleCodeStr() {
        if(TroubleCodeStr == null){
            return TroubleCodeStr;
        }
        return TroubleCodeStr.trim();
    }

    public void setTroubleCodeStr(String troubleCodeStr) {
        TroubleCodeStr = troubleCodeStr;
    }

    public String getSort() {
        if(Sort == null){
            return Sort;
        }
        return Sort.trim();
    }

    public void setSort(String sort) {
        Sort = sort;
    }

    public String getSLLogon_Name() {
        if(SLLogon_Name == null){
            return SLLogon_Name;
        }
        return SLLogon_Name.trim();
    }

    public void setSLLogon_Name(String SLLogon_Name) {
        this.SLLogon_Name = SLLogon_Name;
    }

    public String getSLDisplayName() {
        if(SLDisplayName == null){
            return SLDisplayName;
        }
        return SLDisplayName.trim();
    }

    public void setSLDisplayName(String SLDisplayName) {
        this.SLDisplayName = SLDisplayName;
    }

    public Date getSLDate() {
        return SLDate;
    }

    public void setSLDate(Date SLDate) {
        this.SLDate = SLDate;
    }

    public String getUploadFile() {
        if(UploadFile == null){
            return UploadFile;
        }
        return UploadFile.trim();
    }

    public void setUploadFile(String uploadFile) {
        UploadFile = uploadFile;
    }

    public Date getCLDate() {
        return CLDate;
    }

    public void setCLDate(Date CLDate) {
        this.CLDate = CLDate;
    }
}
