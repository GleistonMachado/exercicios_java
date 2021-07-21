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
		
		// Se todos os alunos estiverem aprovado o retorno ser� True
			System.out.println(alunos.stream().allMatch(aprovado));
		// Todos os alunos est�o aprovados? false, porque h� pelo menos um aluno reprovado
		
		
		// Se pelo menos um aluno estiver aprovado o retorno ser� True
			System.out.println(alunos.stream().anyMatch(aprovado));
		// Pelo menos um aluno est� aprovado? True, porque h� pelo menos um aluno aprovado
		
		
		// Se tiver pelo menos um aluno aprovado o retorno ser� false
			System.out.println(alunos.stream().noneMatch(aprovado));
		// N�o existe aluno aprovado? False, porque h� pelo menos um aluno aprovado
		
		// Se n�o tiver nenhum aluno reprovado retorno ser� True
			System.out.println(alunos.stream().noneMatch(reprovado));
		// N�o existe alunod reprovados? False, porque h� pelo menos um aluno reprovado
	}

}
