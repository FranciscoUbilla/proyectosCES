package com.tatf.adminCes;

import com.tatf.core.browser.BrowserFactory;
import com.tatf.core.browser.IBrowser;
import org.junit.jupiter.api.*;

public class Context {
    protected static IBrowser browser;
    protected static Methods methods;
    protected static ConsoleMessage message;
    @BeforeAll
    static void beforeAll() {
        browser = BrowserFactory.getBrowser(true);
        methods = new Methods(browser);
        message = new ConsoleMessage();

    }
    @BeforeEach
    void beforeEach(TestInfo testInfo){
        message.messageStartTest(testInfo.getDisplayName());
    }
    @AfterEach
    void afterEach(TestInfo testInfo){
        message.messageEndTest();
    }
    @AfterAll
    static void afterAll() {
        BrowserFactory.quitBrowser();
    }
}
