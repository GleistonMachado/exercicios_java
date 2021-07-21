package classe;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario usuario1 = new Usuario();
		usuario1.nome = "Gleiston Machado";
		usuario1.email = "gleiston@gmail.com";
		
		Usuario usuario2 = new Usuario();
		usuario2.nome = "Gleiston Machado";
		usuario2.email = "gleiston@gmail.com";
		
		System.out.println(usuario1 == usuario2);       // Comparando valores
		System.out.println(usuario1.equals(usuario2));  // Comparando o hashcode
		System.out.println(usuario2.equals(usuario1));  // Comparando o hashcode
		
	}
	
}
