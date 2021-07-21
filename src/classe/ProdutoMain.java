package classe;

public class ProdutoMain {
	
	public static void main(String[] args) {
		Produto produto1 = new Produto("Notebook");
		//produto1.nome = "Notebook";
		produto1.preco = 4356.89;
		Produto.desconto = 0.29;
		
		Produto produto2 = new Produto("Caneta Preta");
		//produto2.nome ="Caneta Preta";
		produto2.preco = 12.56;
		//produto2.desconto = 0.29;
		
		System.out.println(produto1.nome + " = " + produto1.calcDesconto());
		System.out.println(produto2.nome  + " = " + produto2.calcDesconto());
		
		double precoComDesconto1 = produto1.calcDesconto();
		double precoComDesconto2 = produto2.calcDesconto();
		
		double precoFinal = (precoComDesconto1 + precoComDesconto2) / 2;
		
		System.out.printf("Total da compra: R$ %.2f", precoFinal);
		
	}

}
