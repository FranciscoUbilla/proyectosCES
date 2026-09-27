package com.tatf.adminCes.viewUser.pom;

import com.tatf.adminCes.Selectors;
import com.tatf.core.browser.IBrowser;

public class ViewUserPO {
    private final IBrowser browser;
    public ViewUserPO (IBrowser browser) {this.browser = browser;}

    public void clickGoViewUsers(){
        browser.find().css(Selectors.ADMINCES_VIEWUSERS_GOTOVIEWUSERS_BUTTON).click();
    }
}
