package com.tatf.adminCes.modals.task;

import com.tatf.adminCes.base.ConsoleMessage;
import com.tatf.adminCes.modals.data.ModalsData;
import com.tatf.adminCes.modals.pom.ModalsPO;
import com.tatf.core.browser.IBrowser;
import com.tatf.core.verification.IVerify;

public class ModalsTask {
    private final IBrowser browser;
    private  final ModalsPO modals;
    private final ConsoleMessage message;
    private final ModalsData data;
    public ModalsTask (IBrowser browser){
        this.browser = browser;
        this.modals = new ModalsPO(browser);
        this.message = new ConsoleMessage();
        this.data = new ModalsData();
    }
    public void clickAndVerifyConfirmSuccessFullyModal(String body) {
        String assertionTitleModal = modals.getTitleModal();
        message.messageResultObtained(assertionTitleModal);
        IVerify.create().verify(data.MODAL_SUCCESSFULLY_TITLE,assertionTitleModal,"El titulo del modal no es correcto");
        String assertionTextBodyModal = modals.getBodyModal();
        message.messageResultObtained(assertionTextBodyModal);
        IVerify.create().verify(body,assertionTextBodyModal,"El cuerpo del modal no es correcto");
        modals.clickConfirmSuccessFullyModal();
    }
    public void clickAndVerifyQuestionModal(String option, String body){
        String assertionTitleModal = modals.getTitleModal();
        message.messageResultObtained(assertionTitleModal);
        IVerify.create().verify(data.MODAL_QUESTION_TITLE,assertionTitleModal,"El titulo del modal no es correcto");
        String assertionTextBodyModal = modals.getBodyModal();
        message.messageResultObtained(assertionTextBodyModal);
        IVerify.create().verify(body,assertionTextBodyModal,"El cuerpo del modal no es correcto");
        modals.clickQuestionModal(option);
    }
}
