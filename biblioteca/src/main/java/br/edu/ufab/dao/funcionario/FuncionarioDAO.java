package br.edu.ufab.dao.funcionario;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.ufab.dao.Conexao;
import br.edu.ufab.model.funcionario.Funcionario;

/*A Classe FuncionarioDAO abre uma conexão com o banco de dados e realiza as operações de inserir, deletar e atualizar
 * o objeto funcionario na base de dados.
 *  
 * @author	José George	
 * */
public class FuncionarioDAO {

	private Connection conexao;
	PreparedStatement stmt;

	// abrindo uma conexao com a base
	public FuncionarioDAO() {
		this.conexao = (Connection) Conexao.getConexao();
	}
	
	/**
	 * Inserir um Funcionario no banco de dados
	 * @param item,um objeto do tipo funcionario
	 * @return true, se o objetivo for inserido no banco de dados
	 * @return false, se não for inserido na base de dados
	 */	
	public boolean insertion(Funcionario funcionario) {

		String sql = "INSERT INTO funcionario(tipoFuncionario,cpf,nomeCompleto,rg,"
				+ "naturalidade, endereco,telefone,email, nomeUsuario, senha) VALUES(?,?,?,?,?,?,?,?,?,?)";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, funcionario.isTipo().name());
			stmt.setString(2,funcionario.getCpf());
			stmt.setString(3,funcionario.getNomeCompleto());
			stmt.setString(4,funcionario.getRg());
			stmt.setString(5,funcionario.getNaturalidade());
			stmt.setString(6,funcionario.getEndereco());
			stmt.setString(7,funcionario.getTelefone());
			stmt.setString(8,funcionario.getEmail());
			stmt.setString(9,funcionario.getNomeUsuario());
			stmt.setString(10,funcionario.getSenha());
			
			
			stmt.execute();
			stmt.close();
			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
		}

	}
	

	/**
	 * Remover um Funcionario no banco de dados
	 * @param item,um objeto do tipo funcionario
	 * @return true, se o objetivo for inserido no banco de dados
	 * @return false, se não for inserido na base de dados
	 */	
	public boolean remove(Funcionario curso) {
		
		String sql = "DELETE FROM funcionario"
				+ " WHERE cpf = ?" ;		
		try{
			stmt = (PreparedStatement) conexao.prepareStatement(sql);  
			stmt.setString(1, curso.getCpf());
			stmt.execute();
			stmt.close();
			
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * Atualizar um Funcionario no banco de dados
	 * @param item,um objeto do tipo funcionario
	 * @return true, se o objetivo for inserido no banco de dados
	 * @return false, se não for inserido na base de dados
	 */	
	public boolean update(Funcionario funcionario) {
		
		String sql = "UPDATE funcionario SET tipoFuncionario = ?, nomeCompleto = ?,"
				+ "rg=?,naturalidade=?,endereco=?,telefone=?,email=?, senha=?"+
				 " WHERE cpf = ?";
		
		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			
			stmt.setString(1, funcionario.isTipo().name());
			stmt.setString(2,funcionario.getNomeCompleto());
			stmt.setString(3,funcionario.getRg());
			stmt.setString(4,funcionario.getNaturalidade());
			stmt.setString(5,funcionario.getEndereco());
			stmt.setString(6,funcionario.getTelefone());
			stmt.setString(7,funcionario.getEmail());
			stmt.setString(8,funcionario.getSenha());
			stmt.setString(9,funcionario.getCpf());
			
			stmt.execute();
			stmt.close();
			return true;
			
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
		
	}
	
}
