package AC2.DEVOPS.ENTITY;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Embedded
    private Aluno_Email email;

    private String assinatura; // "Basic" ou "Premium"
    private int cursosDisponiveis;
    private int cursosRealizados;
    private int forunsEscritos;
    private int coins;

    // Construtor padrão
    public Aluno() {}

    // Construtor com parâmetros
    public Aluno(String nome, Aluno_Email email, String assinatura, int cursosDisponiveis, int cursosRealizados, int forunsEscritos, int coins) {
        this.nome = nome;
        this.email = email;
        this.assinatura = assinatura;
        this.cursosDisponiveis = cursosDisponiveis;
        this.cursosRealizados = cursosRealizados;
        this.forunsEscritos = forunsEscritos;
        this.coins = coins;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno_Email getEmail() {
        return email;
    }

    public void setEmail(Aluno_Email email) {
        this.email = email;
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
}
