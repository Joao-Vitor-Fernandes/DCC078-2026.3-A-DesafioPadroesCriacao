package padroescriacao.integracao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Singleton
public class ConfigDefesaCivilTest {

    @Test
    public void deveRetornarMunicipio() {
        ConfigDefesaCivil.getInstance().setMunicipio("Municipio 1");
        assertEquals("Municipio 1", ConfigDefesaCivil.getInstance().getMunicipio());
    }

    @Test
    public void deveRetornarOperadorLogado() {
        ConfigDefesaCivil.getInstance().setOperadorLogado("Operador 1");
        assertEquals("Operador 1", ConfigDefesaCivil.getInstance().getOperadorLogado());
    }
}
