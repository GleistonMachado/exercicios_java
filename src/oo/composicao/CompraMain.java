package oo.composicao;

public class CompraMain {
	
	public static void main(String[] args) {
		
		Compra compra = new Compra();
		compra.cliente = "Gleiston Machado";
		
		// Adicionado com o metodo de relacionamento Unidirecional
		compra.itens.add(new Item("Borracha", 10, 1.0));
		compra.itens.add(new Item("Caderno", 3, 12.99));
		
		// Adicionado com o metodo de relacionamento Bidirecional
		compra.adicionarItem("Caneta", 5, 5.5);
		
		System.out.println(compra.itens.size());
		
		System.out.println("Total da compra: " + compra.obterValorTotal());
	}
}
