package br.edu.ufab.dao.acervo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.ufab.dao.Conexao;
import br.edu.ufab.interfaces.ItemDao;
import br.edu.ufab.model.acervo.AnaisCongresso;
import br.edu.ufab.model.acervo.MidiaEletronica;

public class MidiaDao implements ItemDao<MidiaEletronica> {

	private Connection conexao;
	PreparedStatement stmt;

	public MidiaDao() {
		this.conexao = (Connection) Conexao.getConexao();
	}

	
	public boolean create(MidiaEletronica item) {
		
		String sql = "INSERT INTO midiaEletronica (codigo,titulo,tipo,dataGravacao) VALUES(?,?,?,?)";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setInt(1,item.getCodigo());
			stmt.setString(2,item.getTitulo());
			stmt.setString(3,item.getTipo().name());
			stmt.setDate(4,item.getDataPublicacao());

			stmt.execute();
			stmt.close();
			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}

	public boolean remove(MidiaEletronica item) {
		
		String sql = "DELETE FROM midiaEletronica" + " WHERE id = ?";
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

	public boolean update(MidiaEletronica item) {
		String sql = "UPDATE midiaEletronica SET codigo=?, titulo = ?, tipo= ?, dataGravacao = ?" + " WHERE id = ?";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			
			stmt.setInt(1,item.getCodigo());
			stmt.setString(2,item.getTitulo());
			stmt.setString(3,item.getTipo().name());
			stmt.setDate(4,item.getDataPublicacao());
			stmt.setInt(5,item.getId());
			
			stmt.execute();
			stmt.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

	public ArrayList<MidiaEletronica> search(String key_id) {	
		String sql = "SELECT FROM midiaEletronica"
				+ " WHERE titulo = ?" ;
		
		ArrayList<MidiaEletronica> retorno = new ArrayList<MidiaEletronica>();
		try{
			PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, key_id);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				MidiaEletronica midia = new MidiaEletronica();
				midia.setCodigo(rs.getInt("codigo"));
				midia.setTitulo(rs.getString("titulo"));
			}
			
			rs.close();
			stmt.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return retorno;

	}

}
