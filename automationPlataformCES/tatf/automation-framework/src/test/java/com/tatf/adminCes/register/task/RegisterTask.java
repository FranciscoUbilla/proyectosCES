package com.tatf.adminCes.register.task;

import com.tatf.adminCes.Authenticator.task.AuthenticatorTask;
import com.tatf.adminCes.modals.task.ModalsTask;
import com.tatf.adminCes.profileDetails.ProfileDetailsTask;
import com.tatf.adminCes.base.ConsoleMessage;
import com.tatf.adminCes.resetPassword.pom.ResetPasswordPO;
import com.tatf.adminCes.menuUser.MenuTask;
import com.tatf.adminCes.register.data.RegisterData;
import com.tatf.adminCes.register.pom.RegisterPO;

import com.tatf.core.browser.IBrowser;
import com.tatf.core.verification.IVerify;

public class RegisterTask {
    private final IBrowser browser;
    private final RegisterPO register;
    private final ModalsTask modals;
    private final AuthenticatorTask auth;
    private final ProfileDetailsTask profile;
    private final MenuTask menu;
    private final ResetPasswordPO profileUser;
    private final ConsoleMessage message;
    public RegisterTask (IBrowser browser){
        this.browser = browser;
        this.auth = new AuthenticatorTask(this.browser);
        this.profile = new ProfileDetailsTask(this.browser);
        this.menu = new MenuTask(this.browser);
        this.register = new RegisterPO(this.browser);
        this.profileUser = new ResetPasswordPO(this.browser);
        this.modals = new ModalsTask(this.browser);
        this.message = new ConsoleMessage();
    }
    public void register(RegisterData data, String registerBodyModal){
        register.clickGoRegisterButton();
        register.enterRegisterFirstName(data.firstName);
        register.enterRegisterLastName(data.lastName);
        register.enterRegisterEmail(data.email);
        register.enterRegisterPassword(data.password);
        register.enterRegisterConfirmPassowrd(data.confirmPassword);
        register.enterRegisterCountry(data.country);
        register.clickConfirmRegisterButton();
        modals.clickAndVerifyConfirmSuccessFullyModal(registerBodyModal);
    }
    public void registerAndVerify(RegisterData data, String registerBodyModal, String loginBodyModal){
        this.register(data, registerBodyModal);
        verifyRegister(data.email, data.password, loginBodyModal);
    }
    public void verifyRegister(String email, String password, String modalSuccesLoginBody){
        auth.login(email, password, modalSuccesLoginBody);
        menu.goPorfileUser();
        String assertionProfileEmail = profile.getEmailUser();
        IVerify.create().verify(email,assertionProfileEmail,"El email registrado y el logeado no coinciden");
        message.messageResultObtained(assertionProfileEmail);
    }
}
