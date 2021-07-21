package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class UpdatePessoa {
	
	public static void main(String[] args) throws SQLException {
		
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código: "));
		
		Connection conexao = FabricaConexao.getConexao();
		
		String selectSQL = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		String updateSQL = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		
		PreparedStatement stmtSelect = conexao.prepareStatement(selectSQL);
		stmtSelect.setInt(1, codigo);
		ResultSet r = stmtSelect.executeQuery();
		
		if(r.next()) {
			Pessoa pessoa = new Pessoa(r.getInt(1), r.getString(2));
			
			System.out.println("Nome atual: " + pessoa.getNome());
			
			String novoNome = JOptionPane.showInputDialog("Informe o novo nome: ");

			PreparedStatement stmtUpdate = conexao.prepareStatement(updateSQL);
			stmtUpdate.setString(1, novoNome);
			stmtUpdate.setInt(2, codigo);
			stmtUpdate.execute();
			stmtUpdate.close();
			
			System.out.println("Alterado com sucesso!");
			
		} else {
			System.out.println("Pessoa não foi encontrada!");
		}
		
		stmtSelect.close();
		conexao.close();
	}

}
