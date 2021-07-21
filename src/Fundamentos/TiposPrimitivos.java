package Fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionário
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		
		// Para especificar que é um numero long e não um inteiro 
		// você tem que colocar o L no final.
		long pontosAcumulados = 3134845223L; 
		
		
		// Tipos numéricos reais
		// Para especificar que é um numero float e não um double 
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
		
		// Salário funcionário
		System.out.println(id + ": ganha -> " + salario);
		
		// Ferias
		System.out.println("Funcionário esta de ferias: " + estaDeFerias);
		
		// Status
		System.out.println("Status: " + status);
		
	}
}
