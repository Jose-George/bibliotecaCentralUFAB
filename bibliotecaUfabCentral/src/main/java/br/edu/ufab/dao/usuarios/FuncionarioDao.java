package br.edu.ufab.dao.usuarios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.ufab.dao.Conexao;
import br.edu.ufab.interfaces.UserDao;
import br.edu.ufab.model.Funcionario;
import br.edu.ufab.model.acervo.AnaisCongresso;

public class FuncionarioDao implements UserDao<Funcionario> {
	
	private Connection conexao;
	PreparedStatement stmt;

	// abrindo uma conexao com a base
	public FuncionarioDao() {
		this.conexao = (Connection) Conexao.getConexao();
	}

	public boolean create(Funcionario user) {
		
		String sql = "INSERT INTO funcionario(tipoFuncionario,cpf,nomeCompleto,rg,"
				+ "naturalidade, endereco,telefone,email, nomeUsuario, senha) VALUES(?,?,?,?,?,?,?,?,?,?)";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, user.isTipo().name());
			stmt.setString(2,user.getCpf());
			stmt.setString(3,user.getNomeCompleto());
			stmt.setString(4,user.getRg());
			stmt.setString(5,user.getNaturalidade());
			stmt.setString(6,user.getEndereco());
			stmt.setString(7,user.getTelefone());
			stmt.setString(8,user.getEmail());
			stmt.setString(9,user.getNomeUsuario());
			stmt.setString(10,user.getSenha());
			
			
			stmt.execute();
			stmt.close();
			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
		
	}

	public boolean remove(Funcionario user) {
		
		String sql = "DELETE FROM funcionario"
				+ " WHERE id = ?" ;		
		try{
			stmt = (PreparedStatement) conexao.prepareStatement(sql);  
			stmt.setInt(1, user.getId());
			stmt.execute();
			stmt.close();
	
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
		
	}

	public boolean update(Funcionario user) {
		String sql = "UPDATE funcionario SET tipoFuncionario = ?, nomeCompleto = ?,"
				+ "rg=?,naturalidade=?,endereco=?,telefone=?,email=?, senha=?, cpf=?"+
				 " WHERE id = ?";
		
		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			
			stmt.setString(1, user.isTipo().name());
			stmt.setString(2,user.getNomeCompleto());
			stmt.setString(3,user.getRg());
			stmt.setString(4,user.getNaturalidade());
			stmt.setString(5,user.getEndereco());
			stmt.setString(6,user.getTelefone());
			stmt.setString(7,user.getEmail());
			stmt.setString(8,user.getSenha());
			stmt.setString(9,user.getCpf());
			stmt.setInt(10, user.getId());
			
			
			stmt.execute();
			stmt.close();
			return true;
			
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}

	public ArrayList<Funcionario> searchAll(String id) {
		
		String sql = "SELECT FROM funcionario"
				+ " WHERE nomeCompleto = ?" ;
		ArrayList<Funcionario> retorno = new ArrayList<Funcionario>();
		try{
			PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1,id);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				Funcionario func= new Funcionario();
				func.setEndereco(rs.getString("endereco"));
				func.setTelefone(rs.getString("telefone"));
				func.setNomeCompleto(rs.getString("nomeCompleto"));
			}
			
			rs.close();
			stmt.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return retorno;
	}

}
