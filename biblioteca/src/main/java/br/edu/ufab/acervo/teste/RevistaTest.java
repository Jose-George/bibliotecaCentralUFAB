package br.edu.ufab.acervo.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.model.acervo.Revista;

public class RevistaTest {
	Revista revista;
	
	/*Responsável por testar os tipos da classe Revista*/
	
	/*Iniciando um teste*/
	@Before
	public void inicia() {
		revista = new Revista("Gibi", "cartoon", null, 3, 20);
	}
	
	/*Testando o titulo da revista*		/
	@Test
	public void getTituloTest() {
		assertTrue(revista.getTitulo().equals("Gibi"));
	}

	/*Testando a editora da revista*/
	@Test
	public void getEditoraTest() {
		assertTrue(revista.getEditora().equals("cartoon"));
	}

	/*Testando a data de publicacao da revista*/
	@Test
	public void getDataPublicacaoTest() {
		assertTrue(revista.getDataPublicacao() == null);
	}
	
	/*Testando a edicao da revista*/
	@Test
	public void getEdicaoTest() {
		assertTrue(revista.getEdicao() == 3);
	}
	
	/*Testando o numero de página*/
	@Test
	public void getNumeroPaginaTest() {
		assertTrue(revista.getNumeroPagina() == 20);
	}

}
