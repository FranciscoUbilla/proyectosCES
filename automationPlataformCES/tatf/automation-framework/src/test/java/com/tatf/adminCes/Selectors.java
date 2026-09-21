package com.tatf.adminCes;

public class Selectors {

    public static String ADMINCES_LANDING_HASH_INPUT = "input[type='password']";
    public static String ADMINCES_LANDING_LOGINPROYECT_SUBMIT_BUTTON = "button[type='submit']";
    public static String ADMINCES_REGISTER_GOREGISTER_BUTTON = "#content a[href*='register']";
    public static String ADMINCES_REGISTER_FIRSTNAME_INPUT = "form > .form-group:nth-of-type(1) > div:nth-of-type(1) input";
    public static String ADMINCES_REGISTER_LASTNAME_INPUT = "form > .form-group:nth-of-type(1) > div:nth-of-type(2) input";
    public static String ADMINCES_REGISTER_EMAIL_INPUT = "form > .form-group:nth-of-type(2) input";
    public static String ADMINCES_REGISTER_PASSWORD_INPUT = "form > .form-group:nth-of-type(3) > div:nth-of-type(1) input";
    public static String ADMINCES_REGISTER_CONFIRMPASSWORD_INPUT = "form > .form-group:nth-of-type(3) > div:nth-of-type(2) input";
    public static String ADMINCES_REGISTER_COUNTRY_INPUT = "form > .form-group:nth-of-type(4) input";
    public static String ADMINCES_REGISTER_BUTTON = "#btnRegister";
    public static String ADMINCES_LOGIN_GOLOGIN_BUTTON = ".container-fluid a[href*='login']";
    public static String ADMINCES_LOGIN_EMAIL_INPUT = "#formLogin > div:nth-of-type(1) input";
    public static String ADMINCES_LOGIN_PASSWORD_INPUT = "#formLogin > div:nth-of-type(2) input";
    public static String ADMINCES_LOGIN_BUTTON = "#formLogin > div:nth-of-type(3) button";
    public static String ADMINCES_MENUUSER_OPENMENU_BUTTON = ".btn.btn-orange-ces";
    public static String ADMINCES_MENUUSER_GOPROFILE_BUTTON = ".dropdown-menu > li:first-child a";
    public static String ADMINCES_MENUUSER_LOGOUT_BUTTON = ".dropdown-menu > li:last-child a";
    public static String ADMINCES_LOGOUT_MODAL_YES_BUTTON = ".swal2-confirm";
    public static String ADMINCES_PROFILEDETAILS_EMAIL_INPUT = ".card-body > div:nth-of-type(3) input";
    public static String ADMINCES_SUCCESSFULLYMODAL_OK_BUTTON = ".swal2-actions > button:nth-of-type(1)";
    public static String ADMINCES_RESETPASSWORD_GOTORESETPASS_BUTTON = ".container-fluid a[href*='password']";
    public static String ADMINCES_RESETPASSWORD_EMAIL_INPUT = "#formResetPassword .form-group > input:nth-of-type(1)";
    public static String ADMINCES_RESETPASSWORD_PASSWORD_INPUT = "#formResetPassword .form-group > input:nth-of-type(2)";
    public static String ADMINCES_RESETPASSWORD_REPEATPASSWORD_INPUT = "#formResetPassword .form-group > input:nth-of-type(3)";
    public static String ADMINCES_RESETPASSWORD_CONFIRM_BUTTON = "#formResetPassword .form-group button";
    public static String ADMINCES_CREATETESTER_GOFORM_BUTTON = ".container-fluid a[href*='create-user']";
    public static String ADMINCES_CREATETESTER_FIRSTNAME_INPUT = "#formCreateUser > .form-group:nth-of-type(1) > div:nth-of-type(1) input";
    public static String ADMINCES_CREATETESTER_LASTNAME_INPUT = "#formCreateUser > .form-group:nth-of-type(1) > div:nth-of-type(2) input";
    public static String ADMINCES_CREATETESTER_EMAIL_INPUT = "#formCreateUser > .form-group:nth-of-type(2) input";
    public static String ADMINCES_CREATETESTER_COUNTRY_SELECT = "#formCreateUser > .form-group:nth-of-type(3) > div:nth-of-type(1) select";
    public static String ADMINCES_CREATETESTER_COUNTRY_OPTION = "#formCreateUser > .form-group:nth-of-type(3) > div:nth-of-type(1) select > option:nth-of-type("+Variables.countrOption+")";
    public static String ADMINCES_CREATETESTER_PASSWORD_INPUT = "#formCreateUser > .form-group:nth-of-type(3) > div:nth-of-type(2) input";
    public static String ADMINCES_CREATETESTER_ROLOPTION_INPUT = "#formCreateUser > .form-group:nth-of-type(4) > div:nth-of-type("+Variables.userRolOption+")";
    public static String ADMINCES_CREATETESTER_CONFIRM_BUTTON = "#formCreateUser > .form-group:nth-of-type(5) button";
    public static String ADMINCES_VIEWUSERS_GOTOVIEWUSERS_BUTTON = ".container-fluid a[href*='view-users']";
    public static String ADMINCES_VIEWUSERS_EMAIL_TD = "#bodyTable > tr > td:nth-of-type(3)";
    public static String ADMINCES_VIEWUSER_DELETE_BUTTON() {
        return "[id=\"" + Variables.testerEmail + "\"]";
    }

}

