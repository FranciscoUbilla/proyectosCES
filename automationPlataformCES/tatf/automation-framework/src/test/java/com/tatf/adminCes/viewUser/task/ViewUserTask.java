package com.tatf.adminCes.viewUser.task;

import com.tatf.adminCes.Selectors;
import com.tatf.adminCes.viewUser.pom.ViewUserPO;
import com.tatf.core.browser.IBrowser;

public class ViewUserTask {
    private final IBrowser browser;
    private final ViewUserPO viewUser;
    public ViewUserTask (IBrowser browser){
        this.browser = browser;
        this.viewUser = new ViewUserPO(this.browser);
    }

}
