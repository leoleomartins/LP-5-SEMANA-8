package padroesestruturais.facade;

public class InvestidorFacade {

    public static boolean verificarPendenciasFechamento(Investidor investidor) {
        if (Gerencia.getInstancia().verificarInvestidorComPendencia(investidor)) {
            return false;
        }
        if (Atendimento.getInstancia().verificarInvestidorComPendencia(investidor)) {
            return false;
        }
        if (Financeiro.getInstancia().verificarInvestidorComPendencia(investidor)) {
            return false;
        }
        return true;
    }
}
