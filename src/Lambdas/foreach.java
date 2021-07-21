package Lambdas;

import java.util.Arrays;
import java.util.List;

public class foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Gui");
		
		System.out.println("Foreach tradicional");
		for (String nome : aprovados) {
			System.out.println(nome + "!!!");
		}
		
		
		System.out.println("\nForeach usando Lambda #01");
		aprovados.forEach((nome) -> System.out.println(nome + "!!!"));
		
		System.out.println("\nForeach usando Lambda #02");
		aprovados.forEach((nome) -> meuIprimir(nome));
		
		
		System.out.println("\nMethod Reference.#01");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nMethod Reference.#02");
		aprovados.forEach(foreach::meuIprimir);
		
	}
	
	static void meuIprimir(String nome) {
		System.out.println("Oi! Meu nome é " + nome);
	}
	
}
