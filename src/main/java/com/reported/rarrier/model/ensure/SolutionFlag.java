package com.reported.rarrier.model.ensure;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * Created by CDZ on 2018/12/8.
 */
@Table(name = "SolutionFlag")
public class SolutionFlag {
    @Column(name = "SolutionFlagCode")
    private String SolutionFlagCode;

    @Column(name = "SolutionFlag")
    private String SolutionFlag;

    public String getSolutionFlagCode() {
        if(SolutionFlagCode == null){
            return SolutionFlagCode;
        }
        return SolutionFlagCode.trim();
    }

    public void setSolutionFlagCode(String solutionFlagCode) {
        SolutionFlagCode = solutionFlagCode;
    }

    public String getSolutionFlag() {
        return SolutionFlag;
    }

    public void setSolutionFlag(String solutionFlag) {
        SolutionFlag = solutionFlag;
    }
}
