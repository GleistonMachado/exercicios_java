package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	// Obs: Não pode criar uma instancia de Ana para acessar atributos de herança.
	
	void testeAcessos() {
		// System.out.println(segredo); Não é possivel porque segredo e privado
		// System.out.println(facoDentroDeCasa); Não é possivel porque etá fora do pacote
		System.out.println(formaDeFlar);
		System.out.println(todosSabem);
	}
	
	
}
