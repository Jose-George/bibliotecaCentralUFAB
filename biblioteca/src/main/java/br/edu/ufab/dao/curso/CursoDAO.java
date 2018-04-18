package br.edu.ufab.dao.curso;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.ufab.dao.Conexao;
import br.edu.ufab.model.acervo.Revista;
import br.edu.ufab.model.curso.Curso;

public class CursoDAO {

	private Connection conexao;
	PreparedStatement stmt;

	public CursoDAO() {
		this.conexao = (Connection) Conexao.getConexao();
	}

	public boolean insertion(Curso curso) {

		String sql = "INSERT INTO curso(nome,areaCurso,tipo) VALUES(?,?,?)";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, curso.getNome());
			stmt.setString(2, curso.getArea());
			stmt.setString(3, curso.getTipo().name());
	
			stmt.execute();
			stmt.close();
			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
		}

	}

	public boolean remove(Curso curso) {
		
		String sql = "DELETE FROM curso"
				+ " WHERE nome = ?" ;		
		try{
			stmt = (PreparedStatement) conexao.prepareStatement(sql);  
			stmt.setString(1, curso.getNome());
			stmt.execute();
			stmt.close();
			
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	public boolean update(Curso curso) {
	
		String sql = "UPDATE revista SET areaCurso = ?, tipo = ?"+
				 " WHERE nome = ?";
		
		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, curso.getArea());
			stmt.setString(2, curso.getTipo().name());
			stmt.setString(3,curso.getNome());
			stmt.execute();
			stmt.close();
			return true;
			
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
		
	}

}
