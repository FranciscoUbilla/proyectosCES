package com.tatf.adminCes.profileDetails;

import com.tatf.core.browser.IBrowser;

public class ProfileDetailsPO {
    private final IBrowser browser;
    private final String ADMINCES_PROFILEDETAILS_EMAIL_INPUT = ".card-body > div:nth-of-type(3) input";
    public ProfileDetailsPO(IBrowser browser){
        this.browser = browser;
    }
    public String getEmailProfileUser(){
        return  browser.find().css(ADMINCES_PROFILEDETAILS_EMAIL_INPUT).getAttribute("value");

    }
}
