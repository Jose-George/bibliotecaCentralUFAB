package br.edu.ufab.dao.acervo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.ufab.dao.Conexao;
import br.edu.ufab.interfaces.ItemDao;
import br.edu.ufab.model.acervo.AnaisCongresso;
import br.edu.ufab.model.acervo.Jornal;

public class JornalDao implements ItemDao<Jornal>{

	private Connection conexao;
	PreparedStatement stmt;
	
	
	public JornalDao() {
		this.conexao = (Connection) Conexao.getConexao();
	}
	
	public boolean create(Jornal item) {
		
		String sql = "INSERT INTO jornal(codigo,titulo,dataPublicacao,edicao) VALUES(?,?,?,?)";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setInt(1,item.getCodigo());
			stmt.setString(2,item.getTitulo());
			stmt.setDate(3,item.getDataPublicacao());
			stmt.setInt(4,item.getEdicao());
			stmt.execute();
			stmt.close();
			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	
	}

	public boolean remove(Jornal item) {
		
		String sql = "DELETE FROM jornal" + " WHERE id = ?";
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

	public boolean update(Jornal item) {
		
		String sql = "UPDATE jornal SET codigo =?, titulo = ?, dataPublicacao = ?, edicao = ?" + " WHERE id = ?";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setInt(1,item.getCodigo());
			stmt.setString(2, item.getTitulo());
			stmt.setDate(3, item.getDataPublicacao());
			stmt.setInt(4, item.getEdicao());
			stmt.setInt(5,item.getId());
			
			stmt.execute();
			stmt.close();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	public ArrayList<Jornal> search(String key_id) {
		
		String sql = "SELECT FROM jornal"
				+ " WHERE titulo = ?" ;
		ArrayList<Jornal> retorno = new ArrayList<Jornal>();
		try{
			PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, key_id);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				Jornal jornal = new Jornal();
				jornal.setCodigo(rs.getInt("codigo"));
				jornal.setEdicao(rs.getInt("edicao"));
				jornal.setTitulo(rs.getString("titulo"));
			}
			
			rs.close();
			stmt.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return retorno;
	}

}
