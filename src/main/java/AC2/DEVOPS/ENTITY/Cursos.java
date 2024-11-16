package AC2.DEVOPS.ENTITY;

import java.util.HashMap;
import java.util.Map;

public class Cursos {
    private final int MAX_CURSOS = 50; // Limite máximo de cursos
    public Map<String, Aluno> alunos = new HashMap<>();

    public Cursos() {
        // Inicializa o dicionário com alunos
        alunos.put("Pedro", new Aluno("Pedro", "Basic", 1, 0, 0, 0));
        alunos.put("Maria", new Aluno("Maria", "Basic", 1, 0, 0, 0));
        alunos.put("João", new Aluno("João", "Basic", 1, 0, 0, 0));
    }

    public void setCursosConcluidos(String nome, int concluidos) {
        if (alunos.containsKey(nome)) {
            Aluno aluno = alunos.get(nome);

            if (concluidos > MAX_CURSOS) {
                concluidos = MAX_CURSOS;
            }

            aluno.cursosRealizados = concluidos;

            // Atualiza assinatura
            if (aluno.cursosRealizados >= 12) {
                aluno.assinatura = "Premium";
            }

            // Atualiza cursos disponíveis
            if (aluno.cursosRealizados >= 1) {
                aluno.cursosDisponiveis = Math.min((aluno.cursosRealizados * 3) + 1, MAX_CURSOS);
            }

            // Mostra status atualizado
            showStatus();
        }
    }

    //Método para um aluno concluir um curso
    public void concluirCurso(String nome, float nota) {
        if (alunos.containsKey(nome)) {
            Aluno aluno = alunos.get(nome);

            if (aluno.cursosDisponiveis > 0) {
                if (nota >= 7) {
                    aluno.cursosRealizados++;

                    // Incrementa cursos disponíveis até o máximo permitido
                    if (aluno.cursosDisponiveis + 3 <= MAX_CURSOS) {
                        aluno.cursosDisponiveis += 3;
                    } else {
                        aluno.cursosDisponiveis = MAX_CURSOS;
                    }

                    // Atualiza assinatura se necessário
                    if (aluno.cursosRealizados >= 12) {
                        aluno.assinatura = "Premium";
                    }

                    // Gera moedas se for Premium
                    if (aluno.assinatura.equals("Premium")) {
                        aluno.coins += 3; // Ganho de moedas
                    }

                    System.out.println("\n" + nome + " concluiu um curso com nota " + String.format("%.2f", nota)
                            + " e possui " + aluno.cursosDisponiveis + " cursos disponíveis");
                } else {
                    System.out.println("\nA nota do " + nome + " é insuficiente para aprovação no curso! "
                            + String.format("%.2f", nota) + " de 7.00");
                    return;
                }
            } else {
                System.out.println(nome + " não tem cursos disponíveis para concluir.");
            }
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    // Método para mostrar o status de todos os alunos
    public String showStatus() {
        System.out.println();
        for (Map.Entry<String, Aluno> entry : alunos.entrySet()) {
            Aluno aluno = entry.getValue();
            System.out.println("Nome: " + entry.getKey() + ", Assinatura: " + aluno.assinatura + 
                               ", Cursos disponíveis: " + aluno.cursosDisponiveis + 
                               ", Cursos realizados: " + aluno.cursosRealizados + 
                               ", Fóruns Escritos: " + aluno.forunsEscritos + 
                               ", Moedas: " + aluno.coins);
        }
		return null;
    }

    // Classe Aluno para armazenar informações dos alunos
    public static class Aluno {
        public String nome;
        public String assinatura;
        public int cursosDisponiveis;
        public int cursosRealizados;
        public int forunsEscritos;
        public int coins;

        public Aluno(String nome, String assinatura, int cursosDisponiveis, int cursosRealizados, int forunsEscritos,
                      int coins) {
            this.nome = nome;
            this.assinatura = assinatura;
            this.cursosDisponiveis = cursosDisponiveis;
            this.cursosRealizados = cursosRealizados;
            this.forunsEscritos = forunsEscritos;
            this.coins = coins;
        }
    }

    // Gerenciador de Fórum para premiar os alunos
    public static class ForumManager {
        public Cursos cursos;

        public ForumManager(Cursos cursos) {
            this.cursos = cursos;
        }

        public void forumEscrito(String aluno) {
            Aluno forumEscrito = cursos.alunos.get(aluno);
            if (forumEscrito != null) {
                forumEscrito.forunsEscritos++;
            }
        }

       
    }
}
