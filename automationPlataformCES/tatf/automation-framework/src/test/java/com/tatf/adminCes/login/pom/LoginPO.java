package com.tatf.adminCes.login.pom;

import com.tatf.adminCes.Selectors;
import com.tatf.core.browser.IBrowser;

public class LoginPO {
    private final IBrowser browser;
    private final String ADMINCES_LANDING_HASH_INPUT = "input[type='password']";
    private final String ADMINCES_LANDING_LOGINPROYECT_SUBMIT_BUTTON = "button[type='submit']";
    private final String ADMINCES_LOGIN_GOLOGIN_BUTTON = ".container-fluid a[href*='login']";
    private final String ADMINCES_LOGIN_EMAIL_INPUT = "#formLogin > div:nth-of-type(1) input";
    private final String ADMINCES_LOGIN_PASSWORD_INPUT = "#formLogin > div:nth-of-type(2) input";
    private final String ADMINCES_LOGIN_BUTTON = "#formLogin > div:nth-of-type(3) button";
    public LoginPO(IBrowser browser){this.browser = browser;}

    public void enterHash (String HASH){
        browser.find().css(ADMINCES_LANDING_HASH_INPUT).write(HASH);
    }
    public void clickSubmitProyect(){
        browser.find().css(ADMINCES_LANDING_LOGINPROYECT_SUBMIT_BUTTON).click();
    }
    public void enterEmail(String email){
        browser.find().css(ADMINCES_LOGIN_EMAIL_INPUT).write(email);
    }
    public void enterPassword(String password){
        browser.find().css(ADMINCES_LOGIN_PASSWORD_INPUT).write(password);

    }
    public void clickGoLogin(){
        browser.find().css(ADMINCES_LOGIN_GOLOGIN_BUTTON).click();
    }
    public void clickLoginButton(){
        browser.find().css(ADMINCES_LOGIN_BUTTON).click();
    }
}
