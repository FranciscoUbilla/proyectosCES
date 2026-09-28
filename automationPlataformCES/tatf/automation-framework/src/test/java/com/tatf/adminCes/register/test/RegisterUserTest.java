package com.tatf.adminCes.register.test;
import com.tatf.adminCes.Authenticator.data.AuthData;
import com.tatf.adminCes.Authenticator.task.AuthenticatorTask;
import com.tatf.adminCes.base.BaseTest;
import com.tatf.adminCes.base.TestExecutionsUtils;
import com.tatf.adminCes.register.data.RegisterData;
import com.tatf.adminCes.register.task.RegisterTask;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
   @Test
   @DisplayName("Register user test_001")
    void test_ADMINCES001_registerUser() {
        utils.runSafely(()->{
            login.enterSystem(URL,HASH);
            register.registerAndVerify(dataRegister, dataRegister.bodyRegisterModal, authData.loginBodyModal);
        });
    }
}
