package br.edu.ufab.dao.acervo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.ufab.dao.Conexao;
import br.edu.ufab.interfaces.ItemDao;
import br.edu.ufab.model.acervo.Revista;
import br.edu.ufab.model.acervo.TrabalhoDeConclusao;

public class TrabalhoDao implements ItemDao<TrabalhoDeConclusao>{

	private Connection conexao;
	PreparedStatement stmt;

	// abrindo uma conexao com a base
	public TrabalhoDao() {
		this.conexao = (Connection) Conexao.getConexao();
	}

	public boolean create(TrabalhoDeConclusao item) {
		
		String sql = "INSERT INTO trabalhoConclusao(codigo,tipo,autor,orientador,titulo,anoDefesa,localDefesa) VALUES(?,?,?,?,?,?,?)";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setInt(1,item.getCodigo());
			stmt.setString(2,item.getTipo().name());
			stmt.setString(3,item.getAutor());
			stmt.setString(4,item.getOrientador());
			stmt.setString(5,item.getTitulo());
			stmt.setDate(6,item.getDataPublicacao());
			stmt.setString(7,item.getLocal());

			stmt.execute();
			stmt.close();
			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}

	public boolean remove(TrabalhoDeConclusao item) {
		
		String sql = "DELETE FROM trabalhoConclusao" + " WHERE id = ?";
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

	public boolean update(TrabalhoDeConclusao item) {
		
		String sql = "UPDATE trabalhoConclusao SET codigo=?, tipo = ?, autor = ?, orientador = ?,"
				+ "titulo=?, anoDefesa=?, localDefesa=?" + " WHERE id = ?";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setInt(1,item.getCodigo());
			stmt.setString(2,item.getTipo().name());
			stmt.setString(3,item.getAutor());
			stmt.setString(4,item.getOrientador());
			stmt.setString(5,item.getTitulo());
			stmt.setDate(6,item.getDataPublicacao());
			stmt.setString(7,item.getLocal());
			stmt.setInt(8,item.getId());

			stmt.execute();
			stmt.close();
			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}

	public ArrayList<TrabalhoDeConclusao> search(String key_id) {
		
		String sql = "SELECT FROM trabalhoConclusao"
				+ " WHERE titulo = ?" ;
		
		ArrayList<TrabalhoDeConclusao> retorno = new ArrayList<TrabalhoDeConclusao>();
		
		try{
			PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, key_id);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				TrabalhoDeConclusao trabalho = new TrabalhoDeConclusao();
				trabalho.setAutor(rs.getString("autor"));
				trabalho.setCodigo(rs.getInt("codigo"));
				trabalho.setTitulo(rs.getString("titulo"));
				
			}
			
			rs.close();
			stmt.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return retorno;
	}

	
}
