package centro_deporte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Methods {
    private WebDriver driver;

    public Methods(WebDriver driver) {
        this.driver = driver;
    }

    void login(String username, String password){
        driver.findElement(By.cssSelector(Selectors.INPUT_USER)).sendKeys(username);
        waitonesecond();
        driver.findElement(By.cssSelector(Selectors.INPUT_PASWORD)).sendKeys(password);
        waitonesecond();
        driver.findElement(By.cssSelector(Selectors.BUTTON_LOGIN)).click();
    }
    void addToCartAndGoCheckOut(){
        driver.findElement(By.cssSelector(Selectors.BUTTON_ADDITEM)).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath(Selectors.BUTTON_GOTO_CAR)).click();
    }
    void checkout(String first_name, String last_name, String postal_code){
        driver.findElement(By.cssSelector(Selectors.BUTTON_CHECKOUT)).click();
        driver.findElement(By.cssSelector(Selectors.INPUT_CHECKOUT_FIRSTNAME)).sendKeys(first_name);
        driver.findElement(By.cssSelector(Selectors.INPUT_CHECKOUT_LASTTNAME)).sendKeys(last_name);
        driver.findElement(By.cssSelector(Selectors.INPUT_CHECKOUT_POSTALCODE)).sendKeys(postal_code);
        driver.findElement(By.cssSelector(Selectors.BUTTON_CHECKOUT_CONTINUE)).click();
        driver.findElement(By.cssSelector(Selectors.BUTTON_CHECKOUT_FINISH)).click();
    }

    void waitonesecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
