package padroesestruturais.facade;

public class InvestidorFacade {

    public static boolean verificarPendenciasFechamento(Investidor investidor) {
        if (Secretaria.getInstancia().verificarInvestidorComPendencia(investidor)) {
            return false;
        }
        if (Biblioteca.getInstancia().verificarInvestidorComPendencia(investidor)) {
            return false;
        }
        if (Financeiro.getInstancia().verificarInvestidorComPendencia(investidor)) {
            return false;
        }
        return true;
    }
}
