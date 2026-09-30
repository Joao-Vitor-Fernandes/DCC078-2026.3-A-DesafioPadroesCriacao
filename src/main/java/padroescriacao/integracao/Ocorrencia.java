package padroescriacao.integracao;

public class Ocorrencia {
    private Comunicado comunicado;
    private Acionamento acionamento;

    public Ocorrencia(FabricaAbstrata fabrica) {
        this.comunicado = fabrica.createComunicado();
        this.acionamento = fabrica.createAcionamento();
    }

    public String divulgarComunicado() {
        return this.comunicado.divulgar();
    }

    public String acionarEquipes() {
        return this.acionamento.acionar();
    }
}
