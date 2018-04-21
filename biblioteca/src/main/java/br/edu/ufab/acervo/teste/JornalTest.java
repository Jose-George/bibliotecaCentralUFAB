package br.edu.ufab.acervo.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.model.acervo.Jornal;

public class JornalTest {

	Jornal jornal; 
	/*Responsável por testar os tipos da classe Jornal*/
	
	/*Criando um novo objeto do tipo jornal*/
	@Before
	public void iniciando () {
		jornal = new Jornal("Globo", null, 8);
	}
	
	/*teste para o titulo do jornal*/
	@Test
	public void getTituloTest() {
		assertTrue(jornal.getTitulo().equals("Globo"));
	}
	
	/*teste para a data do jornal*/
	@Test
	public void getDataPublicacaoTest() {
		assertTrue(jornal.getDataPublicacao() == null);
	}
	
	/*teste para edicao do jornal*/
	@Test
	public void getEdicaoTest() {
		assertTrue(jornal.getEdicao() == 8);
	}
}
