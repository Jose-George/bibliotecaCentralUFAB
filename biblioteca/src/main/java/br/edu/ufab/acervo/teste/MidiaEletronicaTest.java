package br.edu.ufab.acervo.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.model.acervo.MidiaEletronica;
import br.edu.ufab.model.acervo.MidiaEletronica.MidiaEnum;

public class MidiaEletronicaTest {

	MidiaEletronica midia;

	@Before
	public void inicia() {
		midia = new MidiaEletronica(MidiaEnum.CD, "The Beatles", null);
	}

	@Test
	public void getTipoTest() {
		assertTrue(midia.getTipo() == MidiaEnum.CD);
	}

	@Test
	public void getTituloTest() {
		assertTrue(midia.getTitulo().equals("The Beatles"));
	}

	@Test
	public void getDataGravacaoTest() {
		assertTrue(midia.getDataPublicacao() == null);
	}

}
