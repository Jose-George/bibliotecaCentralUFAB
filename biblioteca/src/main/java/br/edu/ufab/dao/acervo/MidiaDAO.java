package br.edu.ufab.dao.acervo;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.StatementImpl;

import br.edu.ufab.dao.Conexao;
import br.edu.ufab.model.acervo.ItemDeAcervo;
import br.edu.ufab.model.acervo.MidiaEletronica;

public class MidiaDAO implements ItemDAO {

	private Connection conexao;
	PreparedStatement stmt;

	public MidiaDAO() {
		this.conexao = (Connection) Conexao.getConexao();
	}

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

	public boolean update(Object item) {

		String sql = "UPDATE jornal SET titulo = ?, tipo= ?, dataGravacao = ?" + " WHERE id = ?";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, ((ItemDeAcervo) item).getTitulo());
			stmt.setString(2, ((MidiaEletronica) item).getTipo().name());
			stmt.setDate(3, ((ItemDeAcervo) item).getDataPublicacao());

			stmt.execute();
			stmt.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

}
