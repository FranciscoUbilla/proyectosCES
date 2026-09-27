package com.tatf.adminCes.login.task;

import com.tatf.adminCes.login.pom.LoginPO;
import com.tatf.adminCes.modals.pom.ModalsPO;
import com.tatf.core.browser.IBrowser;

public class LoginTask {
    private final IBrowser browser;
    private final LoginPO login;
    private final ModalsPO modal;
    public LoginTask(IBrowser browser) {
        this.browser = browser;
        this.login = new LoginPO(this.browser);
        this.modal= new ModalsPO(this.browser);

    }
    public void goToAdminCes(String URL){
        browser.interaction().navigateTo(URL);
    }
    public void loginProyect(String HASH){
        login.enterHash(HASH);
        login.clickSubmitProyect();
    }
    public void login(String email, String password){
        login.clickGoLogin();
        login.enterEmail(email);
        login.enterPassword(password);
        login.clickLoginButton();
        modal.clickConfirmSuccessFullyModal();
    }
}
