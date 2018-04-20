package br.edu.ufab.acervo.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.model.acervo.Jornal;

public class JornalTest {

	Jornal jornal; 
	
	@Before
	public void iniciando () {
		jornal = new Jornal("Globo", null, 8);
	}
	
	@Test
	public void getTituloTest() {
		assertTrue(jornal.getTitulo().equals("Globo"));
	}
	
	@Test
	public void getDataPublicacaoTest() {
		assertTrue(jornal.getDataPublicacao() == null);
	}
	
	@Test
	public void getEdicaoTest() {
		assertTrue(jornal.getEdicao() == 8);
	}
}
