package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
	
	Ana sogra = new Ana();
	
	void testeAcessos() {
		// System.out.println(sogra.segredo); N�o � possivel porque segredo e privado.
		// System.out.println(sogra.facoDentroDeCasa); N�o � possivel porque et� fora do pacote.
		// System.out.println(sogra.formaDeFlar);  N�o � possivel pois n�o herda nada de Ana
		System.out.println(sogra.todosSabem);
	}

}
