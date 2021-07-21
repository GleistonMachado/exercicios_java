package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("unused")
public class Observador {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");  // Cria uma janela
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Fecha a aplicação por completo
		janela.setSize(500, 400);  // Determina o tamanho da janela
		janela.setLayout(new FlowLayout());  // Determina que o botão tera o tamanho do texto e nao da tela
		janela.setLocationRelativeTo(null); // Centraliza a janela na tela do computador
		
		
		JButton botao = new JButton("Clicar");  // Cria um botao
		janela.add(botao);  // Adiciona o botao na janela
		
		// Adicionando uma evento exemplo 1
		botao.addActionListener(event -> {
			System.out.println("Evento ocorreu!");
		});
		
		// Adicionando uma evento exemplo 2
//		botao.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Evento aconteceu!");
//				
//			}
//			
//		});  
		
		janela.setVisible(true);
	}
}
