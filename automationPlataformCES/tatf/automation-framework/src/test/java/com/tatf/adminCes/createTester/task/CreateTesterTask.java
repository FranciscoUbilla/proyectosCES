package com.tatf.adminCes.createTester.task;

import com.tatf.adminCes.base.TestExecutionsUtils;
import com.tatf.adminCes.createTester.data.CreateTesterData;
import com.tatf.adminCes.createTester.pom.CreateTesterPO;
import com.tatf.adminCes.modals.pom.ModalsPO;
import com.tatf.adminCes.viewUser.pom.ViewUserPO;
import com.tatf.adminCes.viewUser.task.ViewUserTask;
import com.tatf.core.browser.IBrowser;

public class CreateTesterTask {
    private final IBrowser browser;
    private final CreateTesterPO createTester;
    private final ModalsPO modals;
    private final ViewUserPO viewPO;
    private final ViewUserTask viewTask;

    public CreateTesterTask (IBrowser browser){
        this.browser = browser;
        this.createTester = new CreateTesterPO(this.browser);
        this.modals = new ModalsPO(this.browser);
        this.viewPO = new ViewUserPO(this.browser);
        this.viewTask = new ViewUserTask(this.browser);
    }
    public void createTester(CreateTesterData data){
        createTester.clickGoFormNewTester();
        createTester.enterFirstName(data.testerFirstName);
        createTester.enterLastName(data.testerLastName);
        createTester.enterTesterEmail(data.testerEmail);
        createTester.enterPassword(data.testerPassword);
        createTester.openCountrySelect();
        createTester.clickCountryOption(data.countryOption);
        createTester.clickRolTesterOption(data.userRolOption);
        createTester.clickConfirmNewTester();
        modals.clickConfirmSuccessFullyModal();
    }
    public void createTesterAndVerify(CreateTesterData data, String testerEmail){
        this.createTester(data);
        viewPO.clickGoViewUsers();
        viewTask.verifyExistUser(testerEmail);
    }
}
