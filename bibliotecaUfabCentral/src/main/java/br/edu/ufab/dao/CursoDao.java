package br.edu.ufab.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.ufab.interfaces.ItemDependencies;
import br.edu.ufab.model.Curso;

public class CursoDao implements ItemDependencies<Curso> {

	private Connection conexao;
	PreparedStatement stmt;

	public CursoDao() {
		this.conexao = (Connection) Conexao.getConexao();
	}

	public boolean create(Curso curso) {

		String sql = "INSERT INTO curso(codigo,nome,areaCurso,sigla,tipo) VALUES(?,?,?,?,?)";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setInt(1, curso.getCodigo());
			stmt.setString(1, curso.getNome());
			stmt.setString(2, curso.getArea());
			stmt.setString(3, curso.getSiglaNomeCurso());
			stmt.setString(4, curso.getTipo().name());
			stmt.execute();
			stmt.close();

			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}

	public boolean remove(Curso curso) {

		String sql = "DELETE FROM curso" + " WHERE id = ? ; ";
		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setInt(1, curso.getId());
			stmt.execute();
			stmt.close();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean update(Curso curso) {
		
		String sql = "UPDATE curso SET codigo =? ,nome = ?, areaCurso = ?,sigla=?, tipo = ?";
	
		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setInt(1,curso.getCodigo());
			stmt.setString(2, curso.getNome());
			stmt.setString(3, curso.getArea());
			stmt.setString(4, curso.getSiglaNomeCurso());
			stmt.setString(5, curso.getTipo().name());
			stmt.execute();
			stmt.close();
			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
		}

	}

	public ArrayList<Curso> searchAll(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
