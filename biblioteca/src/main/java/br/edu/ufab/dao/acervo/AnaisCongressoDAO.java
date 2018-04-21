package br.edu.ufab.dao.acervo;


import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import br.edu.ufab.dao.Conexao;
import br.edu.ufab.model.acervo.AnaisCongresso;
import br.edu.ufab.model.acervo.ItemDeAcervo;

/**
 * Classe que abre uma conexao dos objetos de AnaisCongresso com o banco e realiza inserção, atualização e remoção de objetos do
 * tipo AnaisCongresso.
 * @author	José George	
 * */

public class AnaisCongressoDAO implements ItemDAO {

	
	/**
	 * @param insertion()
	 * @param remove()
	 * @param update()
	 * */
	private Connection conexao;
	private static final Logger logger = Logger.getLogger(AnaisCongressoDAO.class);
	
	// abrindo uma conexao com a base
	public AnaisCongressoDAO(){
		this.conexao = (Connection) Conexao.getConexao();
	}

	
	/**
	 * Inserir um Anal de Congresso no banco de dados
	 * @param item,um objeto do tipo AnaisDeCongresso
	 * @return true, se o objetivo for inserido no banco de dados
	 * @return false, se não for inserido na base de dados
	 */	
	
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
			
			logger.info("inserindo no banco: "+item);
			
			stmt.execute();
			stmt.close();
			return true;

		} catch (SQLException u) {
			logger.error("Ocorreu um problema ao tentar inserir no bd", u );
			return false;
		}
	}

	/**
	 * Deletar um Anal de Congresso no banco de dados
	 * @param item,um objeto do tipo AnaisDeCongresso
	 * @return true, se o objetivo for inserido no banco de dados
	 * @return false, se não for inserido na base de dados
	 */	
	public boolean remove(Object item) {
		
		String sql = "DELETE FROM anaiscongresso"
				+ " WHERE id = ?" ;
		
		try{
			PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);  
			stmt.setInt(1, ((AnaisCongresso) item).getId());
			
			logger.info("inserindo no banco: "+item);
			
			stmt.execute();
			stmt.close();
			
			return true;
		}catch(Exception e){
			logger.error("Ocorreu um problema ao tentar remover do bd", e);
		}
		
		return false;
		
	}

	/**
	 * Atualizar um Anal de Congresso no banco de dados
	 * @param item,um objeto do tipo AnaisDeCongresso
	 * @return true, se o objetivo for inserido no banco de dados
	 * @return false, se não for inserido na base de dados
	 */	
	
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
				 
				 logger.info("update no banco: "+item);
				 
				 stmt.execute();
				 stmt.close();
				 return true;
		
			 }catch(Exception e){
				 logger.error("Ocorreu um problema ao tentar editar do bd", e);
			 }
			 
			return false;
	}
	
	
}
