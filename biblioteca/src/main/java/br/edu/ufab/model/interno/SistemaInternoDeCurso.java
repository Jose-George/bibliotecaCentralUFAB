package br.edu.ufab.model.interno;

//import java.util.ArrayList;

import br.edu.ufab.dao.curso.CursoDAO;
import br.edu.ufab.model.curso.Curso;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;

/*Essa Classe é responsável por controlar todo os curso do sistema, ela tem três metódos
 * que fazem chamadas ao CursoDAO e Curso
 * 
 * @author José George
 * */

public class SistemaInternoDeCurso {
	

	/*
	 * @param criarCurso()
	 * @param editarCurso()
	 * @param excluirCurso()
	 * */
	
	private Funcionario func;
	/* só o ADM pode excluir curso, sendo assim se faz necessário informar o funcionario
	   que irá instaciar a classe
	 */
	public SistemaInternoDeCurso(Funcionario funcionario){
		this.func = funcionario;
	}
	
	/*Metodo de cadastro, recebe por parametro um CursoDAO e um Curso
	 * @return false, se o cadastro não for possível
	 * @return true, caso o cadastro seja efetuado
	 * */
	public boolean cadastrar(CursoDAO cursoDao, Curso curso ){
		return cursoDao.insertion(curso);
	}
	
	/*Metodo de Editar, recebe por parametro um CursoDAO e um Curso
	 * @return false, se o cadastro não for possível
	 * @return true, caso o cadastro seja efetuado
	 * */
	public boolean editar(CursoDAO cursoDao, Curso curso ){
		return cursoDao.update(curso);
	}
	
	/*Metodo de remover, recebe por parametro um CursoDAO e um Curso,
	 * para excluir um aluno da base é necessário que o funcionário seja do tipo Administrador,
	 * essa verificação é feita dentro do método.
	 * 
	 * @return false, se o cadastro não for possível
	 * @return true, caso o cadastro seja efetuado
	 * */
	public boolean remover(CursoDAO cursoDao, Curso curso ){
		if(func.isTipo().equals(TipoFuncionario.ADMINISTRADOR)){
			return cursoDao.remove(curso);
		}
		return false;
	}
	
}
