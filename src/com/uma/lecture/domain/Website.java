package com.uma.lecture.domain;

import java.util.List;
import java.util.Map;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 9:38 2020/12/29
 */
public class Website {

    private Release release;
    private WebsiteModel websiteModel;

    public Release getRelease() {
        return release;
    }

    public void setRelease(Release release) {
        this.release = release;
    }

    public WebsiteModel getWebsiteModel() {
        return websiteModel;
    }

    public void setWebsiteModel(WebsiteModel websiteModel) {
        this.websiteModel = websiteModel;
    }
}
