package br.edu.ufab.model.interno;

import br.edu.ufab.dao.funcionario.FuncionarioDAO;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;

/*Essa Classe é responsável por controlar todo os funcionarios do sistema, ela tem três metódos
 * que fazem chamadas ao FuncionarioDAO e Funcionario
 * 
 * @author José George
 * */

public class SistemaInternoDeFuncionario {

	
	/*
	 * @param criarFuncionario()
	 * @param editarFuncionario()
	 * @param excluirFuncionario()
	 * */
	private Funcionario funcionario;
	public SistemaInternoDeFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	/*
	 * @return false, erro ao criar um novo funcionario
	 * @return true, funcionario criado na base com sucesso
	 * */
	public boolean criarFuncionario(FuncionarioDAO funcDao,Funcionario func ){
		return funcDao.insertion(func);
	}

	/*
	 * @return false, erro ao editar um novo funcionario
	 * @return true, funcionario editado na base com sucesso
	 * */
	public boolean editarFuncionario(FuncionarioDAO funcDao,Funcionario func ){
		return funcDao.update(func);
	}
	/*
	 * @return false, erro ao excluir um novo funcionario
	 * @return true, funcionario excluido na base com sucesso
	 * */
	public boolean removerFuncionario(FuncionarioDAO funcDao,Funcionario func ){
		if(funcionario.isTipo().equals(TipoFuncionario.ADMINISTRADOR)){
			return funcDao.remove(func);
		}
		return false;
	}
}
