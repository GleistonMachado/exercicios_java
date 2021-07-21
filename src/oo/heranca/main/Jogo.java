package oo.heranca.main;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
	
	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi(10, 11);
		
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		System.out.println("Heroi tem " +heroi.vida + " de vida.");
		System.out.println("Mostro tem " + monstro.vida + " de vida.");
		
	}
	
}
