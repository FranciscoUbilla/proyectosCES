package com.tatf.adminCes.viewUser.task;

import com.tatf.adminCes.Selectors;
import com.tatf.adminCes.modals.pom.ModalsPO;
import com.tatf.adminCes.viewUser.pom.ViewUserPO;
import com.tatf.core.browser.IBrowser;

public class ViewUserTask {
    private final IBrowser browser;
    private final ViewUserPO viewUser;
    private final ModalsPO modals;
    public ViewUserTask (IBrowser browser){
        this.browser = browser;
        this.viewUser = new ViewUserPO(this.browser);
        this.modals = new ModalsPO(this.browser);
    }
    public void deleteUser(String testEmail){
        viewUser.clickGoViewUsers();
        viewUser.clickDeleteUser(testEmail);
        modals.clickYesQuestionModal();
        modals.clickConfirmSuccessFullyModal();
    }
}
