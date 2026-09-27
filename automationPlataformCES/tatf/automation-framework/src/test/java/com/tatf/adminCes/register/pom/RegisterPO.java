package com.tatf.adminCes.register.pom;

import com.tatf.core.browser.IBrowser;

public class RegisterPO {
    private final IBrowser browser;
    private final String ADMINCES_REGISTER_GOREGISTER_BUTTON = "#content a[href*='register']";
    private final String ADMINCES_REGISTER_FIRSTNAME_INPUT = "form > .form-group:nth-of-type(1) > div:nth-of-type(1) input";
    private final String ADMINCES_REGISTER_LASTNAME_INPUT = "form > .form-group:nth-of-type(1) > div:nth-of-type(2) input";
    private final String ADMINCES_REGISTER_EMAIL_INPUT = "form > .form-group:nth-of-type(2) input";
    private final String ADMINCES_REGISTER_PASSWORD_INPUT = "form > .form-group:nth-of-type(3) > div:nth-of-type(1) input";
    private final String ADMINCES_REGISTER_CONFIRMPASSWORD_INPUT = "form > .form-group:nth-of-type(3) > div:nth-of-type(2) input";
    private final String ADMINCES_REGISTER_COUNTRY_INPUT = "form > .form-group:nth-of-type(4) input";
    private final String ADMINCES_REGISTER_BUTTON = "#btnRegister";
    public RegisterPO (IBrowser browser) {this.browser = browser;}

    public void fillFormAdminRegister(String firstName, String lastName, String email, String password, String country){
        browser.find().css(ADMINCES_REGISTER_FIRSTNAME_INPUT).write(firstName);
        browser.find().css(ADMINCES_REGISTER_LASTNAME_INPUT).write(lastName);
        browser.find().css(ADMINCES_REGISTER_EMAIL_INPUT).write(email);
        browser.find().css(ADMINCES_REGISTER_PASSWORD_INPUT).write(password);
        browser.find().css(ADMINCES_REGISTER_CONFIRMPASSWORD_INPUT).write(password);
        browser.find().css(ADMINCES_REGISTER_COUNTRY_INPUT).write(country);
    }
}
