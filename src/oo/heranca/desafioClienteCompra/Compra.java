package oo.heranca.desafioClienteCompra;

import java.util.ArrayList;

public class Compra {
	
	final ArrayList<Carrinho> itens = new ArrayList<Carrinho>();
	
	//void addItem(Produto produto, int qtde) {
		//this.itens.add(new Carrinho(produto, qtde));
	//}
	
	void addItem(String nome, double preco, int qtde) {
		Produto produto = new Produto(nome, preco);
		this.itens.add(new Carrinho(produto, qtde));
	}
	
	double calcularValorCompra() {
		double total = 0;
		
		for (Carrinho item : itens) {
			System.out.println(item.produto.nome);
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}
	
}
