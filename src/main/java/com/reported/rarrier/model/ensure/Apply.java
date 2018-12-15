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

    @Transient
    private Date ApplyDateBegin;

    @Transient
    private Date ApplyDateEnd;


    public Date getApplyDateBegin() {
        return ApplyDateBegin;
    }

    public void setApplyDateBegin(Date ApplyDateBegin) {
        this.ApplyDateBegin = ApplyDateBegin;
    }

    public Date getApplyDateEnd() {
        return ApplyDateEnd;
    }

    public void setApplyDateEnd(Date ApplyDateEnd) {
        this.ApplyDateEnd = ApplyDateEnd;
    }

    public Integer getApplyId() {
        return ApplyId;
    }

    public void setApplyId(Integer ApplyId) {
        this.ApplyId = ApplyId;
    }

    public Integer getEquipTypeCode() {
        return EquipTypeCode;
    }

    public void setEquipTypeCode(Integer EquipTypeCode) {
        this.EquipTypeCode = EquipTypeCode;
    }

    public String getEquipNameCode() {
        return EquipNameCode;
    }

    public void setEquipNameCode(String EquipNameCode) {
        this.EquipNameCode = EquipNameCode;
    }

    public String getEquipCustomsCode() {
        if(EquipNameCode == null){
            return EquipCustomsCode;
        }
        return EquipCustomsCode.trim();
    }

    public void setEquipCustomsCode(String EquipCustomsCode) {
        this.EquipCustomsCode = EquipCustomsCode;
    }

    public String getApplyNote() {
        if(ApplyNote == null){
            return ApplyNote;
        }
        return ApplyNote.trim();
    }

    public void setApplyNote(String ApplyNote) {
        this.ApplyNote = ApplyNote;
    }

    public String getApplyDept() {
        if(ApplyDept == null){
            return ApplyDept;
        }
        return ApplyDept.trim();
    }

    public void setApplyDept(String ApplyDept) {
        this.ApplyDept = ApplyDept;
    }

    public String getApplyOU() {
        if(ApplyOU == null){
            return ApplyOU;
        }
        return ApplyOU.trim();
    }

    public void setApplyOU(String ApplyOU) {
        this.ApplyOU = ApplyOU;
    }

    public String getApplySec() {
        if(ApplySec == null){
            return ApplySec;
        }
        return ApplySec.trim();
    }

    public void setApplySec(String ApplySec) {
        this.ApplySec = ApplySec;
    }

    public String getApplyLogon_Name() {
        if(ApplyLogon_Name == null){
            return ApplyLogon_Name;
        }
        return ApplyLogon_Name.trim();
    }

    public void setApplyLogon_Name(String ApplyLogon_Name) {
        this.ApplyLogon_Name = ApplyLogon_Name;
    }

    public String getApplyDisplayName() {
        if(ApplyDisplayName == null){
            return ApplyDisplayName;
        }
        return ApplyDisplayName.trim();
    }

    public void setApplyDisplayName(String ApplyDisplayName) {
        this.ApplyDisplayName = ApplyDisplayName;
    }

    public Date getApplyDate() {
        return ApplyDate;
    }

    public void setApplyDate(Date ApplyDate) {
        this.ApplyDate = ApplyDate;
    }

    public String getApplyPhone() {
        if(ApplyPhone == null){
            return ApplyPhone;
        }
        return ApplyPhone.trim();
    }

    public void setApplyPhone(String ApplyPhone) {
        this.ApplyPhone = ApplyPhone;
    }

    public String getFeedBackType() {
        if(FeedBackType == null){
            return FeedBackType;
        }
        return FeedBackType.trim();
    }

    public void setFeedBackType(String FeedBackType) {
        this.FeedBackType = FeedBackType;
    }

    public String getFeedBackNote() {
        if(FeedBackNote == null){
            return FeedBackNote;
        }
        return FeedBackNote.trim();
    }

    public void setFeedBackNote(String FeedBackNote) {
        this.FeedBackNote = FeedBackNote;
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

    public void setSolutionFlag(Integer SolutionFlag) {
        this.SolutionFlag = SolutionFlag;
    }

    public String getTroubleCodeStr() {
        if(TroubleCodeStr == null){
            return TroubleCodeStr;
        }
        return TroubleCodeStr.trim();
    }

    public void setTroubleCodeStr(String TroubleCodeStr) {
        this.TroubleCodeStr = TroubleCodeStr;
    }

    public String getSort() {
        if(Sort == null){
            return Sort;
        }
        return Sort.trim();
    }

    public void setSort(String Sort) {
        this.Sort = Sort;
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

    public void setUploadFile(String UploadFile) {
        this.UploadFile = UploadFile;
    }

    public Date getCLDate() {
        return CLDate;
    }

    public void setCLDate(Date CLDate) {
        this.CLDate = CLDate;
    }
}
