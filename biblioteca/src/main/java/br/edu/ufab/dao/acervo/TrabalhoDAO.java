package br.edu.ufab.dao.acervo;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.ufab.dao.Conexao;
import br.edu.ufab.model.acervo.TrabalhoDeConclusao;

public class TrabalhoDAO implements ItemDAO<TrabalhoDeConclusao> {

	private Connection conexao;
	PreparedStatement stmt;
	
	public TrabalhoDAO(){
		this.conexao = (Connection) Conexao.getConexao();
	}
	
	public boolean insertion(TrabalhoDeConclusao item) {
		String sql = "INSERT INTO trabalhoConclusao(tipo,autor,orientador,titulo,anoDefesa,localDefasa) VALUES(?,?,?,?,?,?)";
		
		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1,item.getTipo().name());
			stmt.setString(2, item.getAutor());
			stmt.setString(3, item.getOrientador());
			stmt.setString(4, item.getTitulo());
			stmt.setDate(5, item.getDataPublicacao());
			stmt.setString(6, item.getLocal());
		
			stmt.execute();
			stmt.close();
			return true;
			
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
		
	}

	public boolean remove(TrabalhoDeConclusao item) {
		
		String sql = "DELETE FROM trabalhoConclusao"
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

	public boolean update(TrabalhoDeConclusao item) {
		
		String sql = "UPDATE trabalhoConclusao SET tipo = ?, autor = ?, orientador = ?,"
				+ "titulo=?, anoDefesa=?, localDefesa=?" +
				 " WHERE id = ?";
		
		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1,item.getTipo().name());
			stmt.setString(2, item.getAutor());
			stmt.setString(3, item.getOrientador());
			stmt.setString(4, item.getTitulo());
			stmt.setDate(5, item.getDataPublicacao());
			stmt.setString(6, item.getLocal());
			stmt.setInt(7, item.getId());
		
			stmt.execute();
			stmt.close();
			return true;
			
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}

	}

}
