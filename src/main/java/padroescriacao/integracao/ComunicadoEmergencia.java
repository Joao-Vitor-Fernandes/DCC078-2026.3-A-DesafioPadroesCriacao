package padroescriacao.integracao;

public class ComunicadoEmergencia implements Comunicado {

    public String divulgar() {
        return "Comunicado de emergência divulgado por SMS e sirene";
    }
}
