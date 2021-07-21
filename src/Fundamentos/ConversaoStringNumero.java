package Fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String numero1 = JOptionPane.showInputDialog("Digite o promeiro valor: ");
		String numero2 = JOptionPane.showInputDialog("Digite o segundo valor: ");
		
		double valor1 = Double.parseDouble(numero1);
		double valor2 = Double.parseDouble(numero2);
		
		double soma = valor1 + valor2;
		double media = soma / 2;
		
		System.out.println("A soma eh: " + soma);
		System.out.println("A média eh: " + media);
	}
}
