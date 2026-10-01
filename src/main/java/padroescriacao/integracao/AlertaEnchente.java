package padroescriacao.integracao;

// Factory Method
public class AlertaEnchente implements IAlerta {

    public String emitir() {
        return "Alerta de enchente emitido";
    }

    public String cancelar() {
        return "Alerta de enchente cancelado";
    }
}
