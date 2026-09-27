package com.tatf.adminCes.Authenticator.task;

import com.tatf.adminCes.Authenticator.pom.AuthenticatorPO;
import com.tatf.adminCes.MenuUser.MenuPO;
import com.tatf.adminCes.modals.pom.ModalsPO;
import com.tatf.core.browser.IBrowser;

public class AuthenticatorTask {
    private final IBrowser browser;
    private final AuthenticatorPO auth;
    private final ModalsPO modal;
    MenuPO menu;
    public AuthenticatorTask(IBrowser browser) {
        this.browser = browser;
        this.auth= new AuthenticatorPO(this.browser);
        this.modal= new ModalsPO(this.browser);
        this.menu = new MenuPO(browser);

    }
    public void goToAdminCes(String URL){
        browser.interaction().navigateTo(URL);
    }
    public void loginProyect(String HASH){
        auth.enterHash(HASH);
        auth.clickSubmitProyect();
    }
    public void login(String email, String password){
        auth.clickGoLogin();
        auth.enterEmail(email);
        auth.enterPassword(password);
        auth.clickLoginButton();
        modal.clickConfirmSuccessFullyModal();
    }
    public void logout(){
        menu.clickOpenMenuUser();
        auth.clickLogoutButton();
    }
}
