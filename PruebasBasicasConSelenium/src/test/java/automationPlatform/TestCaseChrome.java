package automationPlatform;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class TestCaseChrome extends Context{

    @Test
    void search_searchinchrome_searchholamundo(){
        driver.get(Variables.linkNavigatioNChrome);
        WebElement input = driver.findElement(By.cssSelector(SelectorsChrome.INPUT_SEARCH));
        input.sendKeys("Hola mundo wikipedia");
        input.submit();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement button = driver.findElement(By.xpath(SelectorsChrome.BUTTON_LINKWIKIPEDIA_HOLAMUNDOARTICLE));
        button.click();
        String tituloObtenido = driver.getTitle();
        message.messageResultObtained(tituloObtenido);
        Assertions.assertEquals("Hola mundo - Wikipedia, la enciclopedia libre",tituloObtenido,"El titulo de la pagina no es el esperado");

    }
}
