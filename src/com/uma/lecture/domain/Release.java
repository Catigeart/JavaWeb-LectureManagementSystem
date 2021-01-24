package com.uma.lecture.domain;

import java.util.Date;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 9:21 2020/12/29
 */
public class Release {

    private String id;
    private String workerName;
    private String lectureId;
    private Date time;
    private boolean sentWebsite;
    private boolean sentEmail;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getLectureId() {
        return lectureId;
    }

    public void setLectureId(String lectureId) {
        this.lectureId = lectureId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public boolean isSentWebsite() {
        return sentWebsite;
    }

    public void setSentWebsite(boolean sentWebsite) {
        this.sentWebsite = sentWebsite;
    }

    public boolean isSentEmail() {
        return sentEmail;
    }

    public void setSentEmail(boolean sentEmail) {
        this.sentEmail = sentEmail;
    }
}
