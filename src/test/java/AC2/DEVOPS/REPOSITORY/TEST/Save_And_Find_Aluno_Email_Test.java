package AC2.DEVOPS.REPOSITORY.TEST;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import AC2.DEVOPS.ENTITY.Aluno;
import AC2.DEVOPS.REPOSITORY.AlunoRepository;


@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@DataJpaTest
public class Save_And_Find_Aluno_Email_Test {

	    @Autowired
	    private AlunoRepository alunoRepository;

	    @Test
	    public void testSaveAndFindAluno() {
	        // Cria um novo aluno
	        Aluno aluno = new Aluno();
	        aluno.setNome("testAluno");

	        // Salva no banco de dados
	        Aluno savedAluno = alunoRepository.save(aluno);
	        assertNotNull(savedAluno.getId());

	        // Busca o aluno pelo ID
	        Optional<Aluno> retrievedAluno = alunoRepository.findById(savedAluno.getId());
	        assertThat(retrievedAluno).isPresent();
	        assertThat(retrievedAluno.get().getNome()).isEqualTo("testAluno");
	    }
	}


