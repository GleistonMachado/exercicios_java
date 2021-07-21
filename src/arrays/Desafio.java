package arrays;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de notas:");
		int qtNotas = entrada.nextInt();
		
		double notas[] = new double [qtNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %d � nota:", i + 1);
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for (double nota : notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		System.out.printf("A m�dia � : %.2f", media);
		entrada.close();
	}
}
