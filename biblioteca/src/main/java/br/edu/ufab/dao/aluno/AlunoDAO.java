package br.edu.ufab.dao.aluno;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.ufab.dao.Conexao;
import br.edu.ufab.model.aluno.Aluno;

public class AlunoDAO {

	private Connection conexao;
	PreparedStatement stmt;
	
	public AlunoDAO(){
		this.conexao = (Connection) Conexao.getConexao();
	}
	
	
	public boolean insertion(Aluno aluno) {		
	
		String sql = "INSERT INTO aluno(nome,nomeMae,cpf,rg,naturalidade,endereco"
				+ ",telefone,email,senha,nomeCurso,anoIngresso,periodoIngresso) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getNomeMae());
			stmt.setString(3, aluno.getCpf());
			stmt.setString(4, aluno.getRg());
			stmt.setString(5, aluno.getNaturalidade());
			stmt.setString(6, aluno.getEndereco());
			stmt.setString(7, aluno.getTelefone());
			stmt.setString(8, aluno.getEmail());
			stmt.setString(9, aluno.getSenha());
			stmt.setString(10, aluno.getCurso());
			stmt.setInt(11, aluno.getAnoIngresso());
			stmt.setString(12, aluno.getPeriodoInrgresso());
			stmt.execute();
			stmt.close();
			
			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
			
		}

	}
	
	public boolean update(Aluno aluno){
		
		String sql = "UPDATE aluno nome=?,nomeMae=?,rg=?,naturalidade=?,endereco=?"
				+ ",telefone=?,email=?,senha=?,anoIngresso=?,periodoIngresso=? WHERE cpf = ? ";
		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getNomeMae());
			stmt.setString(3, aluno.getCpf());
			stmt.setString(4, aluno.getRg());
			stmt.setString(5, aluno.getNaturalidade());
			stmt.setString(6, aluno.getEndereco());
			stmt.setString(7, aluno.getTelefone());
			stmt.setString(8, aluno.getEmail());
			stmt.setString(9, aluno.getSenha());
			stmt.setString(10, aluno.getCurso());
			stmt.setInt(11, aluno.getAnoIngresso());
			stmt.setString(12, aluno.getPeriodoInrgresso());
			stmt.execute();
			stmt.close();
			
			return true;

		} catch (SQLException u) {
			throw new RuntimeException(u);
			
		}

	}
	
	public boolean remove(Aluno aluno){
		
		String sql = "DELETE FROM aluno"
				+ " WHERE cpf = ? ; " ;
		
		try{
			stmt = (PreparedStatement) conexao.prepareStatement(sql);  
			stmt.setString(1, aluno.getCpf());
			stmt.execute();
			stmt.close();
			
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
		
	}
	
	
}
