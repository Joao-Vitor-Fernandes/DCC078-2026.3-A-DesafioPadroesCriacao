package padroescriacao.integracao;

// Abstract Factory
public class ComunicadoEmergencia implements Comunicado {

    public String divulgar() {
        return "Comunicado de emergência divulgado por SMS e sirene";
    }
}
