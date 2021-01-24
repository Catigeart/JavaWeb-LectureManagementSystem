package com.uma.lecture.service.impl;

import com.uma.lecture.domain.Release;
import com.uma.lecture.domain.Website;
import com.uma.lecture.domain.WebsiteModel;
import com.uma.lecture.service.WebsiteService;
import com.uma.lecture.util.WebsiteUtil;

import java.util.List;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 0:06 2020/12/30
 */
public class WebsiteServiceImpl implements WebsiteService {

    @Override
    public boolean sendWebsite(Release release) {
        Website website = new Website();
        website.setRelease(release);
        website.setWebsiteModel(new WebsiteModel()); // TODO
        return WebsiteUtil.sendWebsite(website);
    }
}
