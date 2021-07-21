package collection;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		// Criando a fila
		Queue<String> fila = new LinkedList<String>();
		
		// Adicionando elementos na fila com o .add() e o .offer().
		// A diferen�a � o comportamento quando a fila est� cheia.
		fila.add("Ana");    // retorna false quando a lista esta cheia
		fila.offer("Pedro"); // lan�a uma exce��o quando a lista esta cheia
		fila.offer("Jose");
		fila.offer("Maria");
		
		
		// Peek e Element - Obtem pr�ximo proximo elemento da fila (sem remove-lo).
		// A diferen�a � o comportamento quando a fila est� vazia.
		System.out.println(fila.peek());     // retorna false se a fila esta vazia
		System.out.println(fila.element());  // lan�a uma exce��o quando a fila esta vazia
		
		
		// Pool e Remove - Pega e remove o primeiro elemento da fila
		// A diferen�a � o comportamento quando a fila est� vazia.
		System.out.println("Ol� " + fila.poll() + " voc� foi removida"); // retorna null se a fila esta vazia
		System.out.println("Ol� " + fila.remove() + " voc� foi removida(o)"); // lan�a uma exce��o quando a fila esta vazia
	
		// Outras op��es
		// fila.size(); Verifica o tamanho da fila
		// fila.clear(); Limpa a fila
		// fila.isEmpty(); Verifica se a fila est� vazia
		// fila.contains(); Verica se o elemento esta contido na fila
	}
}
