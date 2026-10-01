package padroescriacao.integracao;

// Factory Method
public class AlertaFactory {

    public static IAlerta obterAlerta(String alerta) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("padroescriacao.integracao.Alerta" + alerta);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Alerta inexistente");
        }
        if (!(objeto instanceof IAlerta)) {
            throw new IllegalArgumentException("Alerta inválido");
        }
        return (IAlerta) objeto;
    }
}
