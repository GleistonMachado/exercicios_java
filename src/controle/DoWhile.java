package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		String texto = "";
		
		do {
			System.out.println("Quer sair? ");
			System.out.println("Se sim, digite a palavra m�gica:");
		
			texto = entrada.nextLine();
			
		} while(!texto.equalsIgnoreCase("por favor"));

		System.out.println("Obrigado!");
		entrada.close();
		
		
	}
}
