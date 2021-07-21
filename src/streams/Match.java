package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 9.1);
		Aluno a2 = new Aluno("Bia", 4.1);
		Aluno a3 = new Aluno("Gabi", 8.1);
		Aluno a4 = new Aluno("Gui", 6.0);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = aluno -> aluno.getNota() >= 7;
		
		Predicate<Aluno> reprovado = aprovado.negate();
		
		// Se todos os alunos estiverem aprovado o retorno será True
			System.out.println(alunos.stream().allMatch(aprovado));
		// Todos os alunos estão aprovados? false, porque há pelo menos um aluno reprovado
		
		
		// Se pelo menos um aluno estiver aprovado o retorno será True
			System.out.println(alunos.stream().anyMatch(aprovado));
		// Pelo menos um aluno está aprovado? True, porque há pelo menos um aluno aprovado
		
		
		// Se tiver pelo menos um aluno aprovado o retorno será false
			System.out.println(alunos.stream().noneMatch(aprovado));
		// Não existe aluno aprovado? False, porque há pelo menos um aluno aprovado
		
		// Se não tiver nenhum aluno reprovado retorno será True
			System.out.println(alunos.stream().noneMatch(reprovado));
		// Não existe alunod reprovados? False, porque há pelo menos um aluno reprovado
	}

}
