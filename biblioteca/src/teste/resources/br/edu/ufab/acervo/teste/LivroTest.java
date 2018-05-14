package br.edu.ufab.acervo.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.model.acervo.Livro;

public class LivroTest {
	public Livro livro; 
	
	
	@Before
	public void inicializando() {
		livro = new Livro("123456", "Java Deitel", "Harvey Deitel", "Editora qualquer", null,
				8, 1000, "Computacao", "Programacao Java");

	}
	
	@Test
	public void getIbsnTest() {
		assertTrue(livro.getIsbn().equals("123456"));

	}
	
	@Test
	public void testTituloLivro() {
		assertTrue(livro.getTitulo().equals("Java Deitel"));

	}
	
	@Test
	public void getAutorTest() {
		assertTrue(livro.getAutor().equals("Harvey Deitel"));

	}
	
	@Test
	public void getEditoraTest() {
		assertTrue(livro.getEditora().equals("Editora qualquer"));

	}
	
	@Test
	public void getDataTest() {
		assertTrue(livro.getDataPublicacao() == null);

	}
	
	@Test
	public void getEdicaoTest() {
		assertTrue(livro.getEdicao() == 8);

	}
	
	@Test
	public void getNumeroPaginaTest() {
		assertTrue(livro.getNumeroPagina() == 1000);

	}
	
	@Test
	public void getAreaConhecimentoTest() {
		assertTrue(livro.getAreaDoConhecimento().equals("Computacao"));

	}
	
	@Test
	public void getTemaTest() {
		assertTrue(livro.getTema().equals("Programacao Java"));

	}
}
