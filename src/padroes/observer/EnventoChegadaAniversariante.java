package padroes.observer;

import java.util.Date;

public class EnventoChegadaAniversariante {
	
	private final Date momento;

	public EnventoChegadaAniversariante(Date momento) {
		this.momento = momento;
	}

	public Date getMomento() {
		return momento;
	}
	
	
}
