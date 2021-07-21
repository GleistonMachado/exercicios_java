package oo.abstrato;

public class AnimalMain {
	
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		
		System.out.println("Como cachorro se move: " + cachorro.mover());
		
		System.out.println("O que cachorro respira: " + cachorro.respirar());
		
		System.out.println("Filhote de cachorro toma: " + cachorro.mama());
	}
}
