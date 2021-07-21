package Lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.text.NumberFormat;
import java.util.Locale;

public class Desafio {

	public static void main(String[] args) {
		
		Locale localeBR = new Locale("pt","BR");
		NumberFormat dinheiro  = NumberFormat.getCurrencyInstance(localeBR);
		
		Function<Produto, Double> precoComDesconto = (prod -> prod.preco * (1 - prod.desc));
		
		UnaryOperator<Double> imposto = preco -> preco >= 2500 ? preco *  1.085 : preco;
		
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		
		Function<Double, String> formatar = preco -> "O preco é R$ " + dinheiro.format(preco);
		
		
		Produto produto = new Produto("iPad", 3235.89, 0.13);
		
		String precoFinal = precoComDesconto
				.andThen(imposto)
				.andThen(frete)
				.andThen(formatar)
				.apply(produto);
		
		System.out.println(precoFinal);
		

	}
}
