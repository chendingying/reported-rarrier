package com.reported.rarrier.model.ensure;

import javax.persistence.Column;
import javax.persistence.Table;
import java.sql.Date;

/**
 * Created by CDZ on 2018/12/10.
 */
@Table(name = "VApply")
public class VApply {
    @Column(name = "ApplyId")
    private String ApplyId;
    @Column(name = "EquipTypeCode")
    private String EquipTypeCode;
    @Column(name = "EquipNameCode")
    private String EquipNameCode;
    @Column(name = "ApplyNote")
    private String ApplyNote;
    @Column(name = "ApplySec")
    private String ApplySec;
    @Column(name = "ApplyLogon_Name")
    private String ApplyLogon_Name;
    @Column(name = "ApplyDisplayName")
    private String ApplyDisplayName;
    @Column(name = "FeedBackNote")
    private String FeedBackNote;
    @Column(name = "FBLogon_Name")
    private String  FBLogon_Name;
    @Column(name = "FBDisplayName")
    private String FBDisplayName;
    @Column(name = "EquipNameMess")
    private String EquipNameMess;
    @Column(name = "EquipTypeMess")
    private String EquipTypeMess;
    @Column(name = "TroubleCodeStr")
    private String TroubleCodeStr;
    @Column(name = "Sort")
    private String Sort;
    @Column(name = "EquipCustomsCode")
    private String EquipCustomsCode;
    @Column(name = "ApplyDept")
    private String ApplyDept;
    @Column(name = "ApplyDate")
    private Date ApplyDate;
    @Column(name = "FBDate")
    private Date FBDate;
    @Column(name = "SLTSection")
    private String SLTSection;
    @Column(name = "SolutionFlagName")
    private String SolutionFlagName;
    @Column(name = "SolutionFlag")
    private String SolutionFlag;
    @Column(name = "SectionName")
    private String SectionName;
    @Column(name = "ApplyPhone")
    private String ApplyPhone;
    @Column(name = "SLDate")
    private Date SLDate;
    @Column(name = "SLDisplayName")
    private String SLDisplayName;
    @Column(name = "SLLogon_Name")
    private String SLLogon_Name;
    @Column(name = "FeedBackType")
    private String FeedBackType;
    @Column(name = "ApplyOU")
    private String ApplyOU;
    @Column(name = "FeedBackName")
    private String FeedBackName;
    @Column(name = "UploadFile")
    private String UploadFile;
    @Column(name = "CLDate")
    private Date  CLDate;
    @Column(name = "FaultID")
    private String FaultID;
    @Column(name = "Total")
    private String Total;
    @Column(name = "equip")
    private String equip;
    @Column(name = "FaultName")
    private String FaultName;
    @Column(name = "FaultType")
    private String FaultType;
    @Column(name = "TroubleMess")
    private String TroubleMess;

    public String getApplyId() {
        if(ApplyId == null){
            return ApplyId;
        }else{}
        return ApplyId.trim();
    }

    public void setApplyId(String applyId) {
        ApplyId = applyId;
    }

    public String getEquipTypeCode() {
        if(EquipTypeCode == null){
            return EquipTypeCode;
        }
        return EquipTypeCode.trim();
    }

    public void setEquipTypeCode(String equipTypeCode) {
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

    public String getApplyNote() {
        if(ApplyNote == null){
            return ApplyNote;
        }
        return ApplyNote.trim();
    }

    public void setApplyNote(String applyNote) {
        ApplyNote = applyNote;
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



    public String getApplyDisplayName() {
        if(ApplyDisplayName == null){
            return ApplyDisplayName;
        }
        return ApplyDisplayName.trim();
    }

    public void setApplyDisplayName(String applyDisplayName) {
        ApplyDisplayName = applyDisplayName;
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

    public String getApplyLogon_Name() {
        if(ApplyLogon_Name == null){
            return ApplyLogon_Name;
        }
        return ApplyLogon_Name.trim();
    }

    public void setApplyLogon_Name(String applyLogon_Name) {
        ApplyLogon_Name = applyLogon_Name;
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

    public String getEquipNameMess() {
        if(EquipNameMess == null){
            return EquipNameMess;
        }
        return EquipNameMess.trim();
    }

    public void setEquipNameMess(String equipNameMess) {
        EquipNameMess = equipNameMess;
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

    public String getEquipTypeMess() {
        if(EquipTypeMess == null){
            return EquipTypeMess;
        }
        return EquipTypeMess.trim();
    }

    public void setEquipTypeMess(String equipTypeMess) {
        EquipTypeMess = equipTypeMess;
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

    public String getEquipCustomsCode() {
        if(EquipCustomsCode == null){
            return EquipCustomsCode;
        }
        return EquipCustomsCode.trim();
    }

    public void setEquipCustomsCode(String equipCustomsCode) {
        EquipCustomsCode = equipCustomsCode;
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

    public Date getApplyDate() {
        return ApplyDate;
    }

    public void setApplyDate(Date applyDate) {
        ApplyDate = applyDate;
    }

    public Date getFBDate() {
        return FBDate;
    }

    public void setFBDate(Date FBDate) {
        this.FBDate = FBDate;
    }

    public String getSLTSection() {
        if(SLTSection == null){
            return SLTSection;
        }
        return SLTSection.trim();
    }

    public void setSLTSection(String SLTSection) {
        this.SLTSection = SLTSection;
    }

    public String getSolutionFlagName() {
        if(SolutionFlagName == null){
            return SolutionFlagName;
        }
        return SolutionFlagName.trim();
    }

    public void setSolutionFlagName(String solutionFlagName) {
        SolutionFlagName = solutionFlagName;
    }

    public String getSolutionFlag() {
        if(SolutionFlag == null){
            return SolutionFlag;
        }
        return SolutionFlag.trim();
    }

    public void setSolutionFlag(String solutionFlag) {
        SolutionFlag = solutionFlag;
    }

    public String getSectionName() {
        if(SectionName == null){
            return SectionName;
        }
        return SectionName.trim();
    }

    public void setSectionName(String sectionName) {
        SectionName = sectionName;
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

    public Date getSLDate() {
        return SLDate;
    }

    public void setSLDate(Date SLDate) {
        this.SLDate = SLDate;
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

    public String getSLLogon_Name() {
        if(SLLogon_Name == null){
            return SLLogon_Name;
        }
        return SLLogon_Name.trim();
    }

    public void setSLLogon_Name(String SLLogon_Name) {
        this.SLLogon_Name = SLLogon_Name;
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

    public String getApplyOU() {
        if(ApplyOU == null){
            return ApplyOU;
        }
        return ApplyOU.trim();
    }

    public void setApplyOU(String applyOU) {
        ApplyOU = applyOU;
    }

    public String getFeedBackName() {
        if(FeedBackName == null){
            return FeedBackName;
        }
        return FeedBackName.trim();
    }

    public void setFeedBackName(String feedBackName) {
        FeedBackName = feedBackName;
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

    public String getFaultID() {
        if(FaultID == null){
            return FaultID;
        }
        return FaultID.trim();
    }

    public void setFaultID(String faultID) {
        FaultID = faultID;
    }

    public String getTotal() {
        if(Total == null){
            return Total;
        }
        return Total.trim();
    }

    public void setTotal(String total) {
        Total = total;
    }

    public String getEquip() {
        if(equip == null){
            return equip;
        }
        return equip.trim();
    }

    public void setEquip(String equip) {
        this.equip = equip;
    }

    public String getFaultName() {
        if(FaultName == null){
            return FaultName;
        }
        return FaultName.trim();
    }

    public void setFaultName(String faultName) {
        FaultName = faultName;
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

    public String getTroubleMess() {
        if(TroubleMess == null){
            return TroubleMess;
        }
        return TroubleMess.trim();
    }

    public void setTroubleMess(String troubleMess) {
        TroubleMess = troubleMess;
    }
}
