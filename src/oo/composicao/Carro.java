package oo.composicao;

public class Carro {
	
	Motor motor;
	
	public Carro() {
		this.motor = new Motor(this); // Realcionamento Bidirecional
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	void acelarar() {
		if(motor.injecaoCombustivel < 2.6) {
			motor.injecaoCombustivel += 0.4;
		}
	}
	
	void frear() {
		if(motor.injecaoCombustivel > 0.5) {
			motor.injecaoCombustivel -= 0.4;
		}
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
	
}
