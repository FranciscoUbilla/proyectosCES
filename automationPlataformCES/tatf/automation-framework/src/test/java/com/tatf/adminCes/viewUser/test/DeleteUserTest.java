package com.tatf.adminCes.viewUser.test;
import com.tatf.adminCes.Generator;
import com.tatf.adminCes.Selectors;
import com.tatf.adminCes.base.BaseTest;
import com.tatf.adminCes.createTester.data.CreateTesterData;
import com.tatf.adminCes.login.data.LoginData;
import com.tatf.adminCes.login.task.LoginTask;
import com.tatf.adminCes.viewUser.task.ViewUserTask;
import com.tatf.core.element.Element;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DeleteUserTest extends BaseTest {
    private LoginTask login;
    private ViewUserTask viewUser;
    private LoginData loginData;
    private CreateTesterData createTesterData;
    @BeforeEach
    public void config(){
        this.loginData = new LoginData();
        this.login = new LoginTask(browser);
        this.viewUser = new ViewUserTask(browser);
        this.createTesterData = new CreateTesterData();

    }


    @Test
    @DisplayName("Borrar tester junior")
    void test_ADMINCES004_deleteTester() {

        createTesterData.testerFirstName ="Juan";
        createTesterData.testerLastName = "Perez";
        createTesterData.testerDomain = "gmail";
        createTesterData.testerTLD = ".com";
        createTesterData.testerPassword = "123456";
        createTesterData.countrOption = "2";

        createTesterData.testerEmail = Generator.generateEmail(createTesterData.testerFirstName,createTesterData.testerLastName,createTesterData.testerDomain,createTesterData.testerTLD);
        login.goToAdminCes(URL);
        login.loginProyect(HASH);
        login.login(loginData.adminEmail, loginData.adminPassword);
        methods.clickGoFormNewTester();
        System.out.println("se va a crear el usuario: "+createTesterData.testerEmail);
        methods.fillFormCreateTester(createTesterData.testerFirstName, createTesterData.testerLastName, createTesterData.testerEmail, createTesterData.testerPassword);
        methods.clickConfirmNewTester();
        //methods.clickConfirmModal();
        //methods.clickGoViewUsers();
        //browser.find().css(Selectors.ADMINCES_VIEWUSER_DELETE_BUTTON()).click();
        methods.clickYesQuestionModal();
       // methods.clickConfirmModal();
        List<Element> emailCells = browser.find().cssList(Selectors.ADMINCES_VIEWUSERS_EMAIL_TD);
        boolean userFound = emailCells.stream().anyMatch(cell -> cell.getText().equalsIgnoreCase(createTesterData.testerEmail));
        Assertions.assertFalse(userFound, "El usuario " + createTesterData.testerEmail+ " todavia aparece en la lista");
        message.messageResultObtained(userFound);
    }
}
