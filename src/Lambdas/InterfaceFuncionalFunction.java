package Lambdas;

import java.util.function.Function;

public class InterfaceFuncionalFunction {
	
	public static void main(String[] args) {
		
		// Primeiro exemplo
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
		
		
		// Segundo exemplo
		Function<String, String> imprimir = valor -> "O numero é " + valor;
		String resultado = parOuImpar.andThen(imprimir).apply(32);
		
		
		// Terceiro exemplo
		Function<String, String> empolgado = valor -> valor + "!!!";
		String resultado2 = parOuImpar.andThen(imprimir).andThen(empolgado).apply(15);
		
		System.out.println(parOuImpar.apply(31));
		System.out.println(resultado);
		System.out.println(resultado2);
		
	}

}
