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
    public void fillFormLogin(String email, String password){
        browser.find().css(Selectors.ADMINCES_LOGIN_EMAIL_INPUT).write(email);
        browser.find().css(Selectors.ADMINCES_LOGIN_PASSWORD_INPUT).write(password);
    }
    public void fillFormResetpassword(String email, String newPassword, String confirmNewPassword){
        browser.find().css(Selectors.ADMINCES_RESETPASSWORD_EMAIL_INPUT).write(email);
        browser.find().css(Selectors.ADMINCES_RESETPASSWORD_PASSWORD_INPUT).write(newPassword);
        browser.find().css(Selectors.ADMINCES_RESETPASSWORD_REPEATPASSWORD_INPUT).write(confirmNewPassword);
    }
    public void fillFormCreateTester (String firstName, String lastName, String testerEmail, String testerPassword){
        browser.find().css(Selectors.ADMINCES_CREATETESTER_FIRSTNAME_INPUT).write(firstName);
        browser.find().css(Selectors.ADMINCES_CREATETESTER_LASTNAME_INPUT).write(lastName);
        browser.find().css(Selectors.ADMINCES_CREATETESTER_EMAIL_INPUT).write(testerEmail);
        browser.find().css(Selectors.ADMINCES_CREATETESTER_PASSWORD_INPUT).write(testerPassword);
        browser.find().css(Selectors.ADMINCES_CREATETESTER_COUNTRY_SELECT).click();
        browser.find().css(Selectors.ADMINCES_CREATETESTER_COUNTRY_OPTION).click();
        browser.find().css(Selectors.ADMINCES_CREATETESTER_ROLOPTION_INPUT).click();
    }
    public void logout(){
        browser.find().css(Selectors.ADMINCES_MENUUSER_OPENMENU_BUTTON).click();
        browser.find().css(Selectors.ADMINCES_MENUUSER_LOGOUT_BUTTON).click();
    }

    public void clickConfirmModal(){
        browser.find().css(Selectors.ADMINCES_SUCCESSFULLYMODAL_OK_BUTTON).click();
    }
    public void clickYesQuestionModal(){
        browser.find().css(Selectors.ADMINCES_LOGOUT_MODAL_YES_BUTTON).click();
    }
    public void clickGoLogin(){
        browser.find().css(Selectors.ADMINCES_LOGIN_GOLOGIN_BUTTON).click();
    }
    public void clickLoginButton(){
        browser.find().css(Selectors.ADMINCES_LOGIN_BUTTON).click();
    }
    public void clickGoFormNewTester(){
        browser.find().css(Selectors.ADMINCES_CREATETESTER_GOFORM_BUTTON).click();
    }
    public void clickConfirmNewTester(){
        browser.find().css(Selectors.ADMINCES_CREATETESTER_CONFIRM_BUTTON).click();
    }
    public void clickGoViewUsers(){
        browser.find().css(Selectors.ADMINCES_VIEWUSERS_GOTOVIEWUSERS_BUTTON).click();
    }
    public static void reset() {
        Variables.testerEmail = null;
        Variables.countrOption = null;
        Variables.userRolOption = null;
    }
}
