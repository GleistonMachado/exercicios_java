package Fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String str = "Ol�, tudo bem X";

		str = str.replace("X", "Gleiston");
		str = str.toUpperCase();
		str = str.concat("!!!");
		System.out.println(str);

		String msg = "Ol� X, tudo bem?".replace("X", "Gleiston").toLowerCase().concat("!!!");

		System.out.println(msg);

		// Obs: Tipos primitovos como (int, float, double...), nao possui a nota��o
		// ponto

	}
}
