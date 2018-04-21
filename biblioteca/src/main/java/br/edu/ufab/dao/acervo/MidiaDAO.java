package br.edu.ufab.dao.acervo;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.ufab.dao.Conexao;
import br.edu.ufab.model.acervo.ItemDeAcervo;
import br.edu.ufab.model.acervo.MidiaEletronica;

/*Classe que abre uma conexao dos objetos de MidiaEletronica com o banco e realiza inserção, atualização e remoção de objetos do
 * tipo MidiaEletronica.
 * @author	José George	
 * */

public class MidiaDAO implements ItemDAO {

	private Connection conexao;
	PreparedStatement stmt;
	

	/*
	 * @param insertion()
	 * @param remove()
	 * @param update()
	 * */
	
	// abrindo uma conexao com a base
	public MidiaDAO() {
		this.conexao = (Connection) Conexao.getConexao();
	}

	/**
	 * Inserir uma MidiaEletronica no banco de dados
	 * @param item,um objeto do tipo MidiaEletronica
	 * @return true, se o objetivo for inserido no banco de dados
	 * @return false, se não for inserido na base de dados
	 */	
	
	public boolean insertion(Object item) {
		String sql = "INSERT INTO midiaEletronica (titulo,tipo,dataGravacao) VALUES(?,?,?)";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, ((ItemDeAcervo) item).getTitulo());
			stmt.setString(2, ((MidiaEletronica) item).getTipo().name());
			stmt.setDate(3, ((ItemDeAcervo) item).getDataPublicacao());

			stmt.execute();
			stmt.close();
			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}

	
	/**
	 * Deletar uma MidiaEletronica no banco de dados
	 * @param item,um objeto do tipo MidiaEletronica
	 * @return true, se o objetivo for inserido no banco de dados
	 * @return false, se não for inserido na base de dados
	 */	
	
	public boolean remove(Object item) {
		String sql = "DELETE FROM midiaEletronica" + " WHERE id = ?";

		try {

			stmt = (PreparedStatement) conexao.prepareStatement(sql);

			stmt.setInt(1, ((MidiaEletronica) item).getId());
			stmt.execute();
			stmt.close();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	/**
	 * Atualizar uma MidiaEletronica no banco de dados
	 * @param item,um objeto do tipo MidiaEletronica
	 * @return true, se o objetivo for inserido no banco de dados
	 * @return false, se não for inserido na base de dados
	 */	
	
	
	public boolean update(Object item) {

		String sql = "UPDATE midiaEletronica SET titulo = ?, tipo= ?, dataGravacao = ?" + " WHERE id = ?";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, ((ItemDeAcervo) item).getTitulo());
			stmt.setString(2, ((MidiaEletronica) item).getTipo().name());
			stmt.setDate(3, ((ItemDeAcervo) item).getDataPublicacao());
			stmt.setInt(4, ((MidiaEletronica) item).getId());

			stmt.execute();
			stmt.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

}
