package streams.reducer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import streams.Aluno;
import streams.Media;

public class Reduce3 {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Bia", 6.1);
		Aluno a3 = new Aluno("Gabi", 8.1);
		Aluno a4 = new Aluno("Gui", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = aluno -> aluno.getNota() >= 7;
		
		Function<Aluno, Double> getNotas = aluno -> aluno.getNota();
		
		BiFunction<Media, Double, Media> calcularMedia = (media, nota) -> media.adicionar(nota);
		
		BinaryOperator<Media> combinarMedia = (media1, media2) -> Media.combinar(media1, media2) ;
		
		Media media = alunos.parallelStream()
			.filter(aprovado)
			.map(getNotas)
			.reduce(new Media(), calcularMedia, combinarMedia);
		
		System.out.println("A média dos alunos aprovados é: " + media.getValor());
		
	}
}
