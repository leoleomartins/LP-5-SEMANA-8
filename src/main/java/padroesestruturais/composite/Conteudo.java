package padroesestruturais.composite;

public abstract class Conteudo {

    private String nome;

    public Conteudo(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return nome;
    }

    public void setDescricao(String nome) {
        this.nome = nome;
    }

    public abstract String getConteudo();
}
