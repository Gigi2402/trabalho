package AC2.DEVOPS;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import AC2.DEVOPS.Controller.Cursos2Controller;

import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Cursos2ApplicationTests {

	@Autowired
    private Cursos2Controller cursos2Controller;
	
	@Test
    public void alunoTerminaCursoComNotaMenorQue7() {
        // Inicializa o aluno Pedro com assinatura básica
        cursos2Controller.setCursosConcluidos("Pedro", 5);
        cursos2Controller.concluirCurso("Pedro", 5); // Nota < 7

        // Verifica se a assinatura ainda é "Basic"
        String assinaturaPedro = cursos2Controller.cursos.alunos.get("Pedro").assinatura;
        assertEquals("Basic", assinaturaPedro);

        // Verifica que ele não tem novos cursos disponíveis
        int cursosDisponiveis = cursos2Controller.cursos.alunos.get("Pedro").cursosDisponiveis;
        assertFalse(cursosDisponiveis <= 5, "Pedro não deve ter mais cursos disponíveis.");
    }
	
	@Test
    public void alunoConcluiCursoComAssinaturaPremium() {
        // Configura João como Premium e com cursos avançados
        cursos2Controller.setCursosConcluidos("João", 13); // João já deve ser Premium
        cursos2Controller.concluirCurso("João", 9); // Nota >= 7, curso avançado

        // Verifica se João tem moedas virtuais adicionadas
        int coinsJoao = cursos2Controller.cursos.alunos.get("João").coins;
        assertEquals(3, coinsJoao, "João deve ter ganhado 3 moedas virtuais.");

        // João pode trocar moedas por criptomoedas (simulação lógica)
        boolean podeTrocarMoedas = coinsJoao >= 3;
        assertTrue(podeTrocarMoedas, "João deve poder trocar moedas por criptomoedas.");
    }
	
	@Test
    public void alunoCompleta12CursosEAssinaturaPremium() {
        // Maria com assinatura básica inicialmente
        cursos2Controller.setCursosConcluidos("Maria", 11); // Maria ainda tem assinatura Basic
        cursos2Controller.concluirCurso("Maria", 8); // Conclui o 12º curso com nota > 7

        // Verifica se a assinatura foi atualizada para Premium
        String assinaturaMaria = cursos2Controller.cursos.alunos.get("Maria").assinatura;
        assertEquals("Premium", assinaturaMaria, "Maria deve ter recebido a assinatura Premium.");

        // Verifica se ela ganhou moedas virtuais após completar 12 cursos
        int coinsMaria = cursos2Controller.cursos.alunos.get("Maria").coins;
        assertEquals(3, coinsMaria, "Maria deve ter ganhado 3 moedas virtuais.");
    }

}

