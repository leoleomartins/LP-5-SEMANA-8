package padroesestruturais.facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Setor {

    private List<Investidor> investidoresComPendencia = new ArrayList<Investidor>();

    public void addInvestidorPendente(Investidor investidor) {
        this.investidoresComPendencia.add(investidor);
    }

    public boolean verificarInvestidorComPendencia(Investidor investidor) {
        return investidoresComPendencia.contains(investidor);
    }

}

