
package br.edu.ufab.dao.acervo;

import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.ufab.dao.Conexao;
import br.edu.ufab.model.acervo.ItemDeAcervo;
import br.edu.ufab.model.acervo.Revista;

/**Classe que abre uma conexao dos objetos de Revista com o banco e realiza inserção, atualização e remoção de objetos do
 * tipo Revista.
 * @author	José George	
 * */

public class RevistaDAO implements ItemDAO {

	private Connection conexao;
	PreparedStatement stmt;
	private static final Logger logger = Logger.getLogger(RevistaDAO.class);

	/**
	 * @param insertion()
	 * @param remove()
	 * @param update()
	 * */
	
	// abrindo uma conexao com a base
	public RevistaDAO() {
		this.conexao = (Connection) Conexao.getConexao();
	}

	/**
	 * Inserir uma Revista no banco de dados
	 * @param item,um objeto do Revista
	 * @return true, se o objetivo for inserido no banco de dados
	 * @return false, se não for inserido na base de dados
	 */	
	
	public boolean insertion(Object item) {
		String sql = "INSERT INTO revista(titulo,editora,dataPublicacao,edicao,numeroPagina) VALUES(?,?,?,?,?)";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, ((ItemDeAcervo) item).getTitulo());
			stmt.setString(2, ((Revista) item).getEditora());
			stmt.setDate(3, ((ItemDeAcervo) item).getDataPublicacao());
			stmt.setInt(4, ((Revista) item).getEdicao());
			stmt.setInt(5, ((Revista) item).getNumeroPagina());
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
	 * Deletar uma Revista no banco de dados
	 * @param item,um objeto do Revista
	 * @return true, se o objetivo for inserido no banco de dados
	 * @return false, se não for inserido na base de dados
	 */	
		
	public boolean remove(Object item) {

		String sql = "DELETE FROM revista" + " WHERE id = ?";
		try {

			stmt = (PreparedStatement) conexao.prepareStatement(sql);

			stmt.setInt(1, ((Revista) item).getId());
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
	 * Atualizar uma Revista no banco de dados
	 * @param item,um objeto do Revista
	 * @return true, se o objetivo for inserido no banco de dados
	 * @return false, se não for inserido na base de dados
	 */	
	public boolean update(Object item) {

		String sql = "UPDATE revista SET titulo = ?, editora = ?, dataPublicacao = ?," + "edicao=?, numeroPagina=?"
				+ " WHERE id = ?";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, ((ItemDeAcervo) item).getTitulo());
			stmt.setString(2, ((Revista) item).getEditora());
			stmt.setDate(3, ((ItemDeAcervo) item).getDataPublicacao());
			stmt.setInt(4, ((Revista) item).getEdicao());
			stmt.setInt(5, ((Revista) item).getNumeroPagina());
			stmt.setInt(6, ((Revista) item).getId());
			logger.info("Update no banco passando: "+item);
			stmt.execute();
			stmt.close();
			return true;

		} catch (SQLException u) {
			logger.error("Ocorreu um problema ao tentar fazer Update no bd", u );
			return false;
		}
	}

}
