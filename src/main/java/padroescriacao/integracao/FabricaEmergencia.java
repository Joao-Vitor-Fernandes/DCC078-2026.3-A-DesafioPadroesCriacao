package padroescriacao.integracao;

// Abstract Factory
public class FabricaEmergencia implements FabricaAbstrata {

    @Override
    public Comunicado createComunicado() {
        return new ComunicadoEmergencia();
    }

    @Override
    public Acionamento createAcionamento() {
        return new AcionamentoEmergencia();
    }
}
