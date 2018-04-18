
package br.edu.ufab.dao.acervo;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.ufab.dao.Conexao;
import br.edu.ufab.model.acervo.Revista;

public class RevistaDAO implements ItemDAO<Revista> {

	private Connection conexao;
	PreparedStatement stmt;
	
	public RevistaDAO(){
		this.conexao = (Connection) Conexao.getConexao();
	}

	public boolean insertion(Revista item) {
		
		String sql = "INSERT INTO jornal(titulo,editora,dataPublicacao,edicao,numeroPagina VALUES(?,?,?,?,?)";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, item.getTitulo());
			stmt.setString(2, item.getEditora());
			stmt.setDate(3, item.getDataPublicacao());
			stmt.setInt(4, item.getEdicao());
			stmt.setInt(5, item.getNumeroPagina());
		
			stmt.execute();
			stmt.close();
			return true;
			
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
		
	}

	public boolean remove(Revista item) {
		
		String sql = "DELETE FROM revista"
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

	public boolean update(Revista item) {
		
		String sql = "UPDATE revista SET titulo = ?, editora = ?, dataPublicacao = ?,"
				+ "idicao=?, numeroPagina=?" +
				 " WHERE id = ?";
		
		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, item.getTitulo());
			stmt.setString(2, item.getEditora());
			stmt.setDate(3, item.getDataPublicacao());
			stmt.setInt(4, item.getEdicao());
			stmt.setInt(5, item.getNumeroPagina());
			stmt.setInt(6,item.getId());
		
			stmt.execute();
			stmt.close();
			return true;
			
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	
	}

	
}
