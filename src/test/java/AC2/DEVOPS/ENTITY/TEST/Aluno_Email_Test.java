package AC2.DEVOPS.ENTITY.TEST;


	import static org.junit.jupiter.api.Assertions.assertEquals;
	import static org.junit.jupiter.api.Assertions.assertThrows;

	import org.junit.jupiter.api.Test;

	import AC2.DEVOPS.ENTITY.Aluno;
	import AC2.DEVOPS.ENTITY.Aluno_Email;

	public class Aluno_Email_Test {

	    @Test
	    void testSetAndGetValidEmail() {
	        Aluno aluno = new Aluno();
	        Aluno_Email email = new Aluno_Email("test@example.com");
	        aluno.setEmail(email);
	        
	        assertEquals(email, aluno.getEmail());
	    }

	    @Test
	    void testInvalidEmailThrowsException() {
	        assertThrows(IllegalArgumentException.class, () -> {
	            new Aluno_Email("invalid-email");
	        });
	    }
	}



