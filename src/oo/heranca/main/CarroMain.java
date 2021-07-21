package oo.heranca.main;

import oo.heranca.desafioCarro.Carro;
import oo.heranca.desafioCarro.Civic;
import oo.heranca.desafioCarro.Ferrari;

public class CarroMain {
	
	public static void main(String[] args) {
		
		Carro carro1 = new Civic();
		carro1.acelerar();
		System.out.println("Civic: " + carro1);
		
		carro1.acelerar();
		System.out.println("Civic: " + carro1);
		
		
		System.out.println();
		
		
		Ferrari carro2 = new Ferrari(400);
		carro2.ligarTurbo();
		carro2.ligarAr();
		
		carro2.acelerar();
		carro2.frear();
		System.out.println("Ferrari: " + carro2);
		
		carro2.acelerar();
		carro2.frear();
		System.out.println("Ferrari: " + carro2);
		
		carro2.acelerar();
		carro2.frear();
		System.out.println("Ferrari: " + carro2);
		
		
		
	}
	
	
}
