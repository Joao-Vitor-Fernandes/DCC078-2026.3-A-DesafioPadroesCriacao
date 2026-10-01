package padroescriacao.integracao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Factory Method
public class AlertaEnchenteTest {

    @Test
    void deveEmitirEnchente() {
        IAlerta alerta = AlertaFactory.obterAlerta("Enchente");
        assertEquals("Alerta de enchente emitido", alerta.emitir());
    }

    @Test
    void deveCancelarEnchente() {
        IAlerta alerta = AlertaFactory.obterAlerta("Enchente");
        assertEquals("Alerta de enchente cancelado", alerta.cancelar());
    }
}
