package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(String nomeInicial) {
		nome = nomeInicial;
	}
	
	double calcDesconto() {
		double resultado = preco * (1 - desconto);
		return resultado;
	}
	
}
