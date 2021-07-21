package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		Consumer<Integer> println = System.out::println;
		
		// Primeiro exemplo
		System.out.println("Primeiro exemplo");
		
		Stream<String> langBackend = Stream.of("Java ", "PHP ", "Rubi\n");
		langBackend.forEach(print);
		
		System.out.println();
		
		
		// Segundo exemplo
		System.out.println("Segundo exemplo");
		
		String[] langFrontend = {"React ", "Vue ", "Js\n"};
		Stream.of(langFrontend).forEach(print);
		
		System.out.println();
		
		// Terceiro exemplo
		System.out.println("Terceiro exemplo");
		
		Arrays.stream(langFrontend).forEach(print);
		
		System.out.println();
		
		
		// Quarto exemplo
		System.out.println("Quarto exemplo");
		
		Arrays.stream(langFrontend, 0, 2).forEach(print);
		
		System.out.println();
		System.out.println();
		
		
		// Quinto exemplo
		System.out.println("Quinto exemplo");
		
		List<String> maisLang = Arrays.asList("C ", "C++ ", "C#");
		maisLang.stream().forEach(print);
		
		System.out.println();
		System.out.println();
		
		
		// Sexto exemplo
		System.out.println("Sexto exemplo");
		
		maisLang.parallelStream().forEach(print);
		
		
		// Setimo exemplo: execulta o codigo infinatamente
		// Stream.iterate(0, numero -> numero + 1).forEach(println);
		// Stream.generate(() -> "g").forEach(print);
		
	}
}
