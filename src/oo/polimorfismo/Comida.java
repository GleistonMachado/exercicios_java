package oo.polimorfismo;

public abstract class Comida {
	
	private double peso;
	
	public Comida(double peso) {
		setPeso(peso);
	}
	
	// Getter
	public double gerPeso() {
		return peso;
	}
	
	// Setter
	public void setPeso(double peso) {
		this.peso = peso;
	}
}
