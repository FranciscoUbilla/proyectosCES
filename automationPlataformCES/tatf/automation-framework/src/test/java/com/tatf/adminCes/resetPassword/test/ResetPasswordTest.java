package com.tatf.adminCes.resetPassword.test;

import com.tatf.adminCes.Authenticator.data.AuthData;
import com.tatf.adminCes.Authenticator.task.AuthenticatorTask;
import com.tatf.adminCes.base.BaseTest;
import com.tatf.adminCes.base.TestExecutionsUtils;
import com.tatf.adminCes.modals.data.ModalsData;
import com.tatf.adminCes.resetPassword.data.ResetPasswordData;
import com.tatf.adminCes.resetPassword.task.ResetPasswordTask;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ResetPasswordTest extends BaseTest {
    private AuthenticatorTask auth;
    private AuthData authData;
    private ResetPasswordTask ressPass;
    private ResetPasswordData ressData;
    private TestExecutionsUtils utils;
    private ModalsData modals;

    @BeforeEach
    public void config(){
        this.auth = new AuthenticatorTask(browser);
        this.ressData = new ResetPasswordData().defaults();
        this.ressPass = new ResetPasswordTask(browser);
        this.utils = new TestExecutionsUtils();
        this.modals = new ModalsData();
        this.authData = new AuthData();
    }
    @Test
    @DisplayName("Reset password test_001")
    void test_ADMINCES001_resetPassword() {
        utils.runSafely(()->{
            auth.enterSystem(URL, HASH);
            auth.login(ressData.emailResPass, ressData.passwordResPass, authData.loginBodyModal);
            System.out.println("Se resetea password a usuario: "+ressData.emailResPass);
            ressPass.resetPasswordAndVerify(ressData,ressData.emailResPass,ressData.newPasswordResPass, modals.optionYes,ressData.bodyResetModal, authData.logoutQuestionModal,
                    authData.logoutBodyModal, authData.loginBodyModal);
        });
    }
}
