package com.uma.lecture.service.impl;

import com.uma.lecture.domain.Email;
import com.uma.lecture.domain.EmailModel;
import com.uma.lecture.domain.Release;
import com.uma.lecture.service.EmailService;
import com.uma.lecture.util.EmailUtil;

import java.util.Date;
import java.util.List;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 0:01 2020/12/30
 */
public class EmailServiceImpl implements EmailService {

    @Override
    public boolean sendEmail(List<String> studentIds) {
        Email email = new Email();
        email.setDate(new Date());
        email.setReceiver(studentIds);
        email.setEmailModel(new EmailModel()); // TODO
        return EmailUtil.sendEmail(email);
    }
}
