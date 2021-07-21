package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		// Primeiro exemplo
		List<String> marcas = Arrays.asList("BMW ", "Audio ", "Honda\n");
		
		marcas.stream()
			.map(m -> m.toUpperCase())
			.forEach(print);
		
		
		// Segundo exemplo
		List<String> marcas2 = Arrays.asList("Chevrolet ", "Fiat ", "Nissan\n");
		
		UnaryOperator<String> primeiraLetra = palavra -> palavra.charAt(0) + "";
		
		marcas2.stream()
			.map(GlobalMethods.maiuscula)
			.map(primeiraLetra)
			.map(GlobalMethods::grito)
			.forEach(print);
	}
}
