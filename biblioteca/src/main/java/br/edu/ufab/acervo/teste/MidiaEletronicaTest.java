package br.edu.ufab.acervo.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.model.acervo.MidiaEletronica;
import br.edu.ufab.model.acervo.MidiaEletronica.MidiaEnum;

public class MidiaEletronicaTest {

	MidiaEletronica midia;
	
	/*Responsável por testar os tipos da classe Midia Eletronica*/
	
	/*Iniciando um teste*/
	@Before
	public void inicia() {
		midia = new MidiaEletronica(MidiaEnum.CD, "The Beatles", null);
	}

	/*Testando os tipos de Midia: CD ou DVD*/
	@Test
	public void getTipoTest() {
		assertTrue(midia.getTipo() == MidiaEnum.CD);
	}

	/*Testando os tipos de Anais: titulo da mídia*/
	@Test
	public void getTituloTest() {
		assertTrue(midia.getTitulo().equals("The Beatles"));
	}
	
	/*Testando a data de gravação da mídia*/
	@Test
	public void getDataGravacaoTest() {
		assertTrue(midia.getDataPublicacao() == null);
	}

}
