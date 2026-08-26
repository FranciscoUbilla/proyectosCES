package centro_deporte;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;

public class contexto {

    @BeforeEach
    void iniciarTest(TestInfo testInfo){
        MensajesConsola mensaje = new MensajesConsola();
        mensaje.iniciandoTest(testInfo.getDisplayName());
    }
}
