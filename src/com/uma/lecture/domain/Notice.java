package com.uma.lecture.domain;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 21:06 2020/12/28
 */
public class Notice {

    private String id;
    private String type;
    private boolean sented;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSented() { // 布尔类型优先isXXX
        return sented;
    }

    public void setSented(boolean sented) {
        this.sented = sented;
    }
}
