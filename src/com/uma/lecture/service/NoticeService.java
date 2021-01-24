package com.uma.lecture.service;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 23:27 2020/12/29
 */
public interface NoticeService {

    void recordSMSSending();

    void recordEmailSending();

    boolean sendSMS();

    boolean sendEmail();

}
