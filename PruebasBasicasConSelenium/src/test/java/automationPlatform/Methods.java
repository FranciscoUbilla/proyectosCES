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
    public void searchGoogle(String entryValue){
        WebElement input = driver.findElement(By.cssSelector(Selectors.GOOGLE_INPUT_SEARCH));
        input.sendKeys(entryValue);
        input.submit();

    }
}
