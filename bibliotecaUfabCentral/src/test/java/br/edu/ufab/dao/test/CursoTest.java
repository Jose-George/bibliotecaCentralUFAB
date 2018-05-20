package br.edu.ufab.dao.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.dao.CursoDao;
import br.edu.ufab.model.Curso;
import br.edu.ufab.model.enumerador.CursoEnum;

public class CursoTest {

	Curso curso;
	CursoDao cursoDao;
	
	@Before
	public void inicializarTest() {
		curso = new Curso(1111,"Psicologia", "Saúde","PI", CursoEnum.GRADUACAO);
		cursoDao = new CursoDao();
	}
	
	@Test
	public void testAdicionarCurso() {
		assertTrue(cursoDao.create(curso));	
	}
	
	@Test
	public void testEditarCurso() {
		curso.setId(1);
		curso.setArea("humana/saúde");
		assertTrue(cursoDao.update(curso));	
	}

	@Test
	public void testRemoverCurso() {
		curso.setId(1);
		assertTrue(cursoDao.remove(curso));	
	}
	

	


}
