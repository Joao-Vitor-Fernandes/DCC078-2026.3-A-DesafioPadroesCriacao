package padroescriacao.integracao;

// Abstract Factory
public class ComunicadoAtencao implements Comunicado {

    public String divulgar() {
        return "Comunicado de atenção divulgado por SMS";
    }
}
