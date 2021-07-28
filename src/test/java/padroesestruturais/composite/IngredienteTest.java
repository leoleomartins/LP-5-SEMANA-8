package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngredienteTest {

    @Test
    void deveRetornarEmentaIngrediente() {
        Bolo conteudo1 = new Bolo("Cenoura e Laranja");

        Bolo conteudo2 = new Bolo("Chocolate");
        Preparo preparo21 = new Preparo("Forno", 2);
        conteudo2.addConteudo(preparo21);

        Bolo conteudo3 = new Bolo("Maça e Canela");
        Preparo preparo31 = new Preparo("Batedeira", 3);
        Preparo preparo32 = new Preparo("Forno", 4);
        conteudo3.addConteudo(preparo31);
        conteudo3.addConteudo(preparo32);

        Bolo conteudo = new Bolo("Kit de Bolos");
        conteudo.addConteudo(conteudo1);
        conteudo.addConteudo(conteudo2);
        conteudo.addConteudo(conteudo3);

        Ingrediente ingrediente = new Ingrediente();
        ingrediente.setEmenta(conteudo);

        assertEquals("Bolo: Kit de Bolos\n" +
                "Bolo: Cenoura e Laranja\n" +
                "Bolo: Chocolate\n" +
                "Preparo: Forno - tempo de preparo: 2\n" +
                "Bolo: Maça e Canela\n" +
                "Preparo: Batedeira - tempo de preparo: 3\n" +
                "Preparo: Forno - tempo de preparo: 4\n", ingrediente.getEmenta());
    }

    @Test
    void deveRetornarExecacaoSemIngrediente() {
        try {
            Ingrediente ingrediente = new Ingrediente();
            ingrediente.getEmenta();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Sem Ingrediente", e.getMessage());
        }
    }

}