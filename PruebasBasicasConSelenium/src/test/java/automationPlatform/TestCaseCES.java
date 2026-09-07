package automationPlatform;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.time.Duration;

public class TestCaseCES extends Context {
    Methods methods;
    @Test
    void test_CESFORUM_searchBienvenida() {
        String expectedMessageLogin = "¡Te damos la bienvenida al Aula Virtual!";
        String expectedMessageTatf = "TALLER DE AUTOMATIZACIÓN DEL TESTING FUNCIONAL 202608A";
        String expectedMessageForum = "Foros generales";
        Variables.entryValue = "Bienvenida";
        String expectedTestCaseResult = "¡Bienvenid@s al curso!";
        methods = new Methods(driver);
        methods.goPage(Variables.cesNavigationLink);
        methods.setImplicitWait(10);
        methods.cesLogin(Variables.cesUsername, Variables.cesPassword);
        String loginResultMessage = driver.findElement(By.xpath(Selectors.ASSERTION_SUCCESS_LOGIN)).getText();
        Assertions.assertEquals(expectedMessageLogin,loginResultMessage,"No se ha logeado correctamente");
        methods.cesGoToTatf();
        String tatfResultMessage = driver.findElement(By.xpath(Selectors.ASSERTION_CES_SUCCESS_LOAD_TATF)).getText();
        Assertions.assertEquals(expectedMessageTatf,tatfResultMessage,"No se ha navegado correctamente al curso TATF");
        methods.cesGoToForum();
        String forumResultMessage = driver.findElement(By.xpath(Selectors.ASSERTION_CES_SUCCESS_LOAD_FORUM)).getText();
        Assertions.assertEquals(expectedMessageForum,forumResultMessage,"No se ha navegado correctamente al foro");
        methods.cesSearchForum(Variables.entryValue);
        String bienvenidaMessageResult = driver.findElement(By.xpath(Selectors.ASSERTION_CES_LOAD_FORUMBIENVENIDA)).getText();
        message.messageResultObtained(bienvenidaMessageResult);
        Assertions.assertEquals(expectedTestCaseResult,bienvenidaMessageResult,"No se ha navegado correctamente al foro");
        methods.cesLogout();
    }

    //Oportunidad de mejora: hacer una clase para manejar los assertion. Que haya un metodo que espere recibir selector y resultado esperado
    /*Algo que no me gusta tanto de selenium es que aunque se separe el comportamiento en metodos el codigo final del
     caso igual queda bastante sucio al tener que obtener los selectores que contienen lo que querramos validar*/
}
