package Fundamentos.desafios;

public class DesafioAritimetico {
	public static void main(String[] args) {
		double numeradorA = Math.pow(6 * (3 + 2 ), 2) ;
		double denA = 3 * 2;
		
		double numeradorB = (1 - 5) * ( 2 - 7);
		double denB = 2;
		
		double superiorA = numeradorA / denA;
		double superiorB = Math.pow(numeradorB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("Resultado final: " + resultado);
	}
}
