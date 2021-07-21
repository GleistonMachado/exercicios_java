package oo.composicao;

public class Item {
	
	String nome;
	int quantidade;
	double preco;
	Compra compra; // Para relacionamento Bidirecional
	
	public Item(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
}
