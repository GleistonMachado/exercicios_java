package collection;

import java.util.HashSet;
import java.util.Set;

public class SetConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		// Criando um conjunto com HashSet
		HashSet conjunto = new HashSet();
		
		// Adicionando itens ao conjunto.
		conjunto.add(1.2);         // Double
		conjunto.add(true);        // Boolean
		conjunto.add("teste");
		conjunto.add(1);
		conjunto.add(8);
		
		// Mostra o tamanho do conjunto.
		System.out.println("Tamanho = " + conjunto.size());
		
		// Retorna true se removeu o item e false se nao removeu o item.
		System.out.println(conjunto.remove(true)); 
		
		// Retorna true se encontrou o item e false se não encontrou o item.
		System.out.println(conjunto.contains("teste")); 
		
		System.out.println(conjunto);
		
		
		
		// Criando um conjunto com HashSet
		Set nums = new HashSet();
		
		// Adicionando itens ao conjunto.
		nums.add(1);
		nums.add(3);
		nums.add(4);
		nums.add(8);
		
		// União entre dois conjuntos
		//conjunto.addAll(nums);
		
		// Interseção de dois conjuntos, ou seja o que eles tem em comum
		conjunto.retainAll(nums);
		
		System.out.println(conjunto);
		
		
	}
}
