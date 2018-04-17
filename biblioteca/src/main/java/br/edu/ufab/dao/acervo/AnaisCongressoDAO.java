package br.edu.ufab.dao.acervo;


import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.ufab.dao.Conexao;
import br.edu.ufab.model.acervo.AnaisCongresso;


public class AnaisCongressoDAO implements ItemDAO<AnaisCongresso> {

	private Connection conexao;
	
	public AnaisCongressoDAO(){
		this.conexao = (Connection) Conexao.getConexao();
	}
	
	public boolean insertion(AnaisCongresso anais) {
		
		String sql = "INSERT INTO anaiscongresso(tipo,titulo,autor,nomeCongresso,"
				+ "anoPublicacao, localEvento) VALUES(?,?,?,?,?,?)";
		
		try{
			 PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);  
			 stmt.setString(1, anais.getTipo().name());
			 stmt.setString(2, anais.getTitulo());
			 stmt.setString(3, anais.getAutor());
			 stmt.setString(4, anais.getNomeDoCongresso());
			 stmt.setDate(5,  anais.getDataPublicacao());
			 stmt.setString(6, anais.getLocal());
			 stmt.execute();
			 stmt.close();
			 return true;
			 
		} catch(SQLException u){
			throw new RuntimeException(u); 
		}
		
	}

	public boolean remove(AnaisCongresso anais) {
		
		String sql = "DELETE FROM anaiscongresso"
				+ " WHERE id = ?" ;
		
		try{
			PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);  
			stmt.setInt(1, anais.getId());
			stmt.execute();
			stmt.close();
			
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return false;
	}

	public boolean update(AnaisCongresso anais) {
		 
		 String sql = "UPDATE anaiscongresso SET tipo = ?, titulo = ?, autor = ?, nomeCongresso = ? ,"
		 		+ "anoPublicacao = ?, localEvento = ?" +
		 " WHERE id = ?";
		 
		 try{
			 
			 PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);  
			 stmt.setString(1, anais.getTipo().name());
			 stmt.setString(2, anais.getTitulo());
			 stmt.setString(3, anais.getAutor());
			 stmt.setString(4, anais.getNomeDoCongresso());
			 stmt.setDate(5,  anais.getDataPublicacao());
			 stmt.setString(6, anais.getLocal());
			 stmt.setInt(7, anais.getId());
			 stmt.execute();
			 stmt.close();
			 return true;
	
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		 
		return false;
	}		
	
}
