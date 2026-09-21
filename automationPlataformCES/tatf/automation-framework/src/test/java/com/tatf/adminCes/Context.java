package com.tatf.adminCes;

import com.tatf.core.browser.BrowserFactory;
import com.tatf.core.browser.IBrowser;
import org.junit.jupiter.api.*;

public class Context {
    protected static IBrowser browser;
    protected static Methods methods;
    protected static ConsoleMessage message;
    @BeforeEach
    void beforeEach(TestInfo testInfo){
        browser = BrowserFactory.getBrowser(true);
        methods = new Methods(browser);
        message = new ConsoleMessage();
        message.messageStartTest(testInfo.getDisplayName());
    }
    @AfterEach
    void afterEach(){
        message.messageEndTest();
        Methods.reset();
        BrowserFactory.quitBrowser();
    }
}
