package padroesestruturais.facade;

public class Investidor {

    public boolean fecharConta() {
        return InvestidorFacade.verificarPendenciasFechamento(this);
    }
}
