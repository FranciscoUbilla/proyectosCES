package automationPlatform;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;
import java.time.Duration;

public class TestCaseWikipedia extends Context{
    Methods methods;
    @Test
    void test_WIKIPEDIAC001_Searchhola_mundo(){
        Variables.entryValue = "hola mundo";
        String expectedResult = "Hola mundo";
        methods = new Methods(driver);
        methods.goPage(Variables.wikipediaNavigationLink);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        methods.wikipediaSearch(Variables.entryValue);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String searchResult = driver.findElement(By.cssSelector(Selectors.ASSERTION_WIKIPEDIA_TITLERESULTPAGE)).getText();
        message.messageResultObtained(searchResult);
        Assertions.assertEquals(expectedResult,searchResult,"El titulo de la pagina no es el esperado");
    }
    @Test
    void test_WIKIPEDIAC002_Searchhello_world(){
        Variables.entryValue = "hello world";
        String expectedResult = "Hola mundo";
        methods = new Methods(driver);
        methods.goPage(Variables.wikipediaNavigationLink);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        methods.wikipediaSearch(Variables.entryValue);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String searchResult = driver.findElement(By.cssSelector(Selectors.ASSERTION_WIKIPEDIA_TITLERESULTPAGE)).getText();
        message.messageResultObtained(searchResult);
        Assertions.assertEquals(expectedResult,searchResult,"El titulo de la pagina no es el esperado");
    }
    //este caso falla a proposito
    @Test
    void test_WIKIPEDIAC003_Searchholamundo(){
        Variables.entryValue = "holamundo";
        methods = new Methods(driver);
        methods.goPage(Variables.wikipediaNavigationLink);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        methods.wikipediaSearch(Variables.entryValue);
        List<WebElement> searchResultsList = driver.findElements(By.cssSelector(Selectors.ASSERTION_WIKIPEDIA_SEARCHRESULTLIST));
        Assertions.assertFalse(searchResultsList.isEmpty(), "No se encontró ninguna lista de resultados");
        List<String> resultsText = searchResultsList.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        message.messageResultObtained(resultsText.toString());
        Assertions.assertFalse(resultsText.isEmpty(), "La búsqueda no devolvió ningún resultado");
    }
}
