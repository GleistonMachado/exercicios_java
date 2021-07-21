package streams.reducer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import streams.Aluno;

public class Reduce2 {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Bia", 6.1);
		Aluno a3 = new Aluno("Gabi", 8.1);
		Aluno a4 = new Aluno("Gui", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = aluno -> aluno.getNota() >= 7;
		Function<Aluno, Double> getNotas = aluno -> aluno.getNota();
		BinaryOperator<Double> soma = (a, b) -> a + b;
		
		alunos.parallelStream()
			.filter(aprovado)
			.map(getNotas)
			.reduce(soma)
			.ifPresent(System.out::println);
		
	}
}
