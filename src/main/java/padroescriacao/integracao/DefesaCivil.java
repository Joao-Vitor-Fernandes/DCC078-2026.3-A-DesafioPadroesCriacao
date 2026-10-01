package padroescriacao.integracao;

// Integração
public class DefesaCivil {

    public String emitirAlerta(String tipoAlerta, FabricaAbstrata fabrica) {
        ConfigDefesaCivil config = ConfigDefesaCivil.getInstance();

        if (config.getMunicipio() == null || config.getOperadorLogado() == null) {
            throw new IllegalStateException("Defesa Civil não configurada");
        }

        IAlerta alerta = AlertaFactory.obterAlerta(tipoAlerta);
        Ocorrencia ocorrencia = new Ocorrencia(fabrica);

        return config.getMunicipio() + " | Operador: " + config.getOperadorLogado() +
            " | " + alerta.emitir() +
            " | " + ocorrencia.divulgarComunicado() +
            " | " + ocorrencia.acionarEquipes();
    }

    public String cancelarAlerta(String tipoAlerta) {
        IAlerta alerta = AlertaFactory.obterAlerta(tipoAlerta);
        return alerta.cancelar();
    }
}
