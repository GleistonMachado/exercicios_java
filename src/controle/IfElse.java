package controle;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {

		String pergunta = JOptionPane.showInputDialog("Informe um numero:");
		
		double valor = Integer.parseInt(pergunta);
		
		if(valor % 2 == 0) {
			System.out.println("O número é Par");
		} else {
			System.out.println("O número é Impar");
		}
		
		/*
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a nota:");
		double nota = entrada.nextDouble();
		
		if(nota > 10 || nota < 0) {
			System.out.println("Nota Invalida!");
			
		} else if(nota >= 7) {
			System.out.println("Parabens!!! Aprovado.");
			
		} else if(nota >= 4.5) {
			System.out.println("Estude mais, você esta de recuperação!");
			
		} else {
			System.out.println("Xiiii, reprovado!");
		}
		
		entrada.close();
		*/
		
	}
}
