package com.uma.lecture.domain;

import java.util.Date;
import java.util.List;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 9:12 2020/12/29
 */
public class Email {

    private Date date;
    private List<String> receiver;
    private EmailModel emailModel;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getReceiver() {
        return receiver;
    }

    public void setReceiver(List<String> receiver) {
        this.receiver = receiver;
    }

    public EmailModel getEmailModel() {
        return emailModel;
    }

    public void setEmailModel(EmailModel emailModel) {
        this.emailModel = emailModel;
    }
}
