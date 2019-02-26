package com.reported.rarrier.model.ensure;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: cdy
 * @Date: 2019/2/26 15:26
 * @Version 1.0
 */
@Table(name = "SectionName")
public class SectionName {
    @Id
    @Column(name = "SectionId")
    private Integer sectionId;

    @Column(name = "SectionName")
    private String sectionName;

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }
}
