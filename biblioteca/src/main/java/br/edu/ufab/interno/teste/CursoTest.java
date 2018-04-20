
package br.edu.ufab.interno.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.dao.curso.CursoDAO;
import br.edu.ufab.model.curso.Curso;
import br.edu.ufab.model.curso.Curso.CursoEnum;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;
import br.edu.ufab.model.interno.SistemaInternoDeCurso;

public class CursoTest {

	Funcionario func;
	Curso curso;
	CursoDAO cursoDao;
	SistemaInternoDeCurso sisCurso;
	
	@Before
	public void inicializarTest() {
		
		func = new Funcionario(TipoFuncionario.ADMINISTRADOR, "1001", "Jose George", "1232", "Cajazeiras",
				"Aprigio Veloso", "99913413", "george.djc@gmail.com", "j.george", "123george");
		curso = new Curso("Psicologia", "Saúde", CursoEnum.GRADUACAO);
		sisCurso = new SistemaInternoDeCurso(func);
		cursoDao = new CursoDAO();
	}

	@Test
	public void testAdicionarCurso() {
		curso.setNome("Psicologia");
		assertTrue(sisCurso.cadastrar(cursoDao, curso));	
	}
	
	@Test
	public void testEditarCurso() {
		curso.setArea("humana/saúde");
		curso.setTipo(Curso.CursoEnum.GRADUACAO);
		curso.setNome("Psicologia");
		assertTrue(sisCurso.editar(cursoDao, curso));	
	}

	@Test
	public void testRemoverCurso() {
		curso.setNome("Psicologia");
		assertTrue(sisCurso.remover(cursoDao, curso));	
	}
	
	
}
