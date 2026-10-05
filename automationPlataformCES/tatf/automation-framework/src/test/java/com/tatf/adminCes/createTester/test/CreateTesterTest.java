package com.tatf.adminCes.createTester.test;

import com.tatf.adminCes.Authenticator.data.AuthData;
import com.tatf.adminCes.Authenticator.task.AuthenticatorTask;
import com.tatf.adminCes.base.BaseTest;
import com.tatf.adminCes.base.TestExecutionsUtils;
import com.tatf.adminCes.createTester.data.CreateTesterData;
import com.tatf.adminCes.createTester.task.CreateTesterTask;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CreateTesterTest extends BaseTest {
    private AuthenticatorTask login;
    private AuthData authData;
    private CreateTesterData dataTester;
    private CreateTesterTask createTester;
    private TestExecutionsUtils utils;
    @BeforeEach
    public void config(){
        this.authData = new AuthData();
        this.login = new AuthenticatorTask(browser);
        this.dataTester = CreateTesterData.defaults();
        this.createTester = new CreateTesterTask(browser);
        this.utils = new TestExecutionsUtils();
    }
    @DisplayName("Crear tester junior test_001")
    @ParameterizedTest
    @CsvSource({
            "Leonardo, Perez, 1",
            "Laura, Magallanes, 2",
            "Nahuel, Torena, 3"
    })
    void test_ADMINCES001_createTester(String firstName, String lastName, String rolOption) {
        dataTester =  CreateTesterData.defaults().withFirstName(firstName).withLastName(lastName).withRole(rolOption);
        utils.runSafely(() -> {
        login.enterSystem(URL, HASH);
        login.login(authData.adminEmail, authData.adminPassword, authData.loginBodyModal);
        System.out.println("se va a crear el usuario: "+dataTester.testerEmail);
        createTester.createTesterAndVerify(dataTester);
        });
    }
}
