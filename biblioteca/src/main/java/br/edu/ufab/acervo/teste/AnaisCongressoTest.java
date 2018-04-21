package br.edu.ufab.acervo.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.model.acervo.AnaisCongresso;
import br.edu.ufab.model.acervo.AnaisCongresso.AnaisEnum;

public class AnaisCongressoTest {

AnaisCongresso anais;
	
	/**
	 * 
	 * Responsável por testar os tipos da classe AnaisDeCongresso
	 * */


	/**
	 * Iniciando um teste
	 * */
	@Before
	public void inciarTeste() {
		anais = new AnaisCongresso(AnaisEnum.ARTIGO, "Congresso Novo", "Pesquisa", "Newton", 
				null, "Campina Grande");
	}

	/**
	 * Testando os tipos de Anais: Poster ou Art
	 * */
	@Test
	public void getTipoTest() {
		assertTrue(anais.getTipo() == AnaisEnum.ARTIGO);
		assertFalse(anais.getTipo() == AnaisEnum.POSTER);
	}
	
	/**
	 * Testando o nome cadastrado para o congresso
	 * */
	@Test
	public void getNomeCongressoTest() {
		assertTrue(anais.getNomeDoCongresso().equals("Congresso Novo"));
	}
	
	/**
	 * Testando o titulo da submissão cadastrado para o congresso
	 * */
	@Test
	public void getTituloTest() {
		assertTrue(anais.getTitulo().equals("Pesquisa"));
	}
	
	/**
	 * Testando o local onde ocorrerá o congresso
	 * */
	@Test
	public void getLocalTest() {
		assertTrue(anais.getLocal().equals("Campina Grande"));
	}
	
	/**
	 * Testando o autor do trabalho submetido ao congresso
	 * */
	@Test
	public void getAutorTest() {
		assertTrue(anais.getAutor().equals("Newton"));
	}
	
	/**
	 * Testando a data do trabalho submetido ao congresso
	 * */
	@Test
	public void getDataTest() {
		assertTrue(anais.getDataPublicacao() == null);
	}

}
