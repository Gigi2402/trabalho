package AC2.DEVOPS.ENTITY;

public class Forum {
    private String id; // Identificador único do fórum
    private String comentario; // Comentário do aluno no fórum
    private int recompensas; // Recompensas obtidas pela participação

    // Construtor
    public Forum(String id, String comentario, int recompensas) {
        this.id = id;
        this.comentario = comentario;
        this.recompensas = recompensas;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getRecompensas() {
        return recompensas;
    }

    public void setRecompensas(int recompensas) {
        this.recompensas = recompensas;
    }
}
