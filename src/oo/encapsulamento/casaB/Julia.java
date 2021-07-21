package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
	
	Ana sogra = new Ana();
	
	void testeAcessos() {
		// System.out.println(sogra.segredo); Não é possivel porque segredo e privado.
		// System.out.println(sogra.facoDentroDeCasa); Não é possivel porque etá fora do pacote.
		// System.out.println(sogra.formaDeFlar);  Não é possivel pois não herda nada de Ana
		System.out.println(sogra.todosSabem);
	}

}
