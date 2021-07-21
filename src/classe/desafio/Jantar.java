package classe.desafio;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida arroz = new Comida("arroz", 0.180);
		Comida feijao = new Comida("feijão", 0.300);
		
		Pessoa guloso = new Pessoa("Gleiston", 99.8);
		
		System.out.println(guloso.apresantar());
		
		guloso.comer(arroz);
		System.out.println(guloso.apresantar());
		
		guloso.comer(feijao);
		System.out.println(guloso.apresantar());
		
	}
}
