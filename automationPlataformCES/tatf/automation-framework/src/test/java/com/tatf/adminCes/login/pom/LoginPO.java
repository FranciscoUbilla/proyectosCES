package com.tatf.adminCes.login.pom;

import com.tatf.adminCes.Selectors;
import com.tatf.core.browser.IBrowser;

public class LoginPO {
    private final IBrowser browser;
    public LoginPO(IBrowser browser){this.browser = browser;}


    public void enterHash (String HASH){
        browser.find().css(Selectors.ADMINCES_LANDING_HASH_INPUT).write(HASH);
    }
    public void clickSubmitProyect(){
        browser.find().css(Selectors.ADMINCES_LANDING_LOGINPROYECT_SUBMIT_BUTTON).click();
    }
    public void enterEmail(String email){
        browser.find().css(Selectors.ADMINCES_LOGIN_EMAIL_INPUT).write(email);
    }
    public void enterPassword(String password){
        browser.find().css(Selectors.ADMINCES_LOGIN_PASSWORD_INPUT).write(password);

    }
    public void clickGoLogin(){
        browser.find().css(Selectors.ADMINCES_LOGIN_GOLOGIN_BUTTON).click();
    }
    public void clickLoginButton(){
        browser.find().css(Selectors.ADMINCES_LOGIN_BUTTON).click();
    }
}
