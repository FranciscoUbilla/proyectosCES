package com.tatf.adminCes;

import com.tatf.core.browser.IBrowser;

public class Methods {
    private final IBrowser browser;

    public Methods(IBrowser browser){
        this.browser = browser;
    }
    public void goToAdminCes(){
        browser.interaction().navigateTo(Variables.URL);
        browser.find().css(Selectors.ADMINCES_LANDING_HASH_INPUT).write(Variables.HASH);
        browser.find().css(Selectors.ADMINCES_LANDING_LOGINPROYECT_SUBMIT_BUTTON).click();
    }
    public void goProfileEdit(){
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
    public void fillLoginForm(String email, String password){
        browser.find().css(Selectors.ADMINCES_LOGIN_EMAIL_INPUT).write(email);
        browser.find().css(Selectors.ADMINCES_LOGIN_PASSWORD_INPUT).write(password);
    }


}
