package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	
	public static void main(String[] args) throws SQLException {
		// Faz a conex�o de forma segura sem verificar o certificado
		final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true"; 
		final String usuario = "root";
		final String senha = "12345";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conex�o efetuda com sucesso!");
		
		conexao.close();
		
	}
}
