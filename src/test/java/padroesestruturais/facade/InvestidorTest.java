package padroesestruturais.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvestidorTest {

    @Test
    void deveRetornarPendenciaBibliotecaFechamento() {
        Investidor investidor = new Investidor();
        Biblioteca.getInstancia().addInvestidorPendente(investidor);

        assertEquals(false, investidor.fecharConta());
    }

    @Test
    void deveRetornarPendenciaSecretariaFechamento() {
        Investidor investidor = new Investidor();
        Secretaria.getInstancia().addInvestidorPendente(investidor);

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