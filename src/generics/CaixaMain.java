package generics;

public class CaixaMain {
	
	public static void main(String[] args) {
		
		// Primeiro exemplo
		Caixa<String> caixaA = new Caixa<String>();
		
		caixaA.guardar("Ola, tudo bem?");
		
		String coisaA = caixaA.abrir();
		
		System.out.println(coisaA);
		
		
		// Segundo exemplo
		Caixa<Double> caixaB = new Caixa<>();
		
		caixaB.guardar(8.5);
		
		Double coisaB = caixaB.abrir();
		
		System.out.println(coisaB);
		
 	}
}
