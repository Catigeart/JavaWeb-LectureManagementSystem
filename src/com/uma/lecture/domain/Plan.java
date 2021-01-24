package com.uma.lecture.domain;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 9:33 2020/12/29
 */
public class Plan {

    private String id;
    private String topic;
    private String location;
    private String time;
    private String description;
    private String expert;
    private String expertDescription;
    private boolean done;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExpert() {
        return expert;
    }

    public void setExpert(String expert) {
        this.expert = expert;
    }

    public String getExpertDescription() {
        return expertDescription;
    }

    public void setExpertDescription(String expertDescription) {
        this.expertDescription = expertDescription;
    }

    public boolean isDone() { // 布尔类型优先isXXX
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
