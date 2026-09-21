package automationPlatform;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class TestCaseChrome extends Context{
    Methods methods;
    @Test
    void test_GOOGLETC001_SearchExistResult(){
        Variables.entryValue = "hace strogonoff en 4 pasos";
        String expectedResult = "Recetas de strogonoff fáciles y rápidas";
        methods = new Methods(driver);
        methods.setImplicitWait(10);
        methods.goPage(Variables.googleNavigationLink);
        methods.googleSearch(Variables.entryValue);
        String searchResult = driver.findElement(By.xpath(Selectors.ASSERTION_GOOGLE_RESULTPAGE)).getText();
        message.messageResultObtained(searchResult);
        Assertions.assertEquals(expectedResult,searchResult,"El titulo de la pagina no es el esperado");
    }
    @Test
    void test_GOOGLETC002_SearchNoExistResult(){
        Variables.entryValue = "https://drive.google.com/drive/u/0/folders/1s_nA3oEY_WM_pmAPCP0_DHQ_4ajhdjasdsad";
        String expectedResult = "No se han encontrado resultados para tu búsqueda ("+Variables.entryValue+").";
        methods = new Methods(driver);
        methods.setImplicitWait(10);
        methods.goPage(Variables.googleNavigationLink);
        methods.googleSearch(Variables.entryValue);
        String searchResult = driver.findElement(By.xpath(Selectors.ASSERTION_GOOGLE_EMPTYRESULT)).getText();
        message.messageResultObtained(searchResult);
        Assertions.assertEquals(expectedResult,searchResult,"El resultado de la pagina no es el esperado");
    }
    @Test
    void test_GOOGLETC003_SearchEmptyInput() throws InterruptedException{
        Variables.entryValue = "";
        methods = new Methods(driver);
        methods.setImplicitWait(10);
        methods.goPage(Variables.googleNavigationLink);
        methods.googleSearch(Variables.entryValue);
        Thread.sleep(1500);
        String urlAfter = driver.getCurrentUrl();
        WebElement searchBox = driver.findElement(By.cssSelector(Selectors.GOOGLE_SEARCH_INPUT));
        String fieldValue = searchBox.getAttribute("value");
        message.messageResultObtained(urlAfter);
        Assertions.assertFalse(urlAfter.contains("/search?q="), "La URL no debería indicar que se ejecutó una búsqueda");
        Assertions.assertEquals("", fieldValue);
    }
}
