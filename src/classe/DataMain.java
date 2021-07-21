package classe;

public class DataMain {
	
	public static void main(String[] args) {
		
		// Primeira instãncia
		Data data1 = new Data();
		
		// Segunda instãncia
		Data data2 = new Data(20,05,2020);
		
		System.out.println(data1.formatarData());
		System.out.println(data2.formatarData());
	}
	
}
