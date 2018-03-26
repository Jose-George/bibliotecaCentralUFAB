/**
 * 
 */
package br.edu.ufab.interno.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.acervo.AnaisCongresso;
import br.edu.ufab.acervo.Revista;
import br.edu.ufab.interno.SistemaInternoAcervo;


/**
 * @author Jose George
 *
 */
public class SistemaInternoAcervoTest {

	AnaisCongresso anaisCongresso;
	Revista revista; 
	
	@Before
	public void inicializandoTeste(){
		anaisCongresso = new AnaisCongresso("Resumo", "ENECT", "WEB: o novo universo", "José George", 2001, "Campina Grande");
	    revista = new Revista("WEB: os frames que dominam o mercado", "uepb_livro", "2009-01-10", 3,122);
	}
	
	@Test
	public void cadastrarTest() {
		SistemaInternoAcervo sia = new SistemaInternoAcervo(); 
		sia.cadastrar(anaisCongresso);
		assertEquals(anaisCongresso, sia.listaAcervo.get(0));
		sia.cadastrar(revista);
		assertEquals(revista, sia.listaAcervo.get(1));
	}
	
	@Test
	public void editarTest() throws Exception {
		SistemaInternoAcervo sia = new SistemaInternoAcervo(); 
		sia.cadastrar(anaisCongresso);
		sia.editar(anaisCongresso, revista);
		assertEquals(revista,sia.listaAcervo.get(0));
	}
	
	@Test
	public void removerTest() throws Exception {
		SistemaInternoAcervo sia = new SistemaInternoAcervo(); 
		sia.cadastrar(anaisCongresso);;
		sia.cadastrar(revista);
		sia.remover(anaisCongresso);
		sia.remover(revista);
		assertEquals(0, sia.listaAcervo.size());
	} 
	
}
