package br.edu.ufab.dao.acervo;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.StatementImpl;

import br.edu.ufab.dao.Conexao;
import br.edu.ufab.model.acervo.ItemDeAcervo;
import br.edu.ufab.model.acervo.Jornal;

public class JornalDAO implements ItemDAO {

	private Connection conexao;
	PreparedStatement stmt;

	public JornalDAO() {
		this.conexao = (Connection) Conexao.getConexao();
	}

	public boolean insertion(Object item) {

		String sql = "INSERT INTO jornal(titulo,dataPublicacao,edicao) VALUES(?,?,?)";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, ((ItemDeAcervo) item).getTitulo());
			stmt.setDate(2, ((ItemDeAcervo) item).getDataPublicacao());
			stmt.setInt(3, ((Jornal) item).getEdicao());
			stmt.execute();
			stmt.close();
			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}

	public boolean remove(Object item) {

		String sql = "DELETE FROM jornal" + " WHERE id = ?";
		try {

			stmt = (PreparedStatement) conexao.prepareStatement(sql);

			stmt.setInt(1, ((Jornal) item).getId());
			stmt.execute();
			stmt.close();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	public boolean update(Object item) {

		String sql = "UPDATE jornal SET titulo = ?, dataPublicacao = ?, edicao = ?" + " WHERE id = ?";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, ((ItemDeAcervo) item).getTitulo());
			stmt.setDate(2, ((ItemDeAcervo) item).getDataPublicacao());
			stmt.setInt(3, ((Jornal) item).getEdicao());
			stmt.execute();
			stmt.close();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

}
