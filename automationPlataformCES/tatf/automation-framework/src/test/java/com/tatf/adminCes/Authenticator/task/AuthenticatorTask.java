package com.tatf.adminCes.Authenticator.task;

import com.tatf.adminCes.Authenticator.pom.AuthenticatorPO;
import com.tatf.adminCes.menuUser.MenuPO;
import com.tatf.adminCes.modals.pom.ModalsPO;
import com.tatf.adminCes.modals.task.ModalsTask;
import com.tatf.core.browser.IBrowser;

public class AuthenticatorTask {
    private final IBrowser browser;
    private final AuthenticatorPO auth;
    private final ModalsTask modal;
    MenuPO menu;
    public AuthenticatorTask(IBrowser browser) {
        this.browser = browser;
        this.auth= new AuthenticatorPO(this.browser);
        this.modal= new ModalsTask(this.browser);
        this.menu = new MenuPO(browser);

    }
    public void goToAdminCes(String URL){
        browser.interaction().navigateTo(URL);
    }
    public void loginProyect(String HASH){
        auth.enterHash(HASH);
        auth.clickSubmitProyect();
    }
    public void enterSystem(String URL, String HASH){
        goToAdminCes(URL);
        loginProyect(HASH);
    }
    public void login(String email, String password, String bodyModal){
        auth.clickGoLogin();
        auth.enterEmail(email);
        auth.enterPassword(password);
        auth.clickLoginButton();
        modal.clickAndVerifyConfirmSuccessFullyModal(bodyModal);
    }

    public void logout(String option, String bodyQuestionModal, String bodySuccessModal){
        menu.clickOpenMenuUser();
        auth.clickLogoutButton();
        modal.clickAndVerifyQuestionModal(option, bodyQuestionModal);
        modal.clickAndVerifyConfirmSuccessFullyModal(bodySuccessModal);
    }
}
