package br.edu.ufab.dao.acervo;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.ufab.dao.Conexao;
import br.edu.ufab.model.acervo.ItemDeAcervo;
import br.edu.ufab.model.acervo.Livro;

public class LivroDAO implements ItemDAO {

	private Connection conexao;
	PreparedStatement stmt;

	public LivroDAO() {
		this.conexao = (Connection) Conexao.getConexao();
	}

	public boolean insertion(Object item) {

		String sql = "INSERT INTO livro(isbn,titulo,autor,editora"
				+ "anoPublicacao, edicao, numeroPagina, areaConhecimento, tema)" + " VALUES(?,?,?,?,?,?,?,?,?)";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, ((Livro) item).getIsbn());
			stmt.setString(2, ((ItemDeAcervo) item).getTitulo());
			stmt.setString(3, ((Livro) item).getAutor());
			stmt.setString(4, ((Livro) item).getEditora());
			stmt.setDate(5, ((ItemDeAcervo) item).getDataPublicacao());
			stmt.setInt(6, ((Livro) item).getEdicao());
			stmt.setInt(7, ((Livro) item).getNumeroPagina());
			stmt.setString(8, ((Livro) item).getAreaDoConhecimento());
			stmt.setString(9, ((Livro) item).getTema());

			stmt.execute();
			stmt.close();

			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}

	public boolean remove(Object item) {

		String sql = "DELETE FROM livro" + " WHERE isbn = ?";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, ((Livro) item).getIsbn());
			stmt.execute();
			stmt.close();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	public boolean update(Object item) {

		String sql = "UPDATE livro SET titulo = ?, autor = ?, editora=?, anoPublicacao=?, edicao=?,"
				+ "numeroPagina=?,areaConhecimento=?, tema=?" + " WHERE isbn = ?";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, ((ItemDeAcervo) item).getTitulo());
			stmt.setString(2, ((Livro) item).getAutor());
			stmt.setString(3, ((Livro) item).getEditora());
			stmt.setDate(4, ((ItemDeAcervo) item).getDataPublicacao());
			stmt.setInt(5, ((Livro) item).getEdicao());
			stmt.setInt(6, ((Livro) item).getNumeroPagina());
			stmt.setString(7, ((Livro) item).getAreaDoConhecimento());
			stmt.setString(8, ((Livro) item).getTema());
			stmt.setString(9, ((Livro) item).getIsbn());

			stmt.execute();
			stmt.close();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

}
