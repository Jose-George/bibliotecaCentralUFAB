package br.edu.ufab.dao.acervo;


import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import br.edu.ufab.dao.Conexao;
import br.edu.ufab.model.acervo.AnaisCongresso;
import br.edu.ufab.model.acervo.ItemDeAcervo;


public class AnaisCongressoDAO implements ItemDAO {

	private Connection conexao;
	
	public AnaisCongressoDAO(){
		this.conexao = (Connection) Conexao.getConexao();
	}

	public boolean insertion(Object item) {
		
		String sql = "INSERT INTO anaiscongresso(tipo,titulo,autor,nomeCongresso,"
				+ "anoPublicacao, localEvento) VALUES(?,?,?,?,?,?)";

		try {
			PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, ((AnaisCongresso) item).getTipo().name());
			stmt.setString(2, (((AnaisCongresso) item).getTitulo()));
			stmt.setString(3, ((AnaisCongresso) item).getAutor());
			stmt.setString(4, ((AnaisCongresso) item).getNomeDoCongresso());
			stmt.setDate(5, ((AnaisCongresso) item).getDataPublicacao());
			stmt.setString(6, ((AnaisCongresso) item).getLocal());
			stmt.execute();
			stmt.close();
			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}

	public boolean remove(Object item) {
		
		String sql = "DELETE FROM anaiscongresso"
				+ " WHERE id = ?" ;
		
		try{
			PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);  
			stmt.setInt(1, ((AnaisCongresso) item).getId());
			stmt.execute();
			stmt.close();
			
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return false;
		
	}

	public boolean update(Object item) {
		
		 String sql = "UPDATE anaiscongresso SET tipo = ?, titulo = ?, autor = ?, nomeCongresso = ? ,"
			 		+ "anoPublicacao = ?, localEvento = ?" +
			 " WHERE id = ?";
			 
			 try{			 
				 PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);  
				 stmt.setString(1, ((AnaisCongresso) item).getTipo().name());
				 stmt.setString(2, ((ItemDeAcervo) item).getTitulo());
				 stmt.setString(3, ((AnaisCongresso) item).getAutor());
				 stmt.setString(4, ((AnaisCongresso) item).getNomeDoCongresso());
				 stmt.setDate(5,  ((ItemDeAcervo) item).getDataPublicacao());
				 stmt.setString(6, ((AnaisCongresso) item).getLocal());
				 stmt.setInt(7, ((AnaisCongresso) item).getId());
				 stmt.execute();
				 stmt.close();
				 return true;
		
			 }catch(Exception e){
				 e.printStackTrace();
			 }
			 
			return false;
	}
	
	
}
