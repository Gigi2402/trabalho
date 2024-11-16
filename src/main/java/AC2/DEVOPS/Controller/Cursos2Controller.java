package AC2.DEVOPS.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import AC2.DEVOPS.ENTITY.*;

@RestController
public class Cursos2Controller {
	

	public Cursos cursos = new Cursos();
	
	
	@GetMapping("/compararnotas")
	public boolean CompararNota(float nota) {
        return nota >= 7;
    }
	
	@GetMapping("/compararacesso")
	public boolean CompararAcessos(int acessos, int limite) {
        return acessos >= limite;
    }

	public void setCursosConcluidos(String nome, int concluidos) {
        cursos.setCursosConcluidos(nome, concluidos);
    }

	public void concluirCurso(String nome, float nota) {
        cursos.concluirCurso(nome, nota);
    }
	
	public void showStatus() {
        cursos.showStatus();
    }

}
