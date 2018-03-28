package br.edu.ufab.interno.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.curso.Curso;
import br.edu.ufab.interno.SistemaInternoCurso;

public class SistemaInternoCursoTest {
	public Curso computacao;
	
	@Before
	public void iniciandoTestesCurso(){
		computacao = new Curso ("Computacao", "Exatas", "Graduacao");
	}
	
	@Test
	public void cadastrarCursoTest() {
		SistemaInternoCurso.cadastrarCurso(computacao);
		assertTrue(SistemaInternoCurso.listaCurso.contains(computacao));
	}
	
	@Test
	public void excluirCursoTest() {
		fail("Not yet implemented");
	}
	
	@Test
	public void editarCursoTest() {
		fail("Not yet implemented");
	}

}
