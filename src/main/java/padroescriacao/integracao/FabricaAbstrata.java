package padroescriacao.integracao;

// Abstract Factory
public interface FabricaAbstrata {
    Comunicado createComunicado();
    Acionamento createAcionamento();
}
