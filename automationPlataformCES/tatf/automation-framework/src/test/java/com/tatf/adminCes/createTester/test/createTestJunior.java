package com.tatf.adminCes.createTester.test;

import com.tatf.adminCes.Generator;
import com.tatf.adminCes.Selectors;
import com.tatf.adminCes.Variables;
import com.tatf.core.element.Element;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/*public class createTestJunior {
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
}*/
