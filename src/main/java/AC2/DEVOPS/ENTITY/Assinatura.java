package AC2.DEVOPS.ENTITY;

public class Assinatura {
    private String tipo; // "Basic" ou "Premium"
    private boolean atualizacaoAutomatica; // Status da renovação automática

    // Construtor
    public Assinatura(String tipo, boolean atualizacaoAutomatica) {
        this.tipo = tipo;
        this.atualizacaoAutomatica = atualizacaoAutomatica;
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isAtualizacaoAutomatica() {
        return atualizacaoAutomatica;
    }

    public void setAtualizacaoAutomatica(boolean atualizacaoAutomatica) {
        this.atualizacaoAutomatica = atualizacaoAutomatica;
    }
}
