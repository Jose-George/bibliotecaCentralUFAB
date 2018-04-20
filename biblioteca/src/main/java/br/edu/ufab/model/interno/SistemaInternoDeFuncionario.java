package br.edu.ufab.model.interno;

import br.edu.ufab.dao.funcionario.FuncionarioDAO;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;

public class SistemaInternoDeFuncionario {

	public SistemaInternoDeFuncionario(Funcionario funcionario) {
		if (funcionario.isTipo() != TipoFuncionario.ADMINISTRADOR) {
			throw new IllegalArgumentException();
		}
	}

	public boolean criarFuncionario(FuncionarioDAO funcDao,Funcionario func ){
		return funcDao.insertion(func);
	}
	
	public boolean editarFuncionario(FuncionarioDAO funcDao,Funcionario func ){
		return funcDao.update(func);
	}
	
	public boolean removerFuncionario(FuncionarioDAO funcDao,Funcionario func ){
		return funcDao.remove(func);
	}
}
