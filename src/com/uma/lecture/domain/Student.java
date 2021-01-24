package com.uma.lecture.domain;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 9:19 2020/12/29
 */
public class Student extends Person {

    private Integer workingYear;
    private String lectureId;

    public Integer getWorkingYear() {
        return workingYear;
    }

    public void setWorkingYear(Integer workingYear) {
        this.workingYear = workingYear;
    }

    public String getLectureId() {
        return lectureId;
    }

    public void setLectureId(String lectureId) {
        this.lectureId = lectureId;
    }
}
