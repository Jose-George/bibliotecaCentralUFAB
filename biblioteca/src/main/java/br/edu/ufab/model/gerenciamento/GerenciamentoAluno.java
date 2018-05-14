package br.edu.ufab.model.gerenciamento;

import org.apache.log4j.Logger;

import br.edu.ufab.dao.aluno.AlunoDAO;
import br.edu.ufab.model.aluno.Aluno;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;

/**
 * Essa Classe é responsável por controlar todo os alunos do sistema, ela tem três metódos
 * que fazem chamadas ao AlunoDAO e aluno
 * 
 * @author José George
 * */

public class GerenciamentoAluno {

	/**
	 * @param criarAluno()
	 * @param editarAluno()
	 * @param excluirAluno()
	 * */
	
	private static final Logger logger = Logger.getLogger(GerenciamentoAluno.class);

	private Funcionario func;
	
	/** 
	 * só o ADM pode excluir aluno, sendo assim se faz necessário informar o funcionario
	   que irá instaciar a classe
	 */
	public GerenciamentoAluno(Funcionario func){
		logger.info("iniciando campo funcionario com:"+func.getRg());
		this.func = func;
	}
	
	/**
	 * Metodo de cadastro, recebe por parametro um AlunoDAO e um Aluno
	 * @return false, se o cadastro não for possível
	 * @return true, caso o cadastro seja efetuado
	 * */
	public boolean cadastrar(AlunoDAO alunoDao, Aluno aluno) {
		logger.info("São passados os os seguintes argumentos: "+alunoDao+" e "+aluno);
		return alunoDao.insertion(aluno);
	}

	/**
	 * Metodo de excluir, recebe por parametro um AlunoDAO e um Aluno
	 * @return false, se o cadastro não for possível
	 * @return true, caso o cadastro seja efetuado
	 * */
	public boolean editar(AlunoDAO alunoDao, Aluno aluno) {
		logger.info("São passados os os seguintes argumentos: "+alunoDao+" e "+aluno);
		return alunoDao.update(aluno);
	}

	/**
	 * Metodo de remover, recebe por parametro um AlunoDAO e um Aluno,
	 * para excluir um aluno da base é necessário que o funcionário seja do tipo Administrador,
	 * essa verificação é feita dentro do método.
	 * 
	 * @return false, se o cadastro não for possível
	 * @return true, caso o cadastro seja efetuado
	 * */
	public boolean remover(AlunoDAO alunoDao, Aluno aluno) {
		logger.info("São passados os os seguintes argumentos: "+alunoDao+" e "+aluno);
		if(func.isTipo().equals(TipoFuncionario.ADMINISTRADOR)){
			logger.info("O funcionario é adm");
			return alunoDao.remove(aluno);
		}
		logger.warn("O funcionario NÃO é adm");
			return false;
	}

}
