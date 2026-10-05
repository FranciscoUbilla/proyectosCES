package com.tatf.adminCes.register.test;
import com.tatf.adminCes.Authenticator.data.AuthData;
import com.tatf.adminCes.Authenticator.task.AuthenticatorTask;
import com.tatf.adminCes.base.BaseTest;
import com.tatf.adminCes.base.TestExecutionsUtils;
import com.tatf.adminCes.createTester.data.CreateTesterData;
import com.tatf.adminCes.register.data.RegisterData;
import com.tatf.adminCes.register.task.RegisterTask;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RegisterUserTest extends BaseTest {
    private AuthenticatorTask login;
    private RegisterData dataRegister;
    private AuthData authData;
    private RegisterTask register;
    private TestExecutionsUtils utils;
    @BeforeEach
    public void config(){
        this.login = new AuthenticatorTask(browser);
        this.dataRegister = RegisterData.defaults();
        this.register = new RegisterTask(browser);
        this.utils = new TestExecutionsUtils();
        this.authData = new AuthData();
    }
   @DisplayName("Register user test_001")
   @ParameterizedTest
   @CsvSource({
           "Leonardo, Perez, a, a",
           "Laura, Magallanes, 5, 5",
           "Nahuel, Torena, 12345, 12345"
   })
   void test_ADMINCES001_registerUser(String firstName, String lastName, String newPassword, String confirmNewPassword) {
       dataRegister =  RegisterData.defaults().withFirstName(firstName).withLastName(lastName).withNewPassword(newPassword).withConfirmNewPassword(confirmNewPassword);
        utils.runSafely(()->{
            login.enterSystem(URL,HASH);
            register.registerAndVerify(dataRegister, dataRegister.bodyRegisterModal, authData.loginBodyModal);
        });
    }
}
