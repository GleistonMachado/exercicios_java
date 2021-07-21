package oo.heranca.desafioCarro;

public interface Luxo {
	
	public void ligarAr();
	public void desligarAr();
	
	// Não é obrigatoria a sua criação deste metodo 
	// nas classes que usarem a implementação desta interface.
	default int velocidadedoAr() {
		return 1;
	}

}

