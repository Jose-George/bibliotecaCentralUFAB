package br.edu.ufab.dao.aluno;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.ufab.dao.Conexao;
import br.edu.ufab.model.aluno.Aluno;

public class AlunoDAO {

	private Connection conexao;
	PreparedStatement stmt;
	
	public AlunoDAO(){
		this.conexao = (Connection) Conexao.getConexao();
	}
	
	
	public boolean insertion(Aluno aluno) {		
	
		String sql = "INSERT INTO aluno(nome, matricula) VALUES(?,?)";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getMatricula());
			stmt.execute();
			stmt.close();
			
			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
			
		}

	}
	
	public boolean update(Aluno aluno){
		
		String sql = "UPDATE aluno SET nome = ?, matricula = ? WHERE matricula = ? ";
		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getMatricula());
			stmt.setString(3, aluno.getMatricula());
			stmt.execute();
			stmt.close();
			
			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
			
		}

	}
	
	public boolean remove(Aluno aluno){
		
		String sql = "DELETE FROM aluno"
				+ " WHERE matricula = ? ; " ;
		
		try{
			stmt = (PreparedStatement) conexao.prepareStatement(sql);  
			stmt.setString(1, aluno.getMatricula());
			stmt.execute();
			stmt.close();
			
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
		
	}
	
	
}
