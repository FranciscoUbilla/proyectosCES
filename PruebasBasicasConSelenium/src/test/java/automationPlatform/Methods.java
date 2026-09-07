package automationPlatform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Methods {
    private WebDriver driver;
    public Methods(WebDriver driver) {
        this.driver = driver;
    }

    public void goPage(String linkNavigation){
        driver.get(linkNavigation);
    }
    public void googleSearch(String entryValue){
        WebElement input = driver.findElement(By.cssSelector(Selectors.GOOGLE_SEARCH_INPUT));
        input.sendKeys(entryValue);
        input.submit();

    }
    public void wikipediaSearch(String entryValue){
        WebElement inputContainer = driver.findElement(By.cssSelector(Selectors.WIKIPEDIA_SEARCH_INPUTCONTAINER));
        inputContainer.click();
        WebElement input = driver.findElement(By.cssSelector(Selectors.WIKIPEDIA_SEARCH_INPUT));
        input.sendKeys(entryValue);
        input.submit();
    }
}
