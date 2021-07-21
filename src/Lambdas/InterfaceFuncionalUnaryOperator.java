package Lambdas;

import java.util.function.UnaryOperator;

public class InterfaceFuncionalUnaryOperator {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = numero -> numero + 2;
		UnaryOperator<Integer> vezesDois = numero -> numero * 2;
		UnaryOperator<Integer> aoQuadrado = numero -> numero * numero;
		
		
		// Primeiro exemplo
		int resultado = maisDois          // 0 + 2
				.andThen(vezesDois)      // 2 * 2
				.andThen(aoQuadrado)    // 4 * 4
				.apply(0);
		
		System.out.println("Usando andThen() : " + resultado);
		
		
		System.out.println();
		
		// Segundo exemplo começa a execução de baixo pra cima;
		int resultado2 = aoQuadrado     // 4 * 4
				.compose(vezesDois)    // 2 * 2
				.compose(maisDois)    // 0 + 2
				.apply(0);
		
		System.out.println("Usando o compose() : " + resultado2);
	}
}
