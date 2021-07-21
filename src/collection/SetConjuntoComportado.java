package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetConjuntoComportado {
	
	public static void main(String[] args) {
		
		// Conjunto sem ordenação
		System.out.println("Exemplo: Não ordenados");
		
		Set<String> listaAprovadosNaoOrdenados = new HashSet<String>(); 
		
		listaAprovadosNaoOrdenados.add("Savio");
		listaAprovadosNaoOrdenados.add("Ana");
		listaAprovadosNaoOrdenados.add("Pedro");
		listaAprovadosNaoOrdenados.add("Bruna");
		
		for(String candidato : listaAprovadosNaoOrdenados) {
			System.out.println(candidato);
		}
		
		System.out.println();
		
		
		// Conjunto ordenado
		System.out.println("Exemplo: Ordenados");
		
		SortedSet<String> listaAprovadosOrdenados = new TreeSet<String>();
		
		listaAprovadosOrdenados.add("Zulmira");
		listaAprovadosOrdenados.add("Gleiston");
		listaAprovadosOrdenados.add("Ana");
		listaAprovadosOrdenados.add("Pedro");
		listaAprovadosOrdenados.add("Bruna");
		
		for(String candidato : listaAprovadosOrdenados) {
			System.out.println(candidato);
		}
		
		System.out.println();
		
		
		// Conjunto com a classe Integer que vem do tipo primitivo int
		Set<Integer> numeros = new HashSet<>();
		numeros.add(1);
		numeros.add(5);
		numeros.add(4);
		numeros.add(30);
		
		for (Integer numero : numeros) {
			System.out.println(numero);
		}
		
		
	}
}
