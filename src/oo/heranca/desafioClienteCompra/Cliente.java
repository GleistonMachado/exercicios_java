package oo.heranca.desafioClienteCompra;

import java.util.ArrayList;

public class Cliente {
	
	final String nome;
	final ArrayList<Compra> compras = new ArrayList<Compra>();
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	void addCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	double calcularTotalCompra() {
		double total = 0;
		
		for (Compra compra : compras) {
			total += compra.calcularValorCompra();
		}
		
		return total;
	}
}
