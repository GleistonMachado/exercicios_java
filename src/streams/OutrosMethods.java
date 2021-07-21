package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class OutrosMethods {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Bia", 8.1);
		Aluno a3 = new Aluno("Gabi", 8.5);
		Aluno a4 = new Aluno("Gui", 6.5);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Pedro", 9.1);
		Aluno a7 = new Aluno("Maria", 8.1);
		Aluno a8 = new Aluno("Gui", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		// Descarta os itens duplicados na hora da exibição
		System.out.println("Primeiro exemplo: Distinct");
		alunos.stream()
			.distinct()
			.forEach(System.out::println);
		
		
		// Determina apartir de qual posição e quantos itens serão exibido.
		System.out.println("\nSegundo exemplo:Skip/Limit");
		alunos.stream()
			.distinct()
			.skip(2)       // Parametro inicial, a partir de qual indeice sera exibido
			.limit(2)      // Linite de dados que serão pegos
			.forEach(System.out::println);
		
		
		// Pega todos os itens até encontrar uma condição que seja false.
		System.out.println("\nTerceiro exemplo: TyakeWhile");
		
		Predicate<Aluno> notaAluno = aluno -> aluno.getNota() >= 7;
		
		alunos.stream()
			.distinct()                // Descarta os itens duplicados
			.takeWhile(notaAluno)     // Pega todos os alunos enquanto a nota dele for Maior ou igual a 7
			.forEach(System.out::println);
		
	}
}
