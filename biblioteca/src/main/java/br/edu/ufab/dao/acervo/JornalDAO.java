package br.edu.ufab.dao.acervo;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.ufab.dao.Conexao;
import br.edu.ufab.model.acervo.Jornal;

public class JornalDAO implements ItemDAO<Jornal> {

	private Connection conexao;
	PreparedStatement stmt;

	public JornalDAO() {
		this.conexao = (Connection) Conexao.getConexao();
	}

	public boolean insertion(Jornal item) {

		String sql = "INSERT INTO jornal(titulo,dataPublicacao,edicao) VALUES(?,?,?)";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, item.getTitulo());
			stmt.setDate(2, item.getDataPublicacao());
			stmt.setInt(3, item.getEdicao());
			stmt.execute();
			stmt.close();
			return true;
			
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}

	}

	public boolean remove(Jornal item) {

		String sql = "DELETE FROM jornal"
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

	public boolean update(Jornal item) {

		String sql = "UPDATE jornal SET titulo = ?, dataPublicacao = ?, edicao = ?" +
		 " WHERE id = ?";
		
		try{
			stmt = (PreparedStatement) conexao.prepareStatement(sql);  
			stmt.setString(1,item.getTitulo());
			stmt.setDate(2,item.getDataPublicacao());
			stmt.setInt(3,item.getEdicao());
			stmt.execute();
			stmt.close();
			
			return true;
		}catch(Exception e){
			 e.printStackTrace();
		}
		
		return false;
	}

}
