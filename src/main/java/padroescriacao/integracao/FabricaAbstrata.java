package padroescriacao.integracao;

public interface FabricaAbstrata {
    Comunicado createComunicado();
    Acionamento createAcionamento();
}
