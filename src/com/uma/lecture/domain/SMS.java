package com.uma.lecture.domain;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 9:11 2020/12/29
 */
public class SMS {

    private String id;
    private String receiver;
    private SMSModel smsModel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public SMSModel getSmsModel() {
        return smsModel;
    }

    public void setSmsModel(SMSModel smsModel) {
        this.smsModel = smsModel;
    }
}
