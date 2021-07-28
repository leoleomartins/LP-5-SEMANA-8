package padroesestruturais.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvestidorTest {

    @Test
    void deveRetornarPendenciaAtendimentoFechamento() {
        Investidor investidor = new Investidor();
        Atendimento.getInstancia().addInvestidorPendente(investidor);

        assertEquals(false, investidor.fecharConta());
    }

    @Test
    void deveRetornarPendenciaGerenciaFechamento() {
        Investidor investidor = new Investidor();
        Gerencia.getInstancia().addInvestidorPendente(investidor);

        assertEquals(false, investidor.fecharConta());
    }

    @Test
    void deveRetornarPendenciaFinanceiroFechamento() {
        Investidor investidor = new Investidor();
        Financeiro.getInstancia().addInvestidorPendente(investidor);

        assertEquals(false, investidor.fecharConta());
    }

    @Test
    void deveRetornarInvestidorSemPendenciaFechamento() {
        Investidor investidor = new Investidor();

        assertEquals(true, investidor.fecharConta());
    }

}