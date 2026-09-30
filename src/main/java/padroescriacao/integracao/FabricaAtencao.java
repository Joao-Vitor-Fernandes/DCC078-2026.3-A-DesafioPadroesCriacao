package padroescriacao.integracao;

public class FabricaAtencao implements FabricaAbstrata {

    @Override
    public Comunicado createComunicado() {
        return new ComunicadoAtencao();
    }

    @Override
    public Acionamento createAcionamento() {
        return new AcionamentoAtencao();
    }
}
