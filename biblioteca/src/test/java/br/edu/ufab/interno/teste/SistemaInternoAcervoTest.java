/**
 * 
 */
package br.edu.ufab.interno.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.acervo.AnaisCongresso;
import br.edu.ufab.acervo.Revista;
import br.edu.ufab.funcionario.Funcionario;
import br.edu.ufab.interno.SistemaInternoAcervo;


/**
 * @author Jose George
 *
 */
public class SistemaInternoAcervoTest {

	AnaisCongresso anaisCongresso;
	Revista revista; 
	Funcionario funcionario;
	
	@Before
	public void inicializandoTeste(){
		anaisCongresso = new AnaisCongresso("Resumo", "ENECT", "WEB: o novo universo", "José George", 2001, "Campina Grande");
	    revista = new Revista("WEB: os frames que dominam o mercado", "uepb_livro", "2009-01-10", 3,122);
	    
	    funcionario = new Funcionario(true	, "101.239.213-92", "Jose George", "392.123-13",
				"Cajazeirense", "Rua aprigio Veloso", "9 9136-4561", "george.djc@gmail.com", "jgdias", "12345");
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
		if(funcionario.isTipo()){
			sia.remover(anaisCongresso);
			sia.remover(revista);
			assertEquals(0, sia.listaAcervo.size());
		} else{
			assertEquals(0, sia.listaAcervo.size());
		}
		
	} 
	
}
