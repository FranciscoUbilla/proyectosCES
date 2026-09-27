package com.tatf.adminCes.modals.pom;

import com.tatf.adminCes.Selectors;
import com.tatf.core.browser.IBrowser;

public class ModalsPO {
    private final IBrowser browser;
    public ModalsPO(IBrowser browser) {
        this.browser = browser;
    }

    public void clickConfirmSuccessFullyModal() {
        browser.find().css(Selectors.ADMINCES_SUCCESSFULLYMODAL_OK_BUTTON).click();
    }
}

