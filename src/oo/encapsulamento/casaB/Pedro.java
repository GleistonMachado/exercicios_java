package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	// Obs: N�o pode criar uma instancia de Ana para acessar atributos de heran�a.
	
	void testeAcessos() {
		// System.out.println(segredo); N�o � possivel porque segredo e privado
		// System.out.println(facoDentroDeCasa); N�o � possivel porque et� fora do pacote
		System.out.println(formaDeFlar);
		System.out.println(todosSabem);
	}
	
	
}
