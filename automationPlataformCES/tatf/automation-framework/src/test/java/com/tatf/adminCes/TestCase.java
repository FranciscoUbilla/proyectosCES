package com.tatf.adminCes;

import com.tatf.core.verification.IVerify;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.tatf.core.element.Element;
import java.util.List;

public class TestCase extends Context{

        @Test
        void test_ADMINCES001_createAdminAccount() {
            /*ESTOS DATOS DEL PRINCIPIO SE PODRIAN RANDOMIZAR DENTRO DE UN METODO DE LA CLASE GENERATOR Y HACER UN METODO POR TIPO DE
             DATO CADA METODO APUNTARIA A UN ARRAY DISTINTO CREADO EN UNA CLASE QUE SE LLAME FIRSTNAME POR EJEMPLO Y
             QUE TENGA ARRAYS POR TIPO DE DATO, ESTAS CLASES SE CREAN DENTRO DE UNA CARPETA QUE SE LLAME CONFIGURACIONES,
             EL METODO RANDOMIZER RECORRE UNO DE ESOS ARRAY SEGUN LA SITUACION Y TOMA UN DATO ALEATORIO,
             NO HICE ESTA IMPLEMENTACION PORQUE CONSIERO YA ME SALGO DE LA COMPLEJIDAD ESPERADA*/
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
        }
        @Test
        void test_ADMINCES002_resetPassword() {
            String email = "yaniscorrea@gmail.com";
            String password = "12345";
            String newPassword = "123456";
            String confirmNewPassword = "123456";
            methods.goToAdminCes();
            methods.clickGoLogin();
            methods.fillFormLogin(email,password);
            methods.clickLoginButton();
            methods.clickConfirmModal();
            System.out.println("Se resetea password a usuario: "+email);
            browser.find().css(Selectors.ADMINCES_RESETPASSWORD_GOTORESETPASS_BUTTON).click();
            methods.fillFormResetpassword(email,newPassword,confirmNewPassword);
            browser.find().css(Selectors.ADMINCES_RESETPASSWORD_CONFIRM_BUTTON).click();
            methods.clickConfirmModal();
            methods.logout();
            methods.clickYesQuestionModal();
            methods.clickConfirmModal();
            methods.clickGoLogin();
            methods.fillFormLogin(email, newPassword);
            methods.clickLoginButton();
            methods.clickConfirmModal();
            methods.goToProfileEdit();
            String assertionProfileEmail = browser.find().css(Selectors.ADMINCES_PROFILEDETAILS_EMAIL_INPUT).getAttribute("value");
            IVerify.create().verify(email,assertionProfileEmail,"No se logueo correctamente con la nueva contraseña");
            message.messageResultObtained(assertionProfileEmail);
        }
        @Test
        void test_ADMINCES003_createTester() {
            String adminEmail = "yaniscorrea@gmail.com";
            String adminPassword = "12345";
            String testerFirstName ="Juan";
            String testerLastName = "Perez";
            String testerDomain = "gmail";
            String testerTLD = ".com";
            String testerPassword = "123456";
            Variables.countrOption = "2";
            Variables.userRolOption = "1";
            Variables.testerEmail = Generator.generateEmail(testerFirstName,testerLastName,testerDomain,testerTLD);
            methods.goToAdminCes();
            methods.clickGoLogin();
            methods.fillFormLogin(adminEmail,adminPassword);
            methods.clickLoginButton();
            methods.clickConfirmModal();
            methods.clickGoFormNewTester();
            System.out.println("se va a crear el usuario: "+Variables.testerEmail);
            methods.fillFormCreateTester(testerFirstName, testerLastName, Variables.testerEmail, testerPassword);
            methods.clickConfirmNewTester();
            methods.clickConfirmModal();
            methods.clickGoViewUsers();
            List<Element> emailCells = browser.find().cssList(Selectors.ADMINCES_VIEWUSERS_EMAIL_TD);
            boolean userFound = emailCells.stream().anyMatch(cell -> cell.getText().equalsIgnoreCase(Variables.testerEmail));
            Assertions.assertTrue(userFound, "El usuario " + Variables.testerEmail+ " no aparece en la lista");
            message.messageResultObtained(userFound);
        }

        @Test
        void test_ADMINCES004_deleteTester() {
            String adminEmail = "yaniscorrea@gmail.com";
            String adminPassword = "12345";
            String testerFirstName ="Juan";
            String testerLastName = "Perez";
            String testerDomain = "gmail";
            String testerTLD = ".com";
            String testerPassword = "123456";
            Variables.countrOption = "2";
            Variables.userRolOption = "1";
            Variables.testerEmail = Generator.generateEmail(testerFirstName,testerLastName,testerDomain,testerTLD);
            methods.goToAdminCes();
            methods.clickGoLogin();
            methods.fillFormLogin(adminEmail,adminPassword);
            methods.clickLoginButton();
            methods.clickConfirmModal();
            methods.clickGoFormNewTester();
            System.out.println("se va a crear el usuario: "+Variables.testerEmail);
            methods.fillFormCreateTester(testerFirstName, testerLastName, Variables.testerEmail, testerPassword);
            methods.clickConfirmNewTester();
            methods.clickConfirmModal();
            methods.clickGoViewUsers();
            browser.find().css(Selectors.ADMINCES_VIEWUSER_DELETE_BUTTON()).click();
            methods.clickYesQuestionModal();
            methods.clickConfirmModal();
            List<Element> emailCells = browser.find().cssList(Selectors.ADMINCES_VIEWUSERS_EMAIL_TD);
            boolean userFound = emailCells.stream().anyMatch(cell -> cell.getText().equalsIgnoreCase(Variables.testerEmail));
            Assertions.assertFalse(userFound, "El usuario " + Variables.testerEmail+ " todavia aparece en la lista");
            message.messageResultObtained(userFound);
        }



}
