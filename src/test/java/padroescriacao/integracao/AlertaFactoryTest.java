package padroescriacao.integracao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Factory Method
public class AlertaFactoryTest {

    @Test
    void deveRetornarExcecaoParaAlertaInexistente() {
        try {
            IAlerta alerta = AlertaFactory.obterAlerta("Tsunami");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Alerta inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaAlertaInvalido() {
        try {
            IAlerta alerta = AlertaFactory.obterAlerta("Incendio");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Alerta inválido", e.getMessage());
        }
    }
}
