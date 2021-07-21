package oo.abstrato;

public abstract class Mamifero extends Animal {

	@Override
	// Metodo com a constante final, não podera ser subscrito nas subclasses.
	public final String mover() {
		return "Saindo do lugar";
	}
	
	public abstract String mama();
}
