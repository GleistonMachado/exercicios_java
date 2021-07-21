package oo.encapsulamento;

public class PessoaMain {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Gleiston", "Machado", 30);
		
		System.out.println(p1.getIdade());
		
		System.out.println(p1);
		
		System.out.println(p1.getNomeCompleto());
	}
}
