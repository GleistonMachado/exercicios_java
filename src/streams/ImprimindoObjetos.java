package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	
	public static void main(String[] args) {
		
		// Primeiro exemplo
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
		System.out.println("Usando o Foreach!");
		
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		
		//Segundo exemplo
		List<String> aprovados2 = Arrays.asList("Luana", "Guilherme", "Luan", "Ana Maria");
		
		System.out.println("\nUsando o Iterator!");
		
		Iterator<String> iterator = aprovados2.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		// Terceiro exemplo
		List<String> aprovados3 = Arrays.asList("Paola", "Saulo", "Natan", "Juliana");
		
		System.out.println("\nUsando o Stream!");
		
		Stream<String> alunos = aprovados3.stream();
		
		alunos.forEach(System.out::println);
	}
}
