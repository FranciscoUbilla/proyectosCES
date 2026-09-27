package com.tatf.adminCes.MenuUser;

import com.tatf.core.browser.IBrowser;

public class MenuPO {
    private final String ADMINCES_MENUUSER_OPENMENU_BUTTON = ".btn.btn-orange-ces";
    private final String ADMINCES_MENUUSER_GOPROFILE_BUTTON = ".dropdown-menu > li:first-child a";
    private final IBrowser browser;
    public MenuPO (IBrowser browser) {this.browser = browser;}

    public void clickOpenMenuUser(){
        browser.find().css(ADMINCES_MENUUSER_OPENMENU_BUTTON).click();
    }
    public void clickGoEditProfileUser(){
        browser.find().css(ADMINCES_MENUUSER_GOPROFILE_BUTTON).click();
    }
}
