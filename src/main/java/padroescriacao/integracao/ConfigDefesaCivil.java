package padroescriacao.integracao;

public class ConfigDefesaCivil {

    private ConfigDefesaCivil() {};
    private static ConfigDefesaCivil instance = new ConfigDefesaCivil();
    public static ConfigDefesaCivil getInstance() {
        return instance;
    }

    private String municipio;
    private String operadorLogado;

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getOperadorLogado() {
        return operadorLogado;
    }

    public void setOperadorLogado(String operadorLogado) {
        this.operadorLogado = operadorLogado;
    }
}
