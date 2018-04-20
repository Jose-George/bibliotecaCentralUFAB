package br.edu.ufab.model.interno;

//import java.util.ArrayList;

import br.edu.ufab.dao.curso.CursoDAO;
import br.edu.ufab.model.curso.Curso;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;

public class SistemaInternoDeCurso {
	
	private Funcionario func;
	public SistemaInternoDeCurso(Funcionario funcionario){
		this.func = funcionario;
	}
	
	
	public boolean cadastrar(CursoDAO cursoDao, Curso curso ){
		return cursoDao.insertion(curso);
	}
	
	public boolean editar(CursoDAO cursoDao, Curso curso ){
		return cursoDao.update(curso);
	}
	
	public boolean remover(CursoDAO cursoDao, Curso curso ){
		if(func.isTipo().equals(TipoFuncionario.ADMINISTRADOR)){
			return cursoDao.remove(curso);
		}
		return false;
	}
	
}
