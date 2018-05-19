package br.edu.ufab.dao.acervo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.ufab.dao.Conexao;
import br.edu.ufab.interfaces.ItemDao;
import br.edu.ufab.model.acervo.AnaisCongresso;

public class AnaisDao implements ItemDao<AnaisCongresso>{

	private Connection conexao;
	
	public AnaisDao(){
		this.conexao = (Connection) Conexao.getConexao();
	}

	public boolean create(AnaisCongresso item) {
		String sql = "INSERT INTO anaisCongresso(codigo,tipo,titulo,autor,nomeCongresso,"
				+ "anoPublicacao, localEvento) VALUES(?,?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setInt(1, item.getCodigo());
			stmt.setString(2, item.getTipo().name());
			stmt.setString(3,item.getTitulo());
			stmt.setString(4,item.getAutor());
			stmt.setString(5,item.getNomeDoCongresso());
			stmt.setDate(6,item.getDataPublicacao());
			stmt.setString(7, item.getLocal());
			stmt.execute();
			stmt.close();
			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}

	public boolean remove(AnaisCongresso item) {

		String sql = "DELETE FROM anaisCongresso"
				+ " WHERE id = ?" ;
		try{
			PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);  
			stmt.setInt(1, item.getId());
			stmt.execute();
			stmt.close();
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return false;
	}

	public boolean update(AnaisCongresso item) {
		
		String sql = "UPDATE anaisCongresso SET codigo = ?, tipo = ?, titulo = ?, autor = ?, nomeCongresso = ? ,"
		 		+ "anoPublicacao = ?, localEvento = ?" +
		 " WHERE id = ?";
		
		try{
			PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setInt(1, item.getCodigo());
			stmt.setString(2, item.getTipo().name());
			stmt.setString(3,item.getTitulo());
			stmt.setString(4,item.getAutor());
			stmt.setString(5,item.getNomeDoCongresso());
			stmt.setDate(6,item.getDataPublicacao());
			stmt.setString(7, item.getLocal());
			stmt.setInt(8, item.getId());
			
			stmt.execute();
			stmt.close();
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return false;
	}

	public ArrayList<AnaisCongresso> search(String key_id) {
		
		String sql = "SELECT FROM anaisCongresso"
				+ " WHERE nomeCongresso = ?" ;
		ArrayList<AnaisCongresso> retorno = new ArrayList<AnaisCongresso>();
		try{
			PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, key_id);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				AnaisCongresso anais = new AnaisCongresso();
				anais.setAutor(rs.getString("autor"));
				anais.setCodigo(rs.getInt("codigo"));
				anais.setId(rs.getInt("id"));
				anais.setLocal(rs.getString("localEvento"));
				anais.setNomeDoCongresso(rs.getString("nomeCongresso"));
				anais.setTitulo(rs.getString("titulo"));
				retorno.add(anais);
			}
			
			rs.close();
			stmt.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return retorno;
	} 
	


}
