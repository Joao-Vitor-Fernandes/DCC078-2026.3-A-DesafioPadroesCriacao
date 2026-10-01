package padroescriacao.integracao;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Integração
public class DefesaCivilTest {
    private DefesaCivil defesaCivil = new DefesaCivil();

    @BeforeEach
    void padrao() {
        ConfigDefesaCivil config = ConfigDefesaCivil.getInstance();
        config.setMunicipio("Defesa Civil 1");
        config.setOperadorLogado("Marcos");
    }

    @Test
    void deveFalharQuandoMunicipioNaoConfigurado() {
        ConfigDefesaCivil.getInstance().setMunicipio(null);
        try {
            defesaCivil.emitirAlerta("Enchente", new FabricaAtencao());
            fail();
        } catch (IllegalStateException e) {
            assertEquals("Defesa Civil não configurada", e.getMessage());
        }
    }

    @Test
    void deveFalharQuandoOperadorNaoLogado() {
        ConfigDefesaCivil.getInstance().setOperadorLogado(null);
        try {
            defesaCivil.emitirAlerta("Enchente", new FabricaAtencao());
            fail();
        } catch (IllegalStateException e) {
            assertEquals("Defesa Civil não configurada", e.getMessage());
        }
    }

    @Test
    void deveEmitirEnchenteDeAtencao() {
        assertEquals("Defesa Civil 1 | Operador: Marcos"
            + " | Alerta de enchente emitido"
            + " | Comunicado de atenção divulgado por SMS"
            + " | Equipes de monitoramento acionadas",
        defesaCivil.emitirAlerta("Enchente", new FabricaAtencao()));
    }

    @Test
    void deveCancelarEnchente() {
        assertEquals("Alerta de enchente cancelado", defesaCivil.cancelarAlerta("Enchente"));
    }
}
