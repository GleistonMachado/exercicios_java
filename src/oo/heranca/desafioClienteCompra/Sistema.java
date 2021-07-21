package oo.heranca.desafioClienteCompra;

public class Sistema {
	
	public static void main(String[] args) {

		Compra compra1 = new Compra();
		compra1.addItem("Caneta", 2,  5);
		
		Compra compra2 = new Compra();
		compra1.addItem("Lapis", 2,  2);
		
		Compra compra3 = new Compra();
		compra3.addItem("Caderno", 10, 3);
		
		//Compra compra4 = new Compra();
		//compra3.addItem(new Produto("Livro", 10), 2);
		
		Cliente cliente = new Cliente("Gleiston");
		cliente.addCompra(compra1);
		cliente.addCompra(compra2);
		cliente.addCompra(compra3);
		//cliente.addCompra(compra4);
		
		System.out.println("Cliente: " + cliente.nome);
		System.out.println("Total de compras: R$ " + cliente.calcularTotalCompra());
	}

}
