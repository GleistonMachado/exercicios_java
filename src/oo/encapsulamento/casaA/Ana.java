package oo.encapsulamento.casaA;

public class Ana {
	
	@SuppressWarnings("unused")
	private String segredo = "...";           // � vis�vel somente dentro da pr�pria classe.
	String facoDentroDeCasa = "...";         // � vis�vel dentro do pacote(por padr�o � o default).
	protected String formaDeFlar = "...";   // � vis�vel por Heran�a e pacote.
	public String todosSabem = "...";      // � vis�vel por todos
	
	
}
