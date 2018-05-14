package br.edu.ufab.model.gerenciamento;

import org.apache.log4j.Logger;

import br.edu.ufab.dao.funcionario.FuncionarioDAO;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;

/**
 * Essa Classe é responsável por controlar todo os funcionarios do sistema, ela tem três metódos
 * que fazem chamadas ao FuncionarioDAO e Funcionario
 * 
 * @author José George
 * */

public class GerenciamentoDeFuncionario {

	private static final Logger logger = Logger.getLogger(GerenciamentoDeFuncionario.class);
	private Funcionario funcionario;
	
	/**
	 * @param criarFuncionario()
	 * @param editarFuncionario()
	 * @param excluirFuncionario()
	 * */
	
	public GerenciamentoDeFuncionario(Funcionario funcionario) {
		logger.info("iniciando campo funcionario com: "+funcionario.getRg());
		this.funcionario = funcionario;
	}
	/**
	 * @return false, erro ao criar um novo funcionario
	 * @return true, funcionario criado na base com sucesso
	 * */
	public boolean criarFuncionario(FuncionarioDAO funcDao,Funcionario func ){
		logger.info("foram passados os seguintes valores: "+funcDao+" e "+func);
		return funcDao.insertion(func);
	}

	/**
	 * @return false, erro ao editar um novo funcionario
	 * @return true, funcionario editado na base com sucesso
	 * */
	public boolean editarFuncionario(FuncionarioDAO funcDao,Funcionario func ){
		logger.info("foram passados os seguintes valores: "+funcDao+" e "+func);
		return funcDao.update(func);
	}
	/**
	 * @return false, erro ao excluir um novo funcionario
	 * @return true, funcionario excluido na base com sucesso
	 * */
	public boolean removerFuncionario(FuncionarioDAO funcDao,Funcionario func ){
		logger.info("foram passados os seguintes valores: "+funcDao+" e "+func);
		if(funcionario.isTipo().equals(TipoFuncionario.ADMINISTRADOR)){
			logger.info("funcionario é adm");
			return funcDao.remove(func);
		}
		logger.info("funcionario NAO é adm");
		return false;
	}
}
