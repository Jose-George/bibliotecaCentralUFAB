package br.edu.ufab.dao.acervo;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.ufab.dao.Conexao;
import br.edu.ufab.model.acervo.Livro;

public class LivroDAO implements ItemDAO<Livro> {

	private Connection conexao;
	PreparedStatement stmt;
	
	public LivroDAO(){
		this.conexao = (Connection) Conexao.getConexao();
	}

	public boolean insertion(Livro item) {

		String sql = "INSERT INTO livro(isbn,titulo,autor,editora"
				+ "anoPublicacao, edicao, numeroPagina, areaConhecimento, tema)" + " VALUES(?,?,?,?,?,?,?,?,?)";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, item.getIsbn());
			stmt.setString(2, item.getTitulo());
			stmt.setString(3, item.getAutor());
			stmt.setString(4, item.getEditora());
			stmt.setDate(5, item.getDataPublicacao());
			stmt.setInt(6, item.getEdicao());
			stmt.setInt(7, item.getNumeroPagina());
			stmt.setString(8, item.getAreaDoConhecimento());
			stmt.setString(9, item.getTema());

			stmt.execute();
			stmt.close();

			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
		}

	}

	public boolean remove(Livro item) {

		String sql = "DELETE FROM livro" + " WHERE isbn = ?";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, item.getIsbn());
			stmt.execute();
			stmt.close();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	public boolean update(Livro item) {
		
		String sql = "UPDATE livro SET titulo = ?, autor = ?, editora=?, anoPublicacao=?, edicao=?,"
				+ "numeroPagina=?,areaConhecimento=?, tema=?"+
				 " WHERE isbn = ?";
				
				try{
					stmt = (PreparedStatement) conexao.prepareStatement(sql);  
					stmt.setString(1, item.getTitulo());
					stmt.setString(2, item.getAutor());
					stmt.setString(3, item.getEditora());
					stmt.setDate(4, item.getDataPublicacao());
					stmt.setInt(5, item.getEdicao());
					stmt.setInt(6, item.getNumeroPagina());
					stmt.setString(7, item.getAreaDoConhecimento());
					stmt.setString(8, item.getTema());
					stmt.setString(9, item.getIsbn());
					
					stmt.execute();
					stmt.close();
					
					return true;
				}catch(Exception e){
					 e.printStackTrace();
				}
				
				return false;
	}

}
