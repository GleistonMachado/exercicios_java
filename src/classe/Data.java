package classe;


public class Data {
	int dia;
	int mes;
	int ano;
	
	Data() {
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970); // Chama um construtor, neste caso esta chamando o construtor abaixo
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String formatarData() {
		String data = String.format("%d/%d/%d", dia, mes, ano);
		return data;
	}
}
