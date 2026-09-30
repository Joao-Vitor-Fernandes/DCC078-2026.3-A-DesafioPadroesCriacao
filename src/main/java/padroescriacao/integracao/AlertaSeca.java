package padroescriacao.integracao;

public class AlertaSeca implements IAlerta {

    public String emitir() {
        return "Alerta de seca emitido";
    }

    public String cancelar() {
        return "Alerta de seca cancelado";
    }
}
