package Fundamentos;

public class TipoString {
	public static void main(String[] args) {
		String nome = "Gleiston";
		String sobrenome = "Machado";
		
		System.out.println(nome.charAt(0));
		System.out.println(nome.contains("i"));
		System.out.println(nome.startsWith("g"));
		System.out.println(nome.endsWith("n"));
		System.out.println(nome.indexOf("e"));
		System.out.println(nome.equals("Gleiston"));
		System.out.println(nome.equalsIgnoreCase("gleiston"));
		System.out.printf("Olá senhor %s %s, tudo bem?\n", nome, sobrenome);
		System.out.println("Olá tudo bem?".substring(0, 8));
	}

}
