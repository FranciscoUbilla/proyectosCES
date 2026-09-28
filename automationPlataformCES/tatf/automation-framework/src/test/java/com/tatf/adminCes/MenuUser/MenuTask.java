package com.tatf.adminCes.menuUser;

import com.tatf.adminCes.base.ConsoleMessage;
import com.tatf.adminCes.modals.pom.ModalsPO;
import com.tatf.adminCes.viewUser.pom.ViewUserPO;
import com.tatf.core.browser.IBrowser;

public class MenuTask {
    private final IBrowser browser;
    private final MenuPO menu;
;
    public MenuTask (IBrowser browser){
        this.browser = browser;
        this.menu = new MenuPO(browser);
    }
    public void goPorfileUser(){
        menu.clickOpenMenuUser();
        menu.clickGoEditProfileUser();
    }

}
