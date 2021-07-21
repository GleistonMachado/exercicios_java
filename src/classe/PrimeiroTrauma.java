package classe;

public class PrimeiroTrauma {
	
	int a = 3; // atributo de instancia
	
	// Para acessar um atributo de instancia atraves de um metodo static,
	// é preciso criar uma instancia dentro do metodo static ou tornar 
	// o atributo em static
	
	public static void main(String[] args) {
		
		PrimeiroTrauma p = new PrimeiroTrauma(); // Instancia
		
		System.out.println(p.a);
	}
}
