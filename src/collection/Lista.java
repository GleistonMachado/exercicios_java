package collection;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		// Criando a lista
		// List<Usuario> lista = new ArrayList<>();
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario usuario1 = new Usuario("Andre");
		lista.add(usuario1);
		
		lista.add(new Usuario("Felipe"));
		lista.add(new Usuario("Amanda"));
		lista.add(new Usuario("Luana"));
		
		for(Usuario usuario: lista) {
			System.out.println(usuario.nome);
		}
		
		System.out.println();
		
		// Verificando se o item esta contido na lista
		System.out.println("Existe o item na lista? " + lista.contains(usuario1));
		
		System.out.println();
		
		// Removendo o item
		System.out.println("Removido >>> " + lista.remove(1).nome);
		System.out.println("Foi removido Luana? " + lista.remove(new Usuario("Luana")));
		
		System.out.println();
		
		// Imprimindo o elemento indice 0 da lista
		System.out.println(lista.get(0).nome);
	}
}
