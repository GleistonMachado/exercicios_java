package generics;

public class CaixaNumeroMain {

	public static void main(String[] args) {
		
		// Primeiro exemplo
		CaixaNumero<Double> caixaA = new CaixaNumero<Double>();
		
		caixaA.guardar(9.1);
		
		Double numero1 = caixaA.abrir();
		
		System.out.println(numero1);
		
		
		
		// Segundo exemplo
		CaixaNumero<Integer> caixaB = new CaixaNumero<Integer>();
		
		caixaB.guardar(6);
		
		Integer numero2 = caixaB.abrir();
		
		System.out.println(numero2);
	}
}
