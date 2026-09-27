package com.tatf.adminCes.modals.pom;

import com.tatf.core.browser.IBrowser;

public class ModalsPO {
    private final IBrowser browser;
    private final String ADMINCES_SUCCESSFULLYMODAL_OK_BUTTON = ".swal2-actions > button:nth-of-type(1)";
    public static String ADMINCES_LOGOUT_MODAL_YES_BUTTON = ".swal2-confirm";

    public ModalsPO(IBrowser browser) {
        this.browser = browser;
    }
    public void clickConfirmSuccessFullyModal() {
        browser.find().css(ADMINCES_SUCCESSFULLYMODAL_OK_BUTTON).click();
    }
    public void clickYesQuestionModal(){
        browser.find().css(ADMINCES_LOGOUT_MODAL_YES_BUTTON).click();
    }

}

