package br.edu.ufab.dao.acervo;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.ufab.dao.Conexao;
import br.edu.ufab.interfaces.ItemDao;
import br.edu.ufab.model.acervo.Livro;

public class LivroDao implements ItemDao<Livro>{

	private Connection conexao;
	PreparedStatement stmt;
	
	// abrindo uma conexao com a base
	public LivroDao() {
		this.conexao = (Connection) Conexao.getConexao();
	}

	
	public boolean create(Livro item) {
		
		String sql = "INSERT INTO livro(codigo,isbn,titulo,autor,editora,"
				+ "anoDefesaPublicacao, edicao, numeroPagina, areaConhecimento, tema)" + " VALUES(?,?,?,?,?,?,?,?,?,?)";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setInt(1,item.getCodigo());
			stmt.setString(2,item.getIsbn());
			stmt.setString(3,item.getTitulo());
			stmt.setString(4,item.getAutor());
			stmt.setString(5,item.getEditora());
			stmt.setDate(6,item.getDataPublicacao());
			stmt.setInt(7,item.getEdicao());
			stmt.setInt(8,item.getNumeroPagina());
			stmt.setString(9,item.getAreaDoConhecimento());
			stmt.setString(10,item.getTema());

			stmt.execute();
			stmt.close();

			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
		
		
	}

	public boolean remove(Livro item) {
		
		String sql = "DELETE FROM livro" + " WHERE id = ?";
		
		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setInt(1,item.getId());
			stmt.execute();
			stmt.close();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean update(Livro item) {
		
		String sql = "UPDATE livro SET codigo =?, titulo = ?, autor = ?, editora=?, anoDefesaPublicacao=?, edicao=?,"
				+ "numeroPagina=?,areaConhecimento=?, tema=?, isbn=?" + " WHERE id = ?";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setInt(1, item.getCodigo());
			stmt.setString(2,item.getTitulo());
			stmt.setString(3,item.getAutor());
			stmt.setString(4,item.getEditora());
			stmt.setDate(5,item.getDataPublicacao());
			stmt.setInt(6,item.getEdicao());
			stmt.setInt(7,item.getNumeroPagina());
			stmt.setString(8,item.getAreaDoConhecimento());
			stmt.setString(9,item.getTema());
			stmt.setString(10,item.getIsbn());
			stmt.setInt(11, item.getId());
			stmt.execute();
			stmt.close();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	public ArrayList<Livro> search(String key_id) {
		return null;
	}
	
	
	
}
