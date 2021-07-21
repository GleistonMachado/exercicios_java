package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilMain {

	public static void main(String[] args) {
		
		// Primeiro exemplo
		List<String> langs = Arrays.asList("Java", "PHP", "C++", "Python");
		
		String ultimaLinguagen = ListaUtil.getUltimo(langs);
		
		System.out.println(ultimaLinguagen);
		
		
		
		// Segundo exemplo
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		
		Integer ultimoNumero = ListaUtil.getUltimo(nums);
		
		System.out.println(ultimoNumero);
	}
	
}
