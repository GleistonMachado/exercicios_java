package Fundamentos;

import java.util.Scanner;

public class PegandoDadosConsole {
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = dados.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = dados.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = dados.nextInt();
		
		System.out.printf("%s %s você tem %d anos.%n", nome, sobrenome, idade);
		
		dados.close();
		
	}
}
