package classe.desafio;

public class Pessoa {
	String nome;
	double peso;
	
	public Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		 if(comida != null) {
			 this.peso += comida.peso;
		 }
	}
	
	String apresantar() {
		return "Olá eu sou o " + this.nome + " e tenho " + this.peso + "Kg";
	}
}
