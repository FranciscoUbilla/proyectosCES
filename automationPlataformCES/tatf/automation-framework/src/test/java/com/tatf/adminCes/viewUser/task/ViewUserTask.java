package com.tatf.adminCes.viewUser.task;

import com.tatf.adminCes.base.ConsoleMessage;
import com.tatf.adminCes.modals.pom.ModalsPO;
import com.tatf.adminCes.modals.task.ModalsTask;
import com.tatf.adminCes.viewUser.data.ViewUserData;
import com.tatf.adminCes.viewUser.pom.ViewUserPO;
import com.tatf.core.browser.IBrowser;
import com.tatf.core.element.Element;
import com.tatf.core.verification.IVerify;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class ViewUserTask {
    private final IBrowser browser;
    private final ViewUserPO viewUser;
    private final ModalsTask modals;
    private final ConsoleMessage message;
    public ViewUserTask (IBrowser browser){
        this.browser = browser;
        this.viewUser = new ViewUserPO(this.browser);
        this.modals = new ModalsTask(this.browser);
        this.message = new ConsoleMessage();
    }
    public void deleteUserAndVerify(String testEmail, String option,String bodyQuestionModal, String bodySuccessDeleteModal){
        deleteUser(testEmail, option, bodyQuestionModal, bodySuccessDeleteModal);
        verifyNoExistUser(testEmail);
    }
    public void deleteUser(String testEmail, String option, String bodyQuestionModal, String bodySuccessDeleteModal){
        viewUser.clickGoViewUsers();
        viewUser.clickDeleteUser(testEmail);
        modals.clickAndVerifyQuestionModal(option, bodyQuestionModal);
        modals.clickAndVerifyConfirmSuccessFullyModal(bodySuccessDeleteModal);
    }
    public void verifyNoExistUser(String testerEmail) {
        IVerify.create().verifyFalse(viewUser.iterateList(testerEmail), "El usuario " + testerEmail + " sigue siendo visible");
        message.messageResultObtained(viewUser.iterateList(testerEmail));
    }
    public void verifyExistUser(String testerEmail){
        IVerify.create().verifyTrue(viewUser.iterateList(testerEmail), "El usuario " + testerEmail + " sigue siendo visible");
        message.messageResultObtained(viewUser.iterateList(testerEmail));
    }
}
