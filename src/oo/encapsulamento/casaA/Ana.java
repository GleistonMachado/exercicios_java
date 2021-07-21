package oo.encapsulamento.casaA;

public class Ana {
	
	@SuppressWarnings("unused")
	private String segredo = "...";           // É visível somente dentro da própria classe.
	String facoDentroDeCasa = "...";         // É visível dentro do pacote(por padrão é o default).
	protected String formaDeFlar = "...";   // É visível por Herança e pacote.
	public String todosSabem = "...";      // É visível por todos
	
	
}
