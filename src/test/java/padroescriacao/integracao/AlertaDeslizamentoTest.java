package padroescriacao.integracao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlertaDeslizamentoTest {

    @Test
    void deveEmitirDeslizamento() {
        IAlerta alerta = AlertaFactory.obterAlerta("Deslizamento");
        assertEquals("Alerta de deslizamento emitido", alerta.emitir());
    }

    @Test
    void deveCancelarDeslizamento() {
        IAlerta alerta = AlertaFactory.obterAlerta("Deslizamento");
        assertEquals("Alerta de deslizamento cancelado", alerta.cancelar());
    }
}
