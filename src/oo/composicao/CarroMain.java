package oo.composicao;

public class CarroMain {
	
	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		if(!carro.estaLigado()) {
			carro.ligar();
		}
		
		carro.acelarar();
		carro.acelarar();
		carro.acelarar();
		carro.acelarar();
		
		System.out.println("Acelerando: " + carro.motor.giroMotor());
		
		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();
		
		System.out.println("Freando: " + carro.motor.giroMotor());
	}
}
