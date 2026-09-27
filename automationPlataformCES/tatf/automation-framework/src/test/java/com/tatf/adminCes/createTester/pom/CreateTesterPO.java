package com.tatf.adminCes.createTester.pom;

import com.tatf.adminCes.createTester.data.CreateTesterData;
import com.tatf.core.browser.IBrowser;

public class CreateTesterPO {
    private final IBrowser browser;
    private final CreateTesterData testerData;
    private final String ADMINCES_CREATETESTER_GOFORM_BUTTON = ".container-fluid a[href*='create-user']";
    private final String ADMINCES_CREATETESTER_FIRSTNAME_INPUT = "#formCreateUser > .form-group:nth-of-type(1) > div:nth-of-type(1) input";
    private final String ADMINCES_CREATETESTER_LASTNAME_INPUT = "#formCreateUser > .form-group:nth-of-type(1) > div:nth-of-type(2) input";
    private final String ADMINCES_CREATETESTER_EMAIL_INPUT = "#formCreateUser > .form-group:nth-of-type(2) input";
    private final String ADMINCES_CREATETESTER_COUNTRY_SELECT = "#formCreateUser > .form-group:nth-of-type(3) > div:nth-of-type(1) select";
    private static String ADMINCES_CREATETESTER_COUNTRY_OPTION(String countryOption){
        return "#formCreateUser > .form-group:nth-of-type(3) > div:nth-of-type(1) select > option:nth-of-type("+countryOption+")";
    }
    private final String ADMINCES_CREATETESTER_PASSWORD_INPUT = "#formCreateUser > .form-group:nth-of-type(3) > div:nth-of-type(2) input";
    private static String ADMINCES_CREATETESTER_ROLOPTION_INPUT (String testerRolOption){
        return "#formCreateUser > .form-group:nth-of-type(4) > div:nth-of-type("+testerRolOption+")";
    }
    private final String ADMINCES_CREATETESTER_CONFIRM_BUTTON = "#formCreateUser > .form-group:nth-of-type(5) button";
    public CreateTesterPO(IBrowser browser){
        this.browser = browser;
        this.testerData = new CreateTesterData();
    }
    public void clickGoFormNewTester(){
        browser.find().css(ADMINCES_CREATETESTER_GOFORM_BUTTON).click();
    }
    public void enterFirstName(String firstName){
        browser.find().css(ADMINCES_CREATETESTER_FIRSTNAME_INPUT).write(firstName);
    }
    public void enterLastName(String lastName){
        browser.find().css(ADMINCES_CREATETESTER_LASTNAME_INPUT).write(lastName);
    }
    public void enterTesterEmail(String testerEmail){
        browser.find().css(ADMINCES_CREATETESTER_EMAIL_INPUT).write(testerEmail);
    }
    public void enterPassword(String testerPassword){
        browser.find().css(ADMINCES_CREATETESTER_PASSWORD_INPUT).write(testerPassword);}
    public void openCountrySelect(){
        browser.find().css(ADMINCES_CREATETESTER_COUNTRY_SELECT).click();
    }
    public void clickCountryOption(String countryOption){
        browser.find().css(ADMINCES_CREATETESTER_COUNTRY_OPTION(countryOption)).click();
    }
    public void clickRolTesterOption(String rolTesterOption){
        browser.find().css(ADMINCES_CREATETESTER_ROLOPTION_INPUT(rolTesterOption)).click();
    }

    public void clickConfirmNewTester(){
        browser.find().css(ADMINCES_CREATETESTER_CONFIRM_BUTTON).click();
    }
}
