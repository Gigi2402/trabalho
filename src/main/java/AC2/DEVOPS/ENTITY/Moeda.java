package AC2.DEVOPS.ENTITY;

public class Moeda {
    private int quantidade; // Quantidade de moedas virtuais do aluno

    // Construtor
    public Moeda(int quantidade) {
        this.quantidade = quantidade;
    }

    // Getters e Setters
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
