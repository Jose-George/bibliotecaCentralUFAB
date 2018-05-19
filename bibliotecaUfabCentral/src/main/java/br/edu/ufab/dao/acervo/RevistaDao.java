package br.edu.ufab.dao.acervo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.ufab.dao.Conexao;
import br.edu.ufab.interfaces.ItemDao;
import br.edu.ufab.model.acervo.AnaisCongresso;
import br.edu.ufab.model.acervo.Revista;

public class RevistaDao implements ItemDao<Revista> {

	private Connection conexao;
	PreparedStatement stmt;

	// abrindo uma conexao com a base
	public RevistaDao() {
		this.conexao = (Connection) Conexao.getConexao();
	}

	public boolean create(Revista item) {

		String sql = "INSERT INTO revista(codigo,titulo,editora,dataPublicacao,edicao,numeroPagina) VALUES(?,?,?,?,?,?)";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);

			stmt.setInt(1, item.getCodigo());
			stmt.setString(2, item.getTitulo());
			stmt.setString(3, item.getEditora());
			stmt.setDate(4, item.getDataPublicacao());
			stmt.setInt(5, item.getEdicao());
			stmt.setInt(6, item.getNumeroPagina());

			stmt.execute();
			stmt.close();
			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
		}

	}

	public boolean remove(Revista item) {

		String sql = "DELETE FROM revista" + " WHERE id = ?";
		try {

			stmt = (PreparedStatement) conexao.prepareStatement(sql);

			stmt.setInt(1, item.getId());
			stmt.execute();
			stmt.close();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	public boolean update(Revista item) {

		String sql = "UPDATE revista SET codigo =?, titulo = ?, editora = ?, dataPublicacao = ?,"
				+ "edicao=?, numeroPagina=?" + " WHERE id = ?";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setInt(1, item.getCodigo());
			stmt.setString(2, item.getTitulo());
			stmt.setString(3, item.getEditora());
			stmt.setDate(4, item.getDataPublicacao());
			stmt.setInt(5, item.getEdicao());
			stmt.setInt(6, item.getNumeroPagina());
			stmt.setInt(7, item.getId());
			
			stmt.execute();
			stmt.close();
			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
		}

	}

	public ArrayList<Revista> search(String key_id) {
		
		String sql = "SELECT FROM revista"
				+ " WHERE titulo = ?" ;
		
		ArrayList<Revista> retorno = new ArrayList<Revista>();
		
		try{
			PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, key_id);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				Revista revista = new Revista();
				revista.setCodigo(rs.getInt("codigo"));
				revista.setEdicao(rs.getInt("edicao"));
				revista.setEditora(rs.getString("editora"));
				
			}
			
			rs.close();
			stmt.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return retorno;
	}

}
