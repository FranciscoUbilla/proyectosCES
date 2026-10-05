package com.tatf.adminCes.viewUser.test;
import com.tatf.adminCes.base.BaseTest;
import com.tatf.adminCes.base.TestExecutionsUtils;
import com.tatf.adminCes.createTester.data.CreateTesterData;
import com.tatf.adminCes.createTester.task.CreateTesterTask;
import com.tatf.adminCes.Authenticator.data.AuthData;
import com.tatf.adminCes.Authenticator.task.AuthenticatorTask;
import com.tatf.adminCes.modals.data.ModalsData;
import com.tatf.adminCes.viewUser.data.ViewUserData;
import com.tatf.adminCes.viewUser.task.ViewUserTask;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class DeleteUserTest extends BaseTest {
    private AuthenticatorTask login;
    private ViewUserTask viewUser;
    private AuthData authData;
    private ViewUserData authDeleteData;
    private CreateTesterData dataTester;
    private CreateTesterTask createTester;
    private TestExecutionsUtils utils;
    private ModalsData modals;
    @BeforeEach
    public void config(){
        this.authDeleteData = new ViewUserData();
        this.login = new AuthenticatorTask(browser);
        this.viewUser = new ViewUserTask(browser);
        this.dataTester = CreateTesterData.defaults();
        this.createTester = new CreateTesterTask(browser);
        this.utils = new TestExecutionsUtils();
        this.modals = new ModalsData();
        this.authData = new AuthData();
    }
    @DisplayName("Borrar tester junior test_001")
    @ParameterizedTest
    @ValueSource(strings = {"1","2","3"})
    void test_ADMINCES001_deleteTester(String rol) {
        utils.runSafely(() -> {
            dataTester.userRolOption = rol;
            login.enterSystem(URL, HASH);
            login.login(authDeleteData.adminEmail, authDeleteData.adminPassword, authData.loginBodyModal);
            System.out.println("se va a crear el usuario: " + dataTester.testerEmail);
            createTester.createTester(dataTester);
            viewUser.deleteUserAndVerify(dataTester.testerEmail,modals.optionYes, authDeleteData.modalQuestionDeleteUser(dataTester.testerEmail), authDeleteData.modalDeleteUserBody);
        });
    }
}
