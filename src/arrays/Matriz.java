package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos? ");
		int qtAlunos = entrada.nextInt();
		
		System.out.print("Quantas notas? ");
		int qtNotas = entrada.nextInt();
		
		double notasdaTurma[][] = new double [qtAlunos] [qtNotas]; 

		double total = 0;
		
		for (int aluno = 0; aluno < notasdaTurma.length; aluno++) {
			
			for (int nota = 0; nota < notasdaTurma[aluno].length; nota++) {
				System.out.printf("Digite a %d°nota do %d° aluno: ", nota + 1, aluno + 1 );
				
				notasdaTurma[aluno][nota] = entrada.nextDouble();
				
				total += notasdaTurma[aluno][nota];
			}
			
			System.out.println();
		}
		

		double media = total / (qtAlunos * qtNotas);
		System.out.printf("A media da turma é %.2f : ", media);
		
		
		for(double [] notasDoAluno : notasdaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}

		entrada.close();
	}
}
