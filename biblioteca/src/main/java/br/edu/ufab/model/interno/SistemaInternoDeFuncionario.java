package br.edu.ufab.model.interno;

import br.edu.ufab.dao.funcionario.FuncionarioDAO;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;

public class SistemaInternoDeFuncionario {

	private Funcionario funcionario;
	public SistemaInternoDeFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public boolean criarFuncionario(FuncionarioDAO funcDao,Funcionario func ){
		return funcDao.insertion(func);
	}
	
	public boolean editarFuncionario(FuncionarioDAO funcDao,Funcionario func ){
		return funcDao.update(func);
	}
	
	public boolean removerFuncionario(FuncionarioDAO funcDao,Funcionario func ){
		if(funcionario.isTipo().equals(TipoFuncionario.ADMINISTRADOR)){
			return funcDao.remove(func);
		}
		return false;
	}
}
