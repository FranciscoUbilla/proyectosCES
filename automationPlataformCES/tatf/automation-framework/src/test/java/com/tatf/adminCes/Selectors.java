package com.tatf.adminCes;

import com.tatf.adminCes.createTester.data.CreateTesterData;

public class Selectors {


    public static String ADMINCES_REGISTER_GOREGISTER_BUTTON = "#content a[href*='register']";
    public static String ADMINCES_REGISTER_FIRSTNAME_INPUT = "form > .form-group:nth-of-type(1) > div:nth-of-type(1) input";
    public static String ADMINCES_REGISTER_LASTNAME_INPUT = "form > .form-group:nth-of-type(1) > div:nth-of-type(2) input";
    public static String ADMINCES_REGISTER_EMAIL_INPUT = "form > .form-group:nth-of-type(2) input";
    public static String ADMINCES_REGISTER_PASSWORD_INPUT = "form > .form-group:nth-of-type(3) > div:nth-of-type(1) input";
    public static String ADMINCES_REGISTER_CONFIRMPASSWORD_INPUT = "form > .form-group:nth-of-type(3) > div:nth-of-type(2) input";
    public static String ADMINCES_REGISTER_COUNTRY_INPUT = "form > .form-group:nth-of-type(4) input";
    public static String ADMINCES_REGISTER_BUTTON = "#btnRegister";

    public static String ADMINCES_MENUUSER_OPENMENU_BUTTON = ".btn.btn-orange-ces";
    public static String ADMINCES_MENUUSER_GOPROFILE_BUTTON = ".dropdown-menu > li:first-child a";
    public static String ADMINCES_MENUUSER_LOGOUT_BUTTON = ".dropdown-menu > li:last-child a";
    public static String ADMINCES_PROFILEDETAILS_EMAIL_INPUT = ".card-body > div:nth-of-type(3) input";
    public static String ADMINCES_SUCCESSFULLYMODAL_OK_BUTTON = ".swal2-actions > button:nth-of-type(1)";
    public static String ADMINCES_RESETPASSWORD_GOTORESETPASS_BUTTON = ".container-fluid a[href*='password']";
    public static String ADMINCES_RESETPASSWORD_EMAIL_INPUT = "#formResetPassword .form-group > input:nth-of-type(1)";
    public static String ADMINCES_RESETPASSWORD_PASSWORD_INPUT = "#formResetPassword .form-group > input:nth-of-type(2)";
    public static String ADMINCES_RESETPASSWORD_REPEATPASSWORD_INPUT = "#formResetPassword .form-group > input:nth-of-type(3)";
    public static String ADMINCES_RESETPASSWORD_CONFIRM_BUTTON = "#formResetPassword .form-group button";

    public static String ADMINCES_VIEWUSERS_GOTOVIEWUSERS_BUTTON = ".container-fluid a[href*='view-users']";
    public static String ADMINCES_VIEWUSERS_EMAIL_TD = "#bodyTable > tr > td:nth-of-type(3)";
    /*public static String ADMINCES_VIEWUSER_DELETE_BUTTON() {
        return "[id=\"" + Variables.testerEmail + "\"]";
    }*/

}

