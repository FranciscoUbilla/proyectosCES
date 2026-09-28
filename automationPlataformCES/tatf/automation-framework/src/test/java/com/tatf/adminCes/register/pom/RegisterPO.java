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


    public void clickGoRegisterButton(){
        browser.find().css(ADMINCES_REGISTER_GOREGISTER_BUTTON).click();
    }

    public void enterRegisterFirstName(String firstName){
        browser.find().css(ADMINCES_REGISTER_FIRSTNAME_INPUT).write(firstName);
    }
    public void enterRegisterLastName(String lastName)
    {
        browser.find().css(ADMINCES_REGISTER_LASTNAME_INPUT).write(lastName);
    }
    public void enterRegisterEmail(String email)
    {
        browser.find().css(ADMINCES_REGISTER_EMAIL_INPUT).write(email);
    }
    public void enterRegisterPassword(String password)
    {
        browser.find().css(ADMINCES_REGISTER_PASSWORD_INPUT).write(password);
    }
    public void enterRegisterConfirmPassowrd(String confirmPassword)
    {
        browser.find().css(ADMINCES_REGISTER_CONFIRMPASSWORD_INPUT).write(confirmPassword);
    }
    public void enterRegisterCountry(String country)
    {
        browser.find().css(ADMINCES_REGISTER_COUNTRY_INPUT).write(country);
    }
    public void clickConfirmRegisterButton(){
        browser.find().css(ADMINCES_REGISTER_BUTTON).click();
    }

}
