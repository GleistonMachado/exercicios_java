package Fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informa��es do funcion�rio
		
		// Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		
		// Para especificar que � um numero long e n�o um inteiro 
		// voc� tem que colocar o L no final.
		long pontosAcumulados = 3134845223L; 
		
		
		// Tipos num�ricos reais
		// Para especificar que � um numero float e n�o um double 
		// voce tem que colocar o F no final.
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipos booleano
		boolean estaDeFerias = false; // true
		
		// Tipo caractere
		char status = 'A'; // ativo
		
	
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos acumulados
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		// Sal�rio funcion�rio
		System.out.println(id + ": ganha -> " + salario);
		
		// Ferias
		System.out.println("Funcion�rio esta de ferias: " + estaDeFerias);
		
		// Status
		System.out.println("Status: " + status);
		
	}
}
