package AC2.DEVOPS.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import AC2.DEVOPS.ENTITY.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

 
}
