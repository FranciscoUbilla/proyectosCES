package com.tatf.adminCes.profileDetails;

import com.tatf.core.browser.IBrowser;

public class ProfileDetailsTask {

    private final IBrowser browser;
    private final ProfileDetailsPO profile;
    ;
    public ProfileDetailsTask (IBrowser browser){
        this.browser = browser;
        this.profile = new ProfileDetailsPO(browser);
    }

    public String getEmailUser(){
        return profile.getEmailProfileUser();
    }
}
