package arrays;

public class LacoForeach {
	public static void main(String[] args) {

		double[] notas = { 9.9, 8.7, 7.2, 9.4 };

		double total = 0;

		for (double nota : notas) {
			System.out.println("Nota: " + nota);
		}

		for (double nota : notas) {
			total += nota;
		}

		System.out.println("Media = " + total / notas.length);

	}
}
