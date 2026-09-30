package padroescriacao.integracao;

public class AlertaDeslizamento implements IAlerta {

    public String emitir() {
        return "Alerta de deslizamento emitido";
    }

    public String cancelar() {
        return "Alerta de deslizamento cancelado";
    }
}
