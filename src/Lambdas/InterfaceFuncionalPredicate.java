package Lambdas;

import java.util.function.Predicate;

public class InterfaceFuncionalPredicate {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto("Notebook", 2800.00, 0.10);
		
		// Verifica se o pre�o com desconto � maior que 750, se sim retornara true
		Predicate<Produto> isCaro = (prod) -> (prod.preco * (1 - prod.desc) >= 750);
		
		System.out.println(isCaro.test(produto));
	}

}
