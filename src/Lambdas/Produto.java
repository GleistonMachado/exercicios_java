package Lambdas;

public class Produto {
	
	final String nome;
	final double preco;
	final double desc;
	
	public Produto(String nome, double preco, double desc) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desc = desc;
	}
	
	public String toString() {
		double precoFinal = preco * (1 - desc);
		return nome + " custa R$ " + precoFinal;
	}
	

}
