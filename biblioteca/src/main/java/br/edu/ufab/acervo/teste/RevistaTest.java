package br.edu.ufab.acervo.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.model.acervo.Revista;

public class RevistaTest {
	Revista revista;

	@Before
	public void inicia() {
		revista = new Revista("Gibi", "cartoon", null, 3, 20);
	}
	
	@Test
	public void getTituloTest() {
		assertTrue(revista.getTitulo().equals("Gibi"));
	}

	@Test
	public void getEditoraTest() {
		assertTrue(revista.getEditora().equals("cartoon"));
	}

	@Test
	public void getDataPublicacaoTest() {
		assertTrue(revista.getDataPublicacao() == null);
	}

	@Test
	public void getEdicaoTest() {
		assertTrue(revista.getEdicao() == 3);
	}
	
	@Test
	public void getNumeroPaginaTest() {
		assertTrue(revista.getNumeroPagina() == 20);
	}

}
