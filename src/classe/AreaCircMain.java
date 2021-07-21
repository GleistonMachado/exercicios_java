package classe;

public class AreaCircMain {
	
	public static void main(String[] args) {
		
		AreaCirc area = new AreaCirc(5.60);
		
		System.out.println("Metodo da Instancia: " + area.calcularArea());
		
		System.out.println("Valo de PI da Clase: " + AreaCirc.PI);
		
		System.out.println("Metodo da Classe: " + AreaCirc.calcularArea(7));
	}
	
}
