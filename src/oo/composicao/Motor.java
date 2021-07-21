package oo.composicao;

public class Motor {
	
	Carro carro;
	double injecaoCombustivel = 1;
	boolean ligado = false;
	
	public Motor(Carro carro) {
		this.carro = carro;  // Realcionamento Bidirecional
	}
	
	int giroMotor() {
		if(ligado) {
			return (int) Math.round(injecaoCombustivel * 3000);
		}
		return 0;
	}
}
