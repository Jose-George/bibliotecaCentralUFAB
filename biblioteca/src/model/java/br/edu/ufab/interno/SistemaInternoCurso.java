package br.edu.ufab.interno;

import java.util.ArrayList;
import br.edu.ufab.curso.Curso;
import br.edu.ufab.funcionario.Funcionario;
import br.edu.ufab.funcionario.TipoFuncionario;
/*
 * @author Caio
 * */
public abstract class SistemaInternoCurso {

	public static ArrayList<Curso> listaCurso = new ArrayList<Curso>();
	/*cadastraCurso
	 * @param Curso curso
	 * */
	public static void cadastrarCurso(Curso curso){
		listaCurso.add(curso);
	}
	
	/*metodo para remoção de curso, a remoção só é efetuada se funcionario for admin
	 * 
	 * @param Curso curso
	 * @param Funcionario funcionario
	 * @return void
	 * */
	public static void removerCurso(Curso curso, Funcionario funcionario) throws NullPointerException{
		if (funcionario.isTipo() == TipoFuncionario.ADMINISTRADOR) /*verifica se o funcionario é admin*/
			listaCurso.remove(curso);
	}
	
	/*edicao de curso substitui o curso antigo por um novo
	 * @param Curso cursoAntigo
	 * @param Curso novoCurso
	 * @return void
	 * */
	public static void editarCurso(Curso cursoAntigo, Curso novoCurso) {
		int indexCursoAntigo = listaCurso.indexOf(cursoAntigo); /*captura indice do cuso antigo*/
		if(listaCurso.contains(cursoAntigo))
			listaCurso.set(indexCursoAntigo, novoCurso); /*atribui novo curso na mesma posicao do curso antigo (sobrescreve) */
	}
	
}
