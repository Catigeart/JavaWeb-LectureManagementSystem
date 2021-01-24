package com.uma.lecture.domain;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 9:16 2020/12/29
 */
public class Organization {

    private String id;
    private String name;
    private String type;
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
