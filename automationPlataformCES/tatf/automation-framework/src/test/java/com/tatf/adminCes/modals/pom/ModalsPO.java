package com.tatf.adminCes.modals.pom;

import com.tatf.core.browser.IBrowser;

public class ModalsPO {
    private final IBrowser browser;
    private final String ADMINCES_SUCCESSFULLYMODAL_OK_BUTTON = ".swal2-actions > button:nth-of-type(1)";
    private final String MODAL_QUESTION_YES_BUTTON = ".swal2-confirm";
    private final String MODAL_TITLE = "#swal2-title";
    private final String MODAL_QUESTION_CANCEL_BUTTON = ".swal2-cancel";
    private final String MODAL_BODY = ".swal2-html-container";

    public ModalsPO(IBrowser browser) {
        this.browser = browser;
    }

    public void clickConfirmSuccessFullyModal() {
        browser.find().css(ADMINCES_SUCCESSFULLYMODAL_OK_BUTTON).click();
    }
    public void clickQuestionModal(String option){
        if(option.equals("yes")) {
            browser.find().css(MODAL_QUESTION_YES_BUTTON).click();
        }else if (option.equals("cancel")){
            browser.find().css(MODAL_QUESTION_CANCEL_BUTTON).click();
        }
    }

    public String getTitleModal(){
        return  browser.find().css(MODAL_TITLE).getText();
    }
    public String getBodyModal(){
        return  browser.find().css(MODAL_BODY).getText();
    }
}

