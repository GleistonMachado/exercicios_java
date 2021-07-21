package Fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		double fahrenheit = 86;
		final int AJUSTE = 32;
		final double FATOR = 5/9.0;
		
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("Resultado = " + celsius + " ºC");
		
		fahrenheit = 150;
		double celsius1 = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("Resultado = " + celsius1 + " ºC");
		
		
	}
}
