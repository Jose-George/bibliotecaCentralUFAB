/*
 * @author Caio
 * 
 */
package br.edu.ufab.interno.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.acervo.AnaisCongresso;
import br.edu.ufab.acervo.Revista;
import br.edu.ufab.funcionario.Funcionario;
import br.edu.ufab.funcionario.TipoFuncionario;
import br.edu.ufab.interno.SistemaInternoAcervo;

public class SistemaInternoAcervoTest {

	AnaisCongresso anaisCongresso;
	Revista revista; 
	Funcionario funcionario;
	
	@Before
	public void inicializandoTeste(){ /*codigo executado antes de cada teste*/
		anaisCongresso = new AnaisCongresso("Resumo", "ENECT", "WEB: o novo universo", "José George", 2001,
		"Campina Grande");
	    
		revista = new Revista("WEB: os frames que dominam o mercado", "uepb_livro", "2009-01-10", 3,122);
	    
		funcionario = new Funcionario(TipoFuncionario.ADMINISTRADOR, "101.239.213-92", "Jose George", "392.123-13",
		"Cajazeirense", "Rua aprigio Veloso", "9 9136-4561", "george.djc@gmail.com", "jgdias", "12345");
	}
	
	@Test
	public void cadastrarTest() {/*testa a funcionaliade de cadastrar da classe SistemaInternoAcervo */
		//SistemaInternoAcervo sia = new SistemaInternoAcervo(); 
		SistemaInternoAcervo.cadastrar(anaisCongresso);/*cadastra itemAcervo*/
		assertTrue(SistemaInternoAcervo.listaAcervo.contains(anaisCongresso));/*itemDoAcervo deve estar na lista de itens*/
		SistemaInternoAcervo.cadastrar(revista);
		assertTrue(SistemaInternoAcervo.listaAcervo.contains(anaisCongresso));/**/
	}
	
	@Test
	public void editarTest() throws Exception {
		//SistemaInternoAcervo sia = new SistemaInternoAcervo(); 
		SistemaInternoAcervo.cadastrar(anaisCongresso);
		SistemaInternoAcervo.editar(anaisCongresso, revista);
		assertFalse(SistemaInternoAcervo.listaAcervo.contains(anaisCongresso));/*anaisCongresso não deve estar na lista de itens*/
		assertTrue(SistemaInternoAcervo.listaAcervo.contains(revista));/*revista deve estar na lista de itens*/
	}
	
	@Test
	public void removerTest() throws Exception {
		//SistemaInternoAcervo sia = new SistemaInternoAcervo(); 
		SistemaInternoAcervo.cadastrar(anaisCongresso);;
		SistemaInternoAcervo.cadastrar(revista);
		SistemaInternoAcervo.remover(anaisCongresso, funcionario);/*remove item da lista, se o funcionario for adm*/
		SistemaInternoAcervo.remover(revista, funcionario);
		
		
		assertTrue(!SistemaInternoAcervo.listaAcervo.contains(anaisCongresso));
		assertTrue(!SistemaInternoAcervo.listaAcervo.contains(revista));	
		
	} // fim do removerTeste
	
}
