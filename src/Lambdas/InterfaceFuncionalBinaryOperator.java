package Lambdas;

import java.util.function.BinaryOperator;

public class InterfaceFuncionalBinaryOperator {

	public static void main(String[] args) {
		
		BinaryOperator<Integer> calc = (a, b) -> {
			return a + b;
		};
		
		System.out.println("Soma: " + calc.apply(5, 5));
		
		calc = (a, b) -> a * b;
		
		System.out.println("Multiplicação: " + calc.apply(2, 10));
		

		
		BinaryOperator<Double> calc2 = (a, b) -> {
			return a + b;
		};
		
		System.out.println("Soma: " + calc2.apply(5.0, 5.0));
		
		calc2 = (a, b) -> a * b;
		
		System.out.println("Multiplicação: " + calc2.apply(2.0, 10.0));
	}
}
