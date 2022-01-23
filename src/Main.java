import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Teste");
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(mentoria1);

	}

}
