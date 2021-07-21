package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		// Add e Push - Adiciona elementos na pilha.
		livros.add("O pequeno príncipe");
		livros.push("Dom Quixote");
		livros.push("O Hobbit");
		
		
		// Peek e Element - Pega o ultimo elemento a entrar na pilha sem remove-lo.
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println();
		
		// Pop, Pool e Remove -  Pega e remove a partir do ultimo elemento a entrar na pilha. 
		System.out.println("Pop() - " + livros.pop());
		System.out.println("Remove() - " + livros.remove());
		System.out.println("Pool() - " + livros.poll());
		
		
		// Outras opções
		// livros.size(); Verifica o tamanho da fila
		// livros.clear(); Limpa a fila
		// livros.isEmpty(); Verifica se a fila está vazia
		// livros.contains(); Verica se o elemento esta contido na fila
		
	}
}
