package br.edu.ufab.dao.acervo;

import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.ufab.dao.Conexao;
import br.edu.ufab.model.acervo.ItemDeAcervo;
import br.edu.ufab.model.acervo.Livro;

/**Classe que abre uma conexao dos objetos de Livro com o banco e realiza inserção, atualização e remoção de objetos do
 * tipo Livro.
 * @author	José George	
 * */

public class LivroDAO implements ItemDAO {

	private Connection conexao;
	PreparedStatement stmt;
	private static final Logger logger = Logger.getLogger(LivroDAO.class);

	/**
	 * @param insertion()
	 * @param remove()
	 * @param update()
	 * */
	
	// abrindo uma conexao com a base
	public LivroDAO() {
		this.conexao = (Connection) Conexao.getConexao();
	}

	/**
	 * Inserir um Livro no banco de dados
	 * @param item,um objeto do tipo Livro
	 * @return true, se o objetivo for inserido no banco de dados
	 * @return false, se não for inserido na base de dados
	 */	
	
	public boolean insertion(Object item) {

		String sql = "INSERT INTO livro(isbn,titulo,autor,editora,"
				+ "anoDefesaPublicacao, edicao, numeroPagina, areaConhecimento, tema)" + " VALUES(?,?,?,?,?,?,?,?,?)";

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
			logger.info("inserindo no banco: "+item);
			stmt.execute();
			stmt.close();

			return true;

		} catch (SQLException u) {
			logger.error("Ocorreu um problema ao tentar inserir no bd", u );
			return false;
		}
	}

	/**
	 * Deletar um livro no banco de dados
	 * @param item,um objeto do tipo Livro
	 * @return true, se o objetivo for inserido no banco de dados
	 * @return false, se não for inserido na base de dados
	 */	
	
	
	public boolean remove(Object item) {

		String sql = "DELETE FROM livro" + " WHERE isbn = ?";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, ((Livro) item).getIsbn());
			stmt.execute();
			logger.info("removendo no banco: "+item);
			stmt.close();

			return true;
		} catch (Exception e) {
			logger.error("Ocorreu um problema ao tentar remover no bd", e );
		}

		return false;
	}
	
	/**
	 * Atualizar um Livro no banco de dados
	 * @param item,um objeto do tipo Livro
	 * @return true, se o objetivo for inserido no banco de dados
	 * @return false, se não for inserido na base de dados
	 */	
	

	public boolean update(Object item) {

		String sql = "UPDATE livro SET titulo = ?, autor = ?, editora=?, anoDefesaPublicacao=?, edicao=?,"
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
			logger.info("Update no banco passando: "+item);
			stmt.execute();
			stmt.close();

			return true;
		} catch (Exception e) {
			logger.error("Ocorreu um problema ao tentar fazer Update no bd", e );
		}

		return false;
	}

}
