package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 5.8);
		Aluno a3 = new Aluno("Daniel", 9.8);
		Aluno a4 = new Aluno("Gui", 6.8);
		Aluno a5 = new Aluno("Rebeca", 4.1);
		Aluno a6 = new Aluno("Pedro", 8.8);
		Aluno a7 = new Aluno("Julia", 7.8);
		Aluno a8 = new Aluno("Felipe", 5.8);
		Aluno a9 = new Aluno("Amaral", 9.8);
		Aluno a10 = new Aluno("Gustavo", 6.8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
		
		// Exemplo 1:
		Predicate<Aluno> aprovado = aluno -> aluno.getNota() >= 7;
		Function<Aluno, String> saudacoesAprovado = aluno -> "Parabéns "+ aluno.getNome() +", você foi aprovado(a)!";
		
		alunos.stream()
			.filter(aprovado)
			.map(saudacoesAprovado)
			.forEach(System.out::println);
		
		
		// Exemplo 2:
		Predicate<Aluno> reprovado= aluno -> aluno.getNota() < 7;
		Function<Aluno, String> saudacoesReprovado = aluno -> "Estude mais " + aluno.getNome() + " você foi reprovado(a)!";
		
		alunos.stream()
			.filter(reprovado)
			.map(saudacoesReprovado)
			.forEach(System.out::println);
	}
}
