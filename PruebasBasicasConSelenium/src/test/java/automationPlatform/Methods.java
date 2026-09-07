package automationPlatform;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

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
    public void cesLogin(String userName, String password){
        WebElement goToFormLoginButton = driver.findElement(By.cssSelector(Selectors.CES_GOTOFORMLOGIN_BUTTON));
        goToFormLoginButton.click();
        WebElement userNameInput = driver.findElement(By.cssSelector(Selectors.CES_USERNAME_INPUT));
        WebElement passwordInput = driver.findElement(By.cssSelector(Selectors.CES_PASSWORD_INPUT));
        WebElement loginButton = driver.findElement(By.cssSelector(Selectors.CES_LOGIN_BUTTON));
        userNameInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
    public void cesGoToTatf(){
        WebElement goToTatf = driver.findElement(By.cssSelector(Selectors.CES_GOTO_TATF));
        goToTatf.click();
    }
    public void cesGoToForum() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement goToForum = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(Selectors.CES_GOTO_FORUM)));
        goToForum.click();
    }
    public void cesSearchForum(String entryValue){
        WebElement inputSearch = driver.findElement(By.cssSelector(Selectors.CES_INPUT_SEARCH));
        inputSearch.sendKeys(entryValue);
        inputSearch.submit();
    }
    public void cesLogout(){
        WebElement toggleButton = driver.findElement(By.cssSelector(Selectors.CES_USERMENU_TOGGLE));
        toggleButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement logoutButton = driver.findElement(By.cssSelector(Selectors.CES_LOGOUT_BUTTON));
        logoutButton.click();
    }
    public void setImplicitWait(int timeout){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
    }
    /*OPORTUNIDAD DE MEJORA: hacer un unico metodo search para google y ces.
    Y que recibieran el selector que tienen que traerse por parametro*/
}
