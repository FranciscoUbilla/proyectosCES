package centro_deporte;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class contexto {
    protected WebDriver driver;
    MensajesConsola mensaje;

    @BeforeEach
    void iniciarTest(TestInfo testInfo){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-blink-features=AutomationControlled");
        driver = new ChromeDriver(options);
        mensaje = new MensajesConsola();
        mensaje.iniciandoTest(testInfo.getDisplayName());
    }
    @AfterEach
    void endTest(){
        driver.quit();
        mensaje.mensajeFinTest();
    }
}
