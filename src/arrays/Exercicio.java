package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double notasAlunoA [] = new double[3];
		double notasAlunoB [] = {6.5, 5.7, 8.10};
		
		// Primeiro exemplo
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		System.out.println("Notas aluno A: " + Arrays.toString(notasAlunoA));
		
		double total = 0;
		
		for(int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		
		System.out.println("Media: " + total / notasAlunoA.length);
		
		System.out.println();


		
		// Segundo exemplo
		
		System.out.println("Notas aluno B: " + Arrays.toString(notasAlunoB));
		
		for (int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoB[i];
		}
		
		System.out.println("Media: " + total / notasAlunoB.length);
	}
	
}
