package automationPlatform;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCaseChrome extends Context{
    @Test
    void openPage(){
        driver.get("https://www.selenium.dev");
        String tituloObtenido = driver.getTitle();
        message.messageResultObtained(tituloObtenido);
        Assertions.assertEquals("Selenium",tituloObtenido,"El titulo de la pagina no es el esperado");

    }
}
