package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class InterfaceBinaryOperator {

	public static void main(String[] args) {
		
		// Primeiro exemplo está retornando um valor Double
		BinaryOperator<Double> media = (numero1, numero2) -> (numero1 + numero2) / 2;
		
		// Recebe um Double e retorna uma String
		Function<Double, String> conceito = valor -> valor >= 7 ? "Aluno foi aprovado" : "Aluno foi reprovado";
		
		System.out.println(media.andThen(conceito).apply(9.8, 1.7));
		
		
		System.out.println();
		
		
		// Segundo exemplo está recebendo 2 valores Double e retornando uma String
		BiFunction<Double, Double, String> resultado = (numero1,  numero2) -> {
			double notaFinal = (numero1 + numero2) / 2;
			return notaFinal>= 7 ? "Aprovado" : "Reprovado";
		};	
		
		System.out.println(resultado.apply(6.7, 5.1));
		
	}
}
