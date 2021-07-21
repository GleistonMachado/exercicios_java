package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a;  // atribuição por valor (tipo primitivo)
		
		a++;
		b--;
		
		System.out.println("Valor de a = " + a);
		System.out.println("Valor de b = " + b);
		
		Data data1 = new Data(1, 6, 2022);
		Data data2 = data1; // atribuição por referencia (objeto)
		
		data1.dia = 31;
		data2.mes = 12;
		
		System.out.println(data1.formatarData());
		System.out.println(data2.formatarData());
		
		voltarDataPadrao(data1);
		
		System.out.println(data1.formatarData());
		System.out.println(data2.formatarData());
	}
	
	static void voltarDataPadrao(Data data) {
		data.dia = 1;
		data.mes = 1;
		data.ano = 1970;
	}
	
}
