package oo.polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(99.5);
		
		Arroz arroz = new Arroz(0.2);
		Feijao feijao = new Feijao(0.1);
		Comida maisArroz = new Arroz(0.2);
		Sorvete sobremesa = new Sorvete(0.4);
		
		p1.comer(arroz);
		p1.comer(feijao);
		
		System.out.println(p1.getPeso());
		
		p1.comer(maisArroz);
		
		System.out.println("Comeu mais arroz: " + p1.getPeso());
		
		p1.comer(sobremesa);
		
		System.out.println("Após comer a sobremesa: " + p1.getPeso());
	}

}
