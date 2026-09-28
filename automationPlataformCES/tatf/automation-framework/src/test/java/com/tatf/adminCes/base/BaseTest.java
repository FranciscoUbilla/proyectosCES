package com.tatf.adminCes.base;

import com.tatf.core.browser.BrowserFactory;
import com.tatf.core.browser.IBrowser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;


//Se que mi sistema aun tiene selectores que dependen de la posicion, para la proxima entrega los mejoro.

public class BaseTest {

    protected static IBrowser browser;
    protected static ConsoleMessage message;
    protected static String URL;
    protected static String HASH;
    @BeforeEach
    void beforeEach(TestInfo testInfo){
        browser = BrowserFactory.getBrowser(true);
        message = new ConsoleMessage();
        message.messageStartTest(testInfo.getDisplayName());
        HASH = "3)ea60e0be3ba12c6ecd%7297868%5c4";
        URL = "http://cestore.ces.com.uy/adminces/";
    }
    @AfterEach
    void afterEach(){
        message.messageEndTest();
        BrowserFactory.quitBrowser();


    }
}
