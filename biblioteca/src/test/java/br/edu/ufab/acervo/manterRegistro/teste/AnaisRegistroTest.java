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

}
