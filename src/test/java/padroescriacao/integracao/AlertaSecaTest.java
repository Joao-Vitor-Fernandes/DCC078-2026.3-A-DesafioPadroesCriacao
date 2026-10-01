package padroescriacao.integracao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlertaSecaTest {

    @Test
    void deveEmitirSeca() {
        IAlerta alerta = AlertaFactory.obterAlerta("Seca");
        assertEquals("Alerta de seca emitido", alerta.emitir());
    }

    @Test
    void deveCancelarSeca() {
        IAlerta alerta = AlertaFactory.obterAlerta("Seca");
        assertEquals("Alerta de seca cancelado", alerta.cancelar());
    }
}
