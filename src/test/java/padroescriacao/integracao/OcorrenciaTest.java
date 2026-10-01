package padroescriacao.integracao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Abstract Factory
public class OcorrenciaTest {

    @Test
    void deveDivulgarComunicadoAtencao() {
        FabricaAbstrata fabrica = new FabricaAtencao();
        Ocorrencia ocorrencia = new Ocorrencia(fabrica);
        assertEquals("Comunicado de atenção divulgado por SMS", ocorrencia.divulgarComunicado());
    }

    @Test
    void deveDivulgarComunicadoEmergencia() {
        FabricaAbstrata fabrica = new FabricaEmergencia();
        Ocorrencia ocorrencia = new Ocorrencia(fabrica);
        assertEquals("Comunicado de emergência divulgado por SMS e sirene", ocorrencia.divulgarComunicado());
    }

    @Test
    void deveAcionarEquipeDeMonitoramento() {
        FabricaAbstrata fabrica = new FabricaAtencao();
        Ocorrencia ocorrencia = new Ocorrencia(fabrica);
        assertEquals("Equipes de monitoramento acionadas", ocorrencia.acionarEquipes());
    }

    @Test
    void deveAcionarEquipesDeResgate() {
        FabricaAbstrata fabrica = new FabricaEmergencia();
        Ocorrencia ocorrencia = new Ocorrencia(fabrica);
        assertEquals("Equipes de resgate acionadas", ocorrencia.acionarEquipes());
    }
}
