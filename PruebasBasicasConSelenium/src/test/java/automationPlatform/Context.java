package automationPlatform;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Context{
    protected WebDriver driver;
    protected ConsoleMessage message;
    @BeforeEach
    void startWebDriver(TestInfo testInfo){
        driver = new ChromeDriver();
        message = new ConsoleMessage();
        message.messageStartTest(testInfo.getDisplayName());
    }
    @AfterEach
    void endTest(){
        driver.quit();
        message.messageEndTest();
    }
}



