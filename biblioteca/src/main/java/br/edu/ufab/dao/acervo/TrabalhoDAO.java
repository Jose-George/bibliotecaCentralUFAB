package br.edu.ufab.dao.acervo;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.ufab.dao.Conexao;
import br.edu.ufab.model.acervo.ItemDeAcervo;
import br.edu.ufab.model.acervo.TrabalhoDeConclusao;

/*Classe que abre uma conexao dos objetos de TrabalhoDeConclusao com o banco e realiza inserção, atualização e remoção de objetos do
 * tipo TrabalhoDeConclusao.
 * 
 * @author	José George	
 * */

public class TrabalhoDAO implements ItemDAO {

	private Connection conexao;
	PreparedStatement stmt;

	// abrindo uma conexao com a base
	public TrabalhoDAO() {
		this.conexao = (Connection) Conexao.getConexao();
	}

	/**
	 * Inserir um TrabalhoDeConclusao no banco de dados
	 * @param item,um objeto do TrabalhoDeConclusao
	 * @return true, se o objetivo for inserido no banco de dados
	 * @return false, se não for inserido na base de dados
	 */	
	
	public boolean insertion(Object item) {

		String sql = "INSERT INTO trabalhoConclusao(tipo,autor,orientador,titulo,anoDefesa,localDefesa) VALUES(?,?,?,?,?,?)";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, ((TrabalhoDeConclusao) item).getTipo().name());
			stmt.setString(2, ((TrabalhoDeConclusao) item).getAutor());
			stmt.setString(3, ((TrabalhoDeConclusao) item).getOrientador());
			stmt.setString(4, ((ItemDeAcervo) item).getTitulo());
			stmt.setDate(5, ((ItemDeAcervo) item).getDataPublicacao());
			stmt.setString(6, ((TrabalhoDeConclusao) item).getLocal());

			stmt.execute();
			stmt.close();
			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}

	/**
	 * Remover um TrabalhoDeConclusao no banco de dados
	 * @param item,um objeto do TrabalhoDeConclusao
	 * @return true, se o objetivo for inserido no banco de dados
	 * @return false, se não for inserido na base de dados
	 */	
	
	public boolean remove(Object item) {

		String sql = "DELETE FROM trabalhoConclusao" + " WHERE id = ?";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);

			stmt.setInt(1, ((TrabalhoDeConclusao) item).getId());
			stmt.execute();
			stmt.close();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	/**
	 * Atualizar um TrabalhoDeConclusao no banco de dados
	 * @param item,um objeto do TrabalhoDeConclusao
	 * @return true, se o objetivo for inserido no banco de dados
	 * @return false, se não for inserido na base de dados
	 */	
	
	public boolean update(Object item) {

		String sql = "UPDATE trabalhoConclusao SET tipo = ?, autor = ?, orientador = ?,"
				+ "titulo=?, anoDefesa=?, localDefesa=?" + " WHERE id = ?";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, ((TrabalhoDeConclusao) item).getTipo().name());
			stmt.setString(2, ((TrabalhoDeConclusao) item).getAutor());
			stmt.setString(3, ((TrabalhoDeConclusao) item).getOrientador());
			stmt.setString(4, ((ItemDeAcervo) item).getTitulo());
			stmt.setDate(5, ((ItemDeAcervo) item).getDataPublicacao());
			stmt.setString(6, ((TrabalhoDeConclusao) item).getLocal());
			stmt.setInt(7, ((TrabalhoDeConclusao) item).getId());

			stmt.execute();
			stmt.close();
			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}

}
