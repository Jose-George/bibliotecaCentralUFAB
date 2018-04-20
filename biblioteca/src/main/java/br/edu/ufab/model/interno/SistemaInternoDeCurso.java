package br.edu.ufab.model.interno;

//import java.util.ArrayList;

import br.edu.ufab.dao.curso.CursoDAO;
import br.edu.ufab.model.curso.Curso;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;

public class SistemaInternoDeCurso {
	
	public SistemaInternoDeCurso(Funcionario funcionario){
		if(funcionario.isTipo() != TipoFuncionario.ADMINISTRADOR){
			throw new IllegalArgumentException();
		}
	}
	
	/*
	public static ArrayList<Curso> listaCurso = new ArrayList<Curso>();
	
	public static void cadastrarCurso(Curso curso){
		listaCurso.add(curso);
	}
	*/
	
	/*
	public static void removerCurso(Curso curso, Funcionario funcionario) throws NullPointerException{
		if (funcionario.isTipo() == TipoFuncionario.ADMINISTRADOR) /*verifica se o funcionario é admin
			listaCurso.remove(curso);
	}
	
	
	public static void editarCurso(Curso cursoAntigo, Curso novoCurso) {
		int indexCursoAntigo = listaCurso.indexOf(cursoAntigo); /*captura indice do cuso antigo
		if(listaCurso.contains(cursoAntigo))
			listaCurso.set(indexCursoAntigo, novoCurso); /*atribui novo curso na mesma posicao do curso antigo (sobrescreve/
	}
	*/
	
	
	public static boolean cadastrar(CursoDAO cursoDao, Curso curso ){
		return cursoDao.insertion(curso);
	}
	
	public static boolean editar(CursoDAO cursoDao, Curso curso ){
		return cursoDao.update(curso);
	}
	
	public static boolean remover(CursoDAO cursoDao, Curso curso ){
		return cursoDao.remove(curso);
	}
	
}
