package com.tatf.adminCes.resetPassword.task;

import com.tatf.adminCes.Authenticator.task.AuthenticatorTask;
import com.tatf.adminCes.base.ConsoleMessage;
import com.tatf.adminCes.createTester.pom.CreateTesterPO;
import com.tatf.adminCes.menuUser.MenuTask;
import com.tatf.adminCes.modals.pom.ModalsPO;
import com.tatf.adminCes.modals.task.ModalsTask;
import com.tatf.adminCes.profileDetails.ProfileDetailsTask;
import com.tatf.adminCes.resetPassword.data.ResetPasswordData;
import com.tatf.adminCes.resetPassword.pom.ResetPasswordPO;
import com.tatf.adminCes.viewUser.pom.ViewUserPO;
import com.tatf.adminCes.viewUser.task.ViewUserTask;
import com.tatf.core.browser.IBrowser;
import com.tatf.core.verification.IVerify;

public class ResetPasswordTask {
    private final IBrowser browser;
    private final ResetPasswordPO resetPass;
    private final ModalsTask modals;
    private final MenuTask menu;
    private final ProfileDetailsTask profileDetails;
    private final AuthenticatorTask auth;
    private final ConsoleMessage message;

    public ResetPasswordTask (IBrowser browser){
        this.browser = browser;
        this.message = new ConsoleMessage();
        this.resetPass = new ResetPasswordPO(this.browser);
        this.auth = new AuthenticatorTask(this.browser);
        this.menu = new MenuTask(this.browser);
        this.modals = new ModalsTask(this.browser);
        this.profileDetails = new ProfileDetailsTask(this.browser);
    }
    public void resetPassword(ResetPasswordData data, String bodyRessModal){
        resetPass.clickGoResetPassword();
        resetPass.enterEmailResetPassword(data.emailResPass);
        resetPass.enterNewPassword(data.newPasswordResPass);
        resetPass.enterConfirmNewPassword(data.confirmNewPasswordResPass);
        resetPass.clickConfirmNewPassword();
        modals.clickAndVerifyConfirmSuccessFullyModal(bodyRessModal);
    }
    public void resetPasswordAndVerify(ResetPasswordData data, String email, String password,  String option,String bodyResModal,String bodyLogOutQuestionModal, String bodyLogoutSuccessModal, String bodyLoginSuccessfullyModal){
        resetPassword(data, bodyResModal);
        verifyResetPassword(email, password, option, bodyLogOutQuestionModal, bodyLogoutSuccessModal, bodyLoginSuccessfullyModal);
    }
    public void verifyResetPassword(String email, String password, String option, String bodyLogOutQuestionModal, String bodyLogoutSuccessModal, String bodyLoginSuccessfullyModal){
        auth.logout(option, bodyLogOutQuestionModal, bodyLogoutSuccessModal);
        auth.login(email,password,bodyLoginSuccessfullyModal);
        menu.goPorfileUser();
        String assertionProfileEmail = profileDetails.getEmailUser();
        IVerify.create().verify(email,assertionProfileEmail,"No se logueo correctamente con la nueva contraseña");
        message.messageResultObtained(assertionProfileEmail);
    }
}
