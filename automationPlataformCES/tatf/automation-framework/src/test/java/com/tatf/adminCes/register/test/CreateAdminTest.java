package com.tatf.adminCes.register.test;

import com.tatf.adminCes.Generator;
import com.tatf.adminCes.Selectors;
import com.tatf.core.verification.IVerify;
import org.junit.jupiter.api.Test;

public class CreateAdminTest {
   /* @Test
    void test_ADMINCES001_createAdminAccount() {
        String firstname ="Juan";
        String lastName = "Perez";
        String domain = "gmail";
        String TLD = ".com";
        String password = "12345";
        String country = "Uruguay";
        String email = Generator.generateEmail(firstname,lastName,domain,TLD);
        methods.goToAdminCes();
        browser.find().css(Selectors.ADMINCES_REGISTER_GOREGISTER_BUTTON).click();
        methods.fillFormAdminRegister(firstname, lastName, email, password, country);
        System.out.println("Se creara el usuario: "+email);
        browser.find().css(Selectors.ADMINCES_REGISTER_BUTTON).click();
        methods.clickConfirmModal();
        methods.clickGoLogin();
        methods.fillFormLogin(email,password);
        methods.clickLoginButton();
        methods.clickConfirmModal();
        methods.goToProfileEdit();
        String assertionProfileEmail = browser.find().css(Selectors.ADMINCES_PROFILEDETAILS_EMAIL_INPUT).getAttribute("value");
        IVerify.create().verify(email,assertionProfileEmail,"El email registrado y el logeado no coinciden");
        message.messageResultObtained(assertionProfileEmail);
    }*/
}
