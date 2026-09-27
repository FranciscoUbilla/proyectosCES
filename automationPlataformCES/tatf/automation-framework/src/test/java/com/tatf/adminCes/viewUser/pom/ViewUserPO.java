package com.tatf.adminCes.viewUser.pom;

import com.tatf.adminCes.base.ConsoleMessage;
import com.tatf.core.browser.IBrowser;
import com.tatf.core.element.Element;
import org.junit.jupiter.api.Assertions;

import java.util.List;
public class ViewUserPO {
    private final IBrowser browser;
    private final String ADMINCES_VIEWUSERS_GOTOVIEWUSERS_BUTTON = ".container-fluid a[href*='view-users']";
    private final String ADMINCES_VIEWUSERS_EMAIL_TD = "#bodyTable > tr > td:nth-of-type(3)";
    private static String ADMINCES_VIEWUSER_DELETE_BUTTON(String testerEmail) {
        return "[id=\""+testerEmail+"\"]";
    }
    ConsoleMessage message;
    public ViewUserPO (IBrowser browser) {
        this.browser = browser;
        message = new ConsoleMessage();
    }
    public void clickGoViewUsers(){
        browser.find().css(ADMINCES_VIEWUSERS_GOTOVIEWUSERS_BUTTON).click();
    }
    public void clickDeleteUser(String testerEmail){
        browser.find().css(ADMINCES_VIEWUSER_DELETE_BUTTON(testerEmail)).click();
    }
    public void verifyDeletetUsers(String testerEmail){
        List<Element> emailCells = browser.find().cssList(ADMINCES_VIEWUSERS_EMAIL_TD);
        boolean userFound = emailCells.stream().anyMatch(cell -> cell.getText().equalsIgnoreCase(testerEmail));
        Assertions.assertFalse(userFound, "El usuario " + testerEmail + " todavia aparece en la lista");
        message.messageResultObtained(userFound);

    }
}
