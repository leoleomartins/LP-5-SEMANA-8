package padroesestruturais.facade;

public class Gerencia extends Setor {

    private static Gerencia gerencia = new Gerencia();

    private Gerencia() {};
    public static Gerencia getInstancia() {
        return gerencia;
    }

}
