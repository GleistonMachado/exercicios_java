package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Bia", 6.1);
		Aluno a3 = new Aluno("Gabi", 8.1);
		Aluno a4 = new Aluno("Gui", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Comparator<Aluno> notas = (aluno1, aluno2) -> {
			if(aluno1.getNota() > aluno2.getNota() ) return 1;
			if(aluno2.getNota() > aluno1.getNota()) return -1;
			return 0;
		};
		

		// Verifica qual é a maior nota
		Aluno melhorNota = alunos.stream().max(notas).get();
		System.out.println(melhorNota);
		
		
		// Verifica qual é a menor nota
		Aluno piorNota = alunos.stream().min(notas).get();
		System.out.println(piorNota);
		
	}
}
