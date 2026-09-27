package com.tatf.adminCes;

import com.tatf.core.browser.IBrowser;

public class Methods {
    private final IBrowser browser;

    public Methods(IBrowser browser){
        this.browser = browser;
    }

    public void goToProfileEdit(){
        browser.find().css(Selectors.ADMINCES_MENUUSER_OPENMENU_BUTTON).click();
        browser.find().css(Selectors.ADMINCES_MENUUSER_GOPROFILE_BUTTON).click();
    }
    public void fillFormAdminRegister(String firstName, String lastName, String email, String password, String country){
        browser.find().css(Selectors.ADMINCES_REGISTER_FIRSTNAME_INPUT).write(firstName);
        browser.find().css(Selectors.ADMINCES_REGISTER_LASTNAME_INPUT).write(lastName);
        browser.find().css(Selectors.ADMINCES_REGISTER_EMAIL_INPUT).write(email);
        browser.find().css(Selectors.ADMINCES_REGISTER_PASSWORD_INPUT).write(password);
        browser.find().css(Selectors.ADMINCES_REGISTER_CONFIRMPASSWORD_INPUT).write(password);
        browser.find().css(Selectors.ADMINCES_REGISTER_COUNTRY_INPUT).write(country);
    }

    public void fillFormResetpassword(String email, String newPassword, String confirmNewPassword){
        browser.find().css(Selectors.ADMINCES_RESETPASSWORD_EMAIL_INPUT).write(email);
        browser.find().css(Selectors.ADMINCES_RESETPASSWORD_PASSWORD_INPUT).write(newPassword);
        browser.find().css(Selectors.ADMINCES_RESETPASSWORD_REPEATPASSWORD_INPUT).write(confirmNewPassword);
    }
    public void logout(){
        browser.find().css(Selectors.ADMINCES_MENUUSER_OPENMENU_BUTTON).click();
        browser.find().css(Selectors.ADMINCES_MENUUSER_LOGOUT_BUTTON).click();
    }

}
