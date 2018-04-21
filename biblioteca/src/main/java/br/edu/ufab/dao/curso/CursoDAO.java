package br.edu.ufab.dao.curso;

import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.ufab.dao.Conexao;
//import br.edu.ufab.model.acervo.Revista;
import br.edu.ufab.model.curso.Curso;


/*A Classe CursoDAO abre uma conexão com o banco de dados e realiza as operações de inserir, deletar e atualizar
 * o objeto curso na base de dados.
 *  
 * @author	José George	
 * */

public class CursoDAO {

	private Connection conexao;
	PreparedStatement stmt;
	
	private static Logger logger = Logger.getLogger(CursoDAO.class);

	// abrindo uma conexao com a base
	public CursoDAO() {
		this.conexao = (Connection) Conexao.getConexao();
	}

	/**
	 * Inserir um Curso no banco de dados
	 * @param item,um objeto do tipo Curso
	 * @return true, se o objetivo for inserido no banco de dados
	 * @return false, se não for inserido na base de dados
	 */	
	public boolean insertion(Curso curso) {
		logger.info("Inserindo curso na base de dados, passando"+curso+"como parametro");
		
		boolean flag = false;
		String sql = "INSERT INTO curso(nome,areaCurso,sigla,tipo) VALUES(?,?,?,?)";

		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, curso.getNome());
			stmt.setString(2, curso.getArea());
			stmt.setString(3, curso.getSiglaNomeCurso());
			stmt.setString(4, curso.getTipo().name());
			stmt.execute();
			stmt.close();
			logger.info("Inseriu "+curso+" com sucesso!");
			flag = true;
			return flag;

		} catch (SQLException u) {
			//throw new RuntimeException(u);
			logger.error("Falha ao inserir "+curso+" na base de dados", u);
			return flag;
		}

	}

	/**
	 * Remover um Curso no banco de dados
	 * @param item,um objeto do tipo Curso
	 * @return true, se o objetivo for inserido no banco de dados
	 * @return false, se não for inserido na base de dados
	 */	
	public boolean remove(Curso curso) {
		
		String sql = "DELETE FROM curso"
				+ " WHERE nome = ? ; " ;		
		try{
			stmt = (PreparedStatement) conexao.prepareStatement(sql);  
			stmt.setString(1, curso.getNome());
			stmt.execute();
			stmt.close();
			
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * Atualizar um Curso no banco de dados
	 * @param item,um objeto do tipo curso
	 * @return true, se o objetivo for inserido no banco de dados
	 * @return false, se não for inserido na base de dados
	 */	
	public boolean update(Curso curso) {
	
		String sql = "UPDATE curso SET nome = ?, areaCurso = ?,sigla=?, tipo = ?";
				 //" WHERE nome = ?";
		
		try {
			stmt = (PreparedStatement) conexao.prepareStatement(sql);
			stmt.setString(1, curso.getNome());
			stmt.setString(2, curso.getArea());
			stmt.setString(3, curso.getSiglaNomeCurso());
			stmt.setString(4, curso.getTipo().name());
			stmt.execute();
			stmt.close();
			return true;
			
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
		
	}

}
