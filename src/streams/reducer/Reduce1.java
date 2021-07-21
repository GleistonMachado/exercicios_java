package streams.reducer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (acc, num) -> acc + num;
		
		// Primeiro exemplo
		Integer total = numeros.stream()
			.reduce(soma)
			.get();
		
		System.out.println(total);
		
		
		// Segundo exemplo
		Integer total2 = numeros.stream()
				.reduce(100, soma);
			
		System.out.println(total2);
		
		
		// Terceiro exemplo
		numeros.stream()
			.filter(num -> num >= 5)
			.reduce(soma)
			.ifPresent(System.out::println);
		
		
	}
}
