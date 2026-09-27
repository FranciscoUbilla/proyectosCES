package com.tatf.adminCes.viewUser.pom;

import com.tatf.adminCes.Selectors;
import com.tatf.core.browser.IBrowser;

public class ViewUserPO {
    private final IBrowser browser;
    public static String ADMINCES_VIEWUSERS_GOTOVIEWUSERS_BUTTON = ".container-fluid a[href*='view-users']";
    public static String ADMINCES_VIEWUSER_DELETE_BUTTON(String testerEmail) {
        return "[id=\""+testerEmail+"\"]";
    }
    public ViewUserPO (IBrowser browser) {this.browser = browser;}
    public void clickGoViewUsers(){
        browser.find().css(ADMINCES_VIEWUSERS_GOTOVIEWUSERS_BUTTON).click();
    }
    public void clickDeleteUser(String testerEmail){
        browser.find().css(ADMINCES_VIEWUSER_DELETE_BUTTON(testerEmail)).click();
    }
}
