package streams;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class GlobalMethods { // ou public interface FuncoesGlobal
	
	public static final UnaryOperator<String> maiuscula = palavra -> palavra.toUpperCase();
	
	public static final UnaryOperator<String> primeiraLetra = palavra -> palavra.charAt(0) + "";
	
	public static final String grito(String palavra) {
		return palavra + "!!! ";
	}
	
	public static final UnaryOperator<String> inverterString = 
			str -> new StringBuilder(str).reverse().toString();
	
	public static final Function<String, Integer> binarioParaInt =
			str -> Integer.parseInt(str, 2);

}
