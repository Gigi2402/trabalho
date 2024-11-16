package AC2.DEVOPS.DTO;

import AC2.DEVOPS.ENTITY.Cursos.Aluno;

public class AlunoDTO {
    private String nome;
    private String assinatura;
    private int cursosDisponiveis;
    private int cursosRealizados;
    private int forunsEscritos;
    private int coins;

    // Construtor vazio
    public AlunoDTO() {}

    // Construtor com todos os parâmetros
    public AlunoDTO(String nome, String assinatura, int cursosDisponiveis, int cursosRealizados, int forunsEscritos, int coins) {
        this.nome = nome;
        this.assinatura = assinatura;
        this.cursosDisponiveis = cursosDisponiveis;
        this.cursosRealizados = cursosRealizados;
        this.forunsEscritos = forunsEscritos;
        this.coins = coins;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(String assinatura) {
        this.assinatura = assinatura;
    }

    public int getCursosDisponiveis() {
        return cursosDisponiveis;
    }

    public void setCursosDisponiveis(int cursosDisponiveis) {
        this.cursosDisponiveis = cursosDisponiveis;
    }

    public int getCursosRealizados() {
        return cursosRealizados;
    }

    public void setCursosRealizados(int cursosRealizados) {
        this.cursosRealizados = cursosRealizados;
    }

    public int getForunsEscritos() {
        return forunsEscritos;
    }

    public void setForunsEscritos(int forunsEscritos) {
        this.forunsEscritos = forunsEscritos;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    // Método de conversão de Aluno para AlunoDTO
    public static AlunoDTO fromEntity(Aluno aluno) {
        return new AlunoDTO(
            aluno.nome,
            aluno.assinatura,
            aluno.cursosDisponiveis,
            aluno.cursosRealizados,
            aluno.forunsEscritos,
            aluno.coins
        );
    }

    // Método de conversão de AlunoDTO para Aluno
    public static Aluno toEntity(AlunoDTO alunoDTO) {
        return new Aluno(
            alunoDTO.getNome(),
            alunoDTO.getAssinatura(),
            alunoDTO.getCursosDisponiveis(),
            alunoDTO.getCursosRealizados(),
            alunoDTO.getForunsEscritos(),
            alunoDTO.getCoins()
        );
    }
}



