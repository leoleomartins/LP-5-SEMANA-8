package padroesestruturais.composite;

public class Preparo extends Conteudo {

    private int tempoPreparo;

    public Preparo(String nome, int tempoPreparo) {
        super(nome);
        this.tempoPreparo = tempoPreparo;
    }

    public int getCargaHoraria() {
        return tempoPreparo;
    }

    public void setCargaHoraria(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    public String getConteudo() {
        return "Preparo: " + this.getDescricao() + " - tempo de preparo: " + this.tempoPreparo + "\n";
    }

}
