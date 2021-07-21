package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ConsultarPessoas2 {

	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "SELECT *  FROM pessoas WHERE nome LIKE ?";

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um nome: ");
		String nomePesquisa = entrada.nextLine();

		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1, "%" + nomePesquisa + "%");

		ResultSet resultado = stmt.executeQuery();

		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getCodigo() + " ==> " + pessoa.getNome());
		}

		//System.out.println(sql);
		
		entrada.close();
		stmt.close();
		conexao.close();
		
	}
}
