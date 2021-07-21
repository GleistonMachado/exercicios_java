package collection;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		// Criando a fila
		Queue<String> fila = new LinkedList<String>();
		
		// Adicionando elementos na fila com o .add() e o .offer().
		// A diferença é o comportamento quando a fila está cheia.
		fila.add("Ana");    // retorna false quando a lista esta cheia
		fila.offer("Pedro"); // lança uma exceção quando a lista esta cheia
		fila.offer("Jose");
		fila.offer("Maria");
		
		
		// Peek e Element - Obtem próximo proximo elemento da fila (sem remove-lo).
		// A diferença é o comportamento quando a fila está vazia.
		System.out.println(fila.peek());     // retorna false se a fila esta vazia
		System.out.println(fila.element());  // lança uma exceção quando a fila esta vazia
		
		
		// Pool e Remove - Pega e remove o primeiro elemento da fila
		// A diferença é o comportamento quando a fila está vazia.
		System.out.println("Olá " + fila.poll() + " você foi removida"); // retorna null se a fila esta vazia
		System.out.println("Olá " + fila.remove() + " você foi removida(o)"); // lança uma exceção quando a fila esta vazia
	
		// Outras opções
		// fila.size(); Verifica o tamanho da fila
		// fila.clear(); Limpa a fila
		// fila.isEmpty(); Verifica se a fila está vazia
		// fila.contains(); Verica se o elemento esta contido na fila
	}
}
