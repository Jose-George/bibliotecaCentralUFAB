
package br.edu.ufab.dao.acervo;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.ufab.dao.Conexao;
import br.edu.ufab.model.acervo.ItemDeAcervo;
import br.edu.ufab.model.acervo.Revista;

public class RevistaDAO implements ItemDAO {

	private Connection conexao;
	PreparedStatement stmt;

	public RevistaDAO() {
		this.conexao = (Connection) Conexao.getConexao();
	}

	public boolean insertion(Object item) {
		String sql = "INSERT INTO revista(titulo,editora,dataPublicacao,edicao,numeroPagina) VALUES(?,?,?,?,?)";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, ((ItemDeAcervo) item).getTitulo());
			stmt.setString(2, ((Revista) item).getEditora());
			stmt.setDate(3, ((ItemDeAcervo) item).getDataPublicacao());
			stmt.setInt(4, ((Revista) item).getEdicao());
			stmt.setInt(5, ((Revista) item).getNumeroPagina());

			stmt.execute();
			stmt.close();
			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
		}

	}

	public boolean remove(Object item) {

		String sql = "DELETE FROM revista" + " WHERE id = ?";
		try {

			stmt = (PreparedStatement) conexao.prepareStatement(sql);

			stmt.setInt(1, ((Revista) item).getId());
			stmt.execute();
			stmt.close();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	public boolean update(Object item) {

		String sql = "UPDATE revista SET titulo = ?, editora = ?, dataPublicacao = ?," + "idicao=?, numeroPagina=?"
				+ " WHERE id = ?";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, ((ItemDeAcervo) item).getTitulo());
			stmt.setString(2, ((Revista) item).getEditora());
			stmt.setDate(3, ((ItemDeAcervo) item).getDataPublicacao());
			stmt.setInt(4, ((Revista) item).getEdicao());
			stmt.setInt(5, ((Revista) item).getNumeroPagina());
			stmt.setInt(6, ((Revista) item).getId());

			stmt.execute();
			stmt.close();
			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}

}
