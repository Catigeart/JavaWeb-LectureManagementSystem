package com.uma.lecture.domain;

import java.util.Date;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 9:20 2020/12/29
 */
public class Expert extends Person {

    private String address;
    private String area;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
