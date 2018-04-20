package br.edu.ufab.model.interno;

import br.edu.ufab.dao.aluno.AlunoDAO;
import br.edu.ufab.model.aluno.Aluno;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;

public class SistemaInternoDeAluno {

	private Funcionario func;
	
	public SistemaInternoDeAluno(Funcionario func){
		this.func = func;
	}
	
	public boolean cadastrar(AlunoDAO alunoDao, Aluno aluno) {
		return alunoDao.insertion(aluno);
	}

	public boolean editar(AlunoDAO alunoDao, Aluno aluno) {
		return alunoDao.update(aluno);
	}

	public boolean remover(AlunoDAO alunoDao, Aluno aluno) {
		if(func.isTipo().equals(TipoFuncionario.ADMINISTRADOR)){
			return alunoDao.remove(aluno);
		}
			//lançar log/exceção
			return false;
	}

}
