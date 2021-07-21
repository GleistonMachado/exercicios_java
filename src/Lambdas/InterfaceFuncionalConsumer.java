package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class InterfaceFuncionalConsumer {
	
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = prod -> System.out.println(prod.nome  + " = R$ " + prod.preco);
		
		Produto produto1 = new Produto("Caneta", 5.34, 0.10);
		imprimir.accept(produto1);
		
		System.out.println();
		
		Produto produto2 = new Produto("Notebook", 5000.34, 0.10);
		Produto produto3 = new Produto("Caderno", 15.34, 0.10);
		Produto produto4 = new Produto("Borracha", 5.99, 0.10);
		Produto produto5 = new Produto("Lapis", 1.55, 0.10);
		
		List<Produto> produtos = Arrays.asList(produto2, produto3, produto4, produto5);
		
		produtos.forEach(imprimir);
		
		System.out.println();
		
		
		produtos.forEach(produto -> System.out.println(produto.preco));
		
		System.out.println();
		
		
		produtos.forEach(System.out::println);
		
		
	}
}
