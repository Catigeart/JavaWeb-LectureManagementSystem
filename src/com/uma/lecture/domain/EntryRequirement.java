package com.uma.lecture.domain;

import java.util.Date;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 9:29 2020/12/29
 */
public class EntryRequirement {

    private Date latestDate;
    private Integer workingYear;
    private String job;

    public Date getLatestDate() {
        return latestDate;
    }

    public void setLatestDate(Date latestDate) {
        this.latestDate = latestDate;
    }

    public Integer getWorkingYear() {
        return workingYear;
    }

    public void setWorkingYear(Integer workingYear) {
        this.workingYear = workingYear;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
