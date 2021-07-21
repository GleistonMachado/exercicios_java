package Lambdas;

public class CalculoMain {

	public static void main(String[] args) {
		
		Calculo calc = (a, b) -> {
			return a + b;
		};
		System.out.println("Soma: " + calc.executar(5, 5));
		
		
		calc = (a, b) -> a * b;
		System.out.println("Multiplicação: " + calc.executar(2, 5));
	}
}
