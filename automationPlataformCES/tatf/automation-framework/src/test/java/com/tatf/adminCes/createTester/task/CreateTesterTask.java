package com.tatf.adminCes.createTester.task;

import com.tatf.adminCes.base.TestExecutionsUtils;
import com.tatf.adminCes.createTester.pom.CreateTesterPO;
import com.tatf.adminCes.modals.pom.ModalsPO;
import com.tatf.adminCes.viewUser.pom.ViewUserPO;
import com.tatf.core.browser.IBrowser;

public class CreateTesterTask {
    private final IBrowser browser;
    private final CreateTesterPO createTester;
    private final ModalsPO modals;

    public CreateTesterTask (IBrowser browser){
        this.browser = browser;
        this.createTester = new CreateTesterPO(this.browser);
        this.modals = new ModalsPO(this.browser);
    }
    public void createTester(String testerFirstName, String testerLastName, String testerEmail, String testerPassword, String countryOption, String testerRolOption){
        createTester.clickGoFormNewTester();
        createTester.enterFirstName(testerFirstName);
        createTester.enterLastName(testerLastName);
        createTester.enterTesterEmail(testerEmail);
        createTester.enterPassword(testerPassword);
        createTester.openCountrySelect();
        createTester.clickCountryOption(countryOption);
        createTester.clickRolTesterOption(testerRolOption);
        createTester.clickConfirmNewTester();
        modals.clickConfirmSuccessFullyModal();
    }
}
