package Fundamentos;

public class Wrapper {
	public static void main(String[] args) {
		// Objeto wrapper
		Byte b = 100;      // byte primitivo
		Short s = 1000;    // short primitivo
		Integer i = 10000; // int primitivo
		Long l = 100000L;  // long primitivo
		
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 125.00f;      // float primitivo
		System.out.println(f);  // double primitivo
		
		Double d = 1234.123;
		System.out.println(d);
		
		Boolean bool = Boolean.parseBoolean("true");  // boolean primitivo
		System.out.println(bool);
		System.out.println(bool.booleanValue());
		System.out.println(bool.toString().toUpperCase());
		
		Character c = 'c';    // char primitivo
		System.out.println(c.charValue());
	}
}
