package generics;

public class CaixaIntMain {

	public static void main(String[] args) {
		
		CaixaInt caixa = new CaixaInt();
		
		caixa.guardar(10);
		
		Integer numero = caixa.abrir();
		
		System.out.println(numero);
	}
}
