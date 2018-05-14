package br.edu.ufab.acervo.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.model.acervo.TrabalhoDeConclusao;
import br.edu.ufab.model.acervo.TrabalhoDeConclusao.TrabalhoEnum;

public class TrabalhoDeConclusaoTest {

	TrabalhoDeConclusao trabalho;
	
	/**
	 * Responsável por testar os tipos da classe TrabalhoDeConclusao*/

	
	@Before
	public void test() {
		trabalho = new TrabalhoDeConclusao(TrabalhoEnum.TCC, "Carille", "Pesquisa", "Joaquim", null, "Italia");
	}

	@Test
	public void getTipoTest() {
		assertTrue(trabalho.getTipo() == TrabalhoEnum.TCC);
	}

	@Test
	public void getOrientadorTest() {
		assertTrue(trabalho.getOrientador().equals("Carille"));
	}

	@Test
	public void getTituloTest() {
		assertTrue(trabalho.getTitulo().equals("Pesquisa"));
	}

	@Test
	public void getAutorTest() {
		assertTrue(trabalho.getAutor().equals("Joaquim"));
	}

	@Test
	public void getAnoDefesaTest() {
		assertTrue(trabalho.getDataPublicacao() == null);
	}

	@Test
	public void getLocalTest() {
		assertTrue(trabalho.getLocal().equals("Italia"));
	}

}
