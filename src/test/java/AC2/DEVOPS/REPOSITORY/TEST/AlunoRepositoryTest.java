package AC2.DEVOPS.REPOSITORY.TEST;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import AC2.DEVOPS.ENTITY.Aluno;
import AC2.DEVOPS.ENTITY.Aluno_Email;
import AC2.DEVOPS.REPOSITORY.AlunoRepository;

@ActiveProfiles("test")
@DataJpaTest
public class AlunoRepositoryTest {

    @Autowired
    private AlunoRepository alunoRepository;

    @Test
    void testSaveAndFindAluno() {
        // Cria um objeto Aluno com um email válido
        Aluno aluno = new Aluno();
        aluno.setNome("testAluno");
        aluno.setEmail(new Aluno_Email("test@example.com"));

        // Salva no banco de dados
        Aluno savedAluno = alunoRepository.save(aluno);
        assertNotNull(savedAluno.getId()); // Verifica se o ID foi gerado

        // Busca o aluno pelo ID
        Optional<Aluno> retrievedAluno = alunoRepository.findById(savedAluno.getId());
        assertTrue(retrievedAluno.isPresent());
        assertEquals("testAluno", retrievedAluno.get().getNome());
    }
}

