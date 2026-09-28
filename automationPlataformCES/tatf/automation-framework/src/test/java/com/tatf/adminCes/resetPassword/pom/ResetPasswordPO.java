package com.tatf.adminCes.resetPassword.pom;

import com.tatf.core.browser.IBrowser;

public class ResetPasswordPO {
    private final IBrowser browser;

    private final String ADMINCES_RESETPASSWORD_GOTORESETPASS_BUTTON = ".container-fluid a[href*='password']";
    private final String ADMINCES_RESETPASSWORD_EMAIL_INPUT = "#formResetPassword .form-group > input:nth-of-type(1)";
    private final String ADMINCES_RESETPASSWORD_PASSWORD_INPUT = "#formResetPassword .form-group > input:nth-of-type(2)";
    private final String ADMINCES_RESETPASSWORD_REPEATPASSWORD_INPUT = "#formResetPassword .form-group > input:nth-of-type(3)";
    private final String ADMINCES_RESETPASSWORD_CONFIRM_BUTTON = "#formResetPassword .form-group button";
    public ResetPasswordPO(IBrowser browser) {this.browser = browser;}


    public void clickGoResetPassword(){
        browser.find().css(ADMINCES_RESETPASSWORD_GOTORESETPASS_BUTTON).click();
    }
    public void enterEmailResetPassword(String email){
        browser.find().css(ADMINCES_RESETPASSWORD_EMAIL_INPUT).write(email);
    }
    public void enterNewPassword(String newPassword){
        browser.find().css(ADMINCES_RESETPASSWORD_PASSWORD_INPUT).write(newPassword);
    }
    public void enterConfirmNewPassword(String confirmNewPassword){
        browser.find().css(ADMINCES_RESETPASSWORD_REPEATPASSWORD_INPUT).write(confirmNewPassword);
    }
    public void clickConfirmNewPassword(){
        browser.find().css(ADMINCES_RESETPASSWORD_CONFIRM_BUTTON).click();
    }
}
