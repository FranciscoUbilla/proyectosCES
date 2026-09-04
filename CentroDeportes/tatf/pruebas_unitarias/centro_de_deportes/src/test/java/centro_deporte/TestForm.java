package centro_deporte;
import com.google.errorprone.annotations.Var;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.assertj.core.api.Assertions;

import java.time.Duration;

public class TestForm extends contexto{
    Variables variables = new Variables();
    Methods methods;
    @Test
    void testCheckout(){
        methods = new Methods(driver);
        driver.get(variables.linkSauceDemo);
        methods.login(variables.username, variables.password);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        methods.addToCartAndGoCheckOut();
        methods.checkout(variables.first_name, variables.last_name, variables.postal_code);
        String finishMessage = driver.findElement(By.xpath("//h2[@data-test='complete-header']")).getText();
        Assertions.assertThat(finishMessage).as("Título no es el esperado").isEqualTo("Thank you for your order!");
    }
}