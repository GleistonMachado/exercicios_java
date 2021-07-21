package oo.encapsulamento.casaA;

public class Paulo {
	
	Ana esposa = new Ana();
	
	void testeAcessos() {
		// System.out.println(esposa.segredo); Não é possivel porque segredo e privado
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFlar);
		System.out.println(esposa.todosSabem);
	}
}
