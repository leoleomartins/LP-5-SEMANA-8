package padroesestruturais.composite;

public class Ingrediente {

    private Conteudo nome;

    public void setEmenta(Conteudo nome) {
        this.nome = nome;
    }

    public String getEmenta() {
        if (this.nome == null) {
            throw new NullPointerException("Sem Ingrediente");
        }
        return this.nome.getConteudo();
    }
}
