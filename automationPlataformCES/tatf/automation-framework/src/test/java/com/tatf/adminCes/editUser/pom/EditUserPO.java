package com.tatf.adminCes.editUser.pom;

import com.tatf.core.browser.IBrowser;

public class EditUserPO {
    private final IBrowser browser;
    private final String ADMINCES_PROFILEDETAILS_EMAIL_INPUT = ".card-body > div:nth-of-type(3) input";
    private final String ADMINCES_RESETPASSWORD_GOTORESETPASS_BUTTON = ".container-fluid a[href*='password']";
    private final String ADMINCES_RESETPASSWORD_EMAIL_INPUT = "#formResetPassword .form-group > input:nth-of-type(1)";
    private final String ADMINCES_RESETPASSWORD_PASSWORD_INPUT = "#formResetPassword .form-group > input:nth-of-type(2)";
    private final String ADMINCES_RESETPASSWORD_REPEATPASSWORD_INPUT = "#formResetPassword .form-group > input:nth-of-type(3)";
    private final String ADMINCES_RESETPASSWORD_CONFIRM_BUTTON = "#formResetPassword .form-group button";
    public EditUserPO (IBrowser browser) {this.browser = browser;}

    public void fillFormResetpassword(String email, String newPassword, String confirmNewPassword){
        browser.find().css(ADMINCES_RESETPASSWORD_EMAIL_INPUT).write(email);
        browser.find().css(ADMINCES_RESETPASSWORD_PASSWORD_INPUT).write(newPassword);
        browser.find().css(ADMINCES_RESETPASSWORD_REPEATPASSWORD_INPUT).write(confirmNewPassword);
    }

}
