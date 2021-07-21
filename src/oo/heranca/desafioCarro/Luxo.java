package oo.heranca.desafioCarro;

public interface Luxo {
	
	public void ligarAr();
	public void desligarAr();
	
	// N�o � obrigatoria a sua cria��o deste metodo 
	// nas classes que usarem a implementa��o desta interface.
	default int velocidadedoAr() {
		return 1;
	}

}

