package br.edu.ufab.acervo.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.model.acervo.AnaisCongresso;
import br.edu.ufab.model.acervo.AnaisCongresso.AnaisEnum;

public class AnaisCongressoTest {

AnaisCongresso anais;
	
	@Before
	public void inciarTeste() {
		anais = new AnaisCongresso(AnaisEnum.ARTIGO, "Congresso Novo", "Pesquisa", "Newton", 
				null, "Campina Grande");
	}

	
	@Test
	public void getTipoTest() {
		assertTrue(anais.getTipo() == AnaisEnum.ARTIGO);
		assertFalse(anais.getTipo() == AnaisEnum.POSTER);
	}
	
	@Test
	public void getNomeCongressoTest() {
		assertTrue(anais.getNomeDoCongresso().equals("Congresso Novo"));
	}
	
	@Test
	public void getTituloTest() {
		assertTrue(anais.getTitulo().equals("Pesquisa"));
	}
	
	@Test
	public void getLocalTest() {
		assertTrue(anais.getLocal().equals("Campina Grande"));
	}
	
	@Test
	public void getAutorTest() {
		assertTrue(anais.getAutor().equals("Newton"));
	}
	
	@Test
	public void getDataTest() {
		assertTrue(anais.getDataPublicacao() == null);
	}

}
