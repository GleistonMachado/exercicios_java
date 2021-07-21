package oo.encapsulamento;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private int idade;
	
	// Construtor
	public Pessoa(String nome, String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}
	
	// Getter
	public String getNome() {
		return nome;
	}

	// Setter
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Getter
	public String getSobrenome() {
		return sobrenome;
	}

	// Setter
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	// Getter
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}

	// Getter
	public int getIdade() {
		return idade;
	}

	// Setter
	public void setIdade(int idade) {
		if(idade >= 0 && idade <= 120) {
			this.idade = idade;
		}
	}
	
	@Override
	public String toString() {
		return "Ola meu nome é " + getNome() + " e tenho " + getIdade() + " anos.";
	}

	
}
