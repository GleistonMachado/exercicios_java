package oo.heranca;

public class Heroi extends Jogador {
	
	// Construtor padrão
	public Heroi() {
		this(0, 0);
	}
	
	public Heroi(int x, int y) {
		super(x, y);
	}
	
/*
 * Esse metodo retira 20 de vida do oponente monstro
 * 
	boolean atacar(Jogador oponente) {
		
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 0;
			return true;
	
		} else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 20;
			return true;
			
		} else {
			return false;
		}
	}
	
	Ou o metodo abaixo
*/
	
	
	// Esse metodo retira 30 de vida do oponente monstro
	public boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		
		return ataque1 || ataque2 || ataque3;
	}
}
