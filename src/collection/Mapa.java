package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

		public static void main(String[] args) {
			
			Map<Integer, String> usuarios = new HashMap<Integer, String>();
			
			// Adiciona elementos na map.
			usuarios.put(1, "Roberto");
			usuarios.put(2, "Ricardo");
			usuarios.put(3, "Rafaela");
			usuarios.put(4, "Rebeca");
			
			System.out.println("Primeiro exemplo:");
			System.out.println("Quantida de elementos: " + usuarios.size());
			System.out.println("O Map está vazio? " + usuarios.isEmpty());
			
			System.out.println();
			
			
			System.out.println("Segundo exemplo:");
			System.out.println("Chaves : " + usuarios.keySet());
			System.out.println("Valores: " + usuarios.values());
			System.out.println("Chave e Valores: " + usuarios.entrySet());
			
			System.out.println();
			
			
			System.out.println("Terceiro exemplo:");
			System.out.println("Existe a chave?" + usuarios.containsKey(5));
			System.out.println("Existe a chave? " + usuarios.containsValue("Ricardo"));
			
			System.out.println();
			
			
			System.out.println("Quarto exemplo:");
			System.out.println("Usuario: " + usuarios.get(2));
			System.out.println("Usuario: " + usuarios.get(0)); // Retorna null se não existir a chave
			
			System.out.println();
			
			
			System.out.println("Quinto exemplo:");
			for(int chave : usuarios.keySet()) {
				System.out.println(chave);
			}
			
			System.out.println();
			
			
			System.out.println("Sexto exemplo:");
			for(String valor : usuarios.values()) {
				System.out.println(valor);
			}
			
			System.out.println();
			
			
			System.out.println("Setimo exemplo:");
			for(Entry<Integer, String> usuario: usuarios.entrySet()) {
				//System.out.println(usuario);
				System.out.print(usuario.getKey() + " - ");
				System.out.println(usuario.getValue());
			}
			
			System.out.println();
			
			
			System.out.println("Oitavo exemplo:");
			System.out.println("Removido o usurio: " + usuarios.remove(2));
			
			// Retorna true ou e false
			System.out.println("Removido o usurio: " + usuarios.remove(4, "Rebeca")); 
			
		}
}
