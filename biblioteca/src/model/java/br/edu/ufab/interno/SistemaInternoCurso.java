package br.edu.ufab.interno;

import java.util.ArrayList;
import br.edu.ufab.curso.Curso;

public abstract class SistemaInternoCurso {

	public static ArrayList<Curso> listaCurso = new ArrayList<Curso>();
	
	public static void cadastrarCurso(Curso curso){
		listaCurso.add(curso);
	}
	
	public static void removerCurso(Curso curso) throws Exception{
		listaCurso.remove(curso);
	}
	
	public static void editarCurso(Curso curso) throws Exception{
		listaCurso.remove(curso);
	}
	
}
