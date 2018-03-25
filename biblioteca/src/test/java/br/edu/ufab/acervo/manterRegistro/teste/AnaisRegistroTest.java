package br.edu.ufab.acervo.manterRegistro.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.acervo.AnaisCongresso;
import br.edu.ufab.acervo.manterRegistro.AnaisRegistro;

public class AnaisRegistroTest {
	
	AnaisCongresso anaisCongresso;
	AnaisRegistro anaisRegistro;
	
	@Before
	public void inicializandoTeste(){
		anaisCongresso = new AnaisCongresso("Resumo", "ENECT", "WEB: o novo universo", "José George", 2001, "Campina Grande");
		 anaisRegistro = new AnaisRegistro();
	}
	
	@Test
	public void testAdicionarItem() {
		anaisRegistro.adicionarItem(anaisCongresso);
		assertEquals("Resumo", AnaisRegistro.listaAcervo.get(0).getTipo());
	}
	
	@Test
	public void testRemoverItem() {
		anaisRegistro.adicionarItem(anaisCongresso);
		anaisRegistro.excluirItem(anaisCongresso);
		assertEquals(0, AnaisRegistro.listaAcervo.size());
	}
	
	@Test
	public void testEditarItem() {
		anaisRegistro.adicionarItem(anaisCongresso);
		AnaisCongresso anaisCongressoNovo = new AnaisCongresso("Resumo", "CONAPESC", "José", "George", 2011,"CAMPG");
		anaisRegistro.editarItem(anaisCongresso, anaisCongressoNovo);
		assertEquals("CONAPESC", AnaisRegistro.listaAcervo.get(0).getNomeDoCongresso());
		
	}
	
	
	
}
