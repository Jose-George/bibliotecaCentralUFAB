package br.edu.ufab.dao.usuarios;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.ufab.dao.Conexao;
import br.edu.ufab.interfaces.UserDao;
import br.edu.ufab.model.Aluno;

public class AlunoDao implements UserDao<Aluno> {

	private Connection conexao;
	PreparedStatement stmt;
	
	public AlunoDao(){
		this.conexao = (Connection) Conexao.getConexao();
	}
	
	public boolean create(Aluno aluno) {
		
		String sql = "INSERT INTO aluno(nome,nomeMae,matricula,cpf,rg,naturalidade,endereco"
				+ ",telefone,email,senha,nomeCurso,anoIngresso,periodoIngresso) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getNomeMae());
			stmt.setString(3, aluno.getMatricula());
			stmt.setString(4, aluno.getCpf());
			stmt.setString(5, aluno.getRg());
			stmt.setString(6, aluno.getNaturalidade());
			stmt.setString(7, aluno.getEndereco());
			stmt.setString(8, aluno.getTelefone());
			stmt.setString(9, aluno.getEmail());
			stmt.setString(10, aluno.getSenha());
			stmt.setString(11, aluno.getCurso());
			stmt.setInt(12, aluno.getAnoIngresso());
			stmt.setString(13, aluno.getPeriodoInrgresso());
			stmt.execute();
			stmt.close();
			
			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
			
		}
		
	}

	public boolean remove(Aluno aluno) {
		
		String sql = "DELETE FROM aluno"
				+ " WHERE id = ?" ;
		
		try{
			stmt = (PreparedStatement) conexao.prepareStatement(sql);  
			stmt.setInt(1, aluno.getId());
			stmt.execute();
			stmt.close();
			
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	public boolean update(Aluno aluno) {
		String sql = "UPDATE aluno SET nome=?,nomeMae=?,matricula=?,cpf=?,rg=?,naturalidade=?,endereco=?"
				+ ",telefone=?,email=?,senha=?,nomeCurso=?,anoIngresso=?,periodoIngresso=? WHERE id= ? ";
		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getNomeMae());
			stmt.setString(3, aluno.getMatricula());
			stmt.setString(4, aluno.getCpf());
			stmt.setString(5, aluno.getRg());
			stmt.setString(6, aluno.getNaturalidade());
			stmt.setString(7, aluno.getEndereco());
			stmt.setString(8, aluno.getTelefone());
			stmt.setString(9, aluno.getEmail());
			stmt.setString(10, aluno.getSenha());
			stmt.setString(11, aluno.getCurso());
			stmt.setInt(12, aluno.getAnoIngresso());
			stmt.setString(13, aluno.getPeriodoInrgresso());
			stmt.setInt(14, aluno.getId());	
			stmt.execute();
			stmt.close();
			
			return true;
			
		} catch (SQLException u) {
			throw new RuntimeException(u);
			
		}
	}
		

	public ArrayList<Aluno> searchAll(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
