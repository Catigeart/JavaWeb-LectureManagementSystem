package com.uma.lecture.domain;

import java.util.Date;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 9:24 2020/12/29
 */
public class Lecture {

    private String id;
    private String planId;
    private String name;
    private String topic;
    private Expert expert;
    private String location;
    private String introduction;
    private String host;
    private Integer studentNumber;
    private Integer maxStudentNumber;
    private Date beginTime;
    private Date endTime;
    private EntryRequirement entryRequirement;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Expert getExpert() {
        return expert;
    }

    public void setExpert(Expert expert) {
        this.expert = expert;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Integer getMaxStudentNumber() {
        return maxStudentNumber;
    }

    public void setMaxStudentNumber(Integer maxStudentNumber) {
        this.maxStudentNumber = maxStudentNumber;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public EntryRequirement getEntryRequirement() {
        return entryRequirement;
    }

    public void setEntryRequirement(EntryRequirement entryRequirement) {
        this.entryRequirement = entryRequirement;
    }
}
