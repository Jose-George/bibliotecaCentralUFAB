package br.edu.ufab.dao.acervo;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.ufab.dao.Conexao;
import br.edu.ufab.model.acervo.MidiaEletronica;

public class MidiaDAO implements ItemDAO<MidiaEletronica> {

	private Connection conexao;
	PreparedStatement stmt;
	
	public MidiaDAO(){
		this.conexao = (Connection) Conexao.getConexao();
	}
	
	public boolean insertion(MidiaEletronica item) {

		String sql = "INSERT INTO midiaEletronica (titulo,tipo,dataGravacao) VALUES(?,?,?)";
		
		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, item.getTitulo());
			stmt.setString(2, item.getTipo().name());
			stmt.setDate(3, item.getDataPublicacao());
			
			stmt.execute();
			stmt.close();
			return true;
			
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}

	public boolean remove(MidiaEletronica item) {
		
		String sql = "DELETE FROM midiaEletronica"
				+ " WHERE id = ?" ;
		
		try{
			
			stmt = (PreparedStatement) conexao.prepareStatement(sql);  
			
			stmt.setInt(1, item.getId());
			stmt.execute();
			stmt.close();
			
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return false;
	}

	public boolean update(MidiaEletronica item) {
		
		String sql = "UPDATE jornal SET titulo = ?, tipo= ?, dataGravacao = ?" +
				 " WHERE id = ?";
				
				try{
					stmt = (PreparedStatement) conexao.prepareStatement(sql);
					stmt.setString(1, item.getTitulo());
					stmt.setString(2, item.getTipo().name());
					stmt.setDate(3, item.getDataPublicacao());
					
					stmt.execute();
					stmt.close();
					return true;
				}catch(Exception e){
					 e.printStackTrace();
				}
				
				return false;
			
	}
	
	
}
