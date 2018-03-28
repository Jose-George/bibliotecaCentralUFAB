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
import br.edu.ufab.funcionario.TipoFuncionario;
import br.edu.ufab.interno.SistemaInternoAcervo;

public class SistemaInternoAcervoTest {

	AnaisCongresso anaisCongresso;
	Revista revista; 
	Funcionario funcionario;
	
	@Before
	public void inicializandoTeste(){
		anaisCongresso = new AnaisCongresso("Resumo", "ENECT", "WEB: o novo universo", "José George", 2001,
		"Campina Grande");
	    
		revista = new Revista("WEB: os frames que dominam o mercado", "uepb_livro", "2009-01-10", 3,122);
	    
		funcionario = new Funcionario(TipoFuncionario.ADMINISTRADOR, "101.239.213-92", "Jose George", "392.123-13",
		"Cajazeirense", "Rua aprigio Veloso", "9 9136-4561", "george.djc@gmail.com", "jgdias", "12345");
	}
	
	@Test
	public void cadastrarTest() {
		//SistemaInternoAcervo sia = new SistemaInternoAcervo(); 
		SistemaInternoAcervo.cadastrar(anaisCongresso);
		assertEquals(anaisCongresso, SistemaInternoAcervo.listaAcervo.get(0));
		SistemaInternoAcervo.cadastrar(revista);
		assertEquals(revista, SistemaInternoAcervo.listaAcervo.get(1));
	}
	
	@Test
	public void editarTest() throws Exception {
		//SistemaInternoAcervo sia = new SistemaInternoAcervo(); 
		SistemaInternoAcervo.cadastrar(anaisCongresso);
		SistemaInternoAcervo.editar(anaisCongresso, revista);
		assertEquals(revista, SistemaInternoAcervo.listaAcervo.get(0));
	}
	
	@Test
	public void removerTest() throws Exception {
		//SistemaInternoAcervo sia = new SistemaInternoAcervo(); 
		SistemaInternoAcervo.cadastrar(anaisCongresso);;
		SistemaInternoAcervo.cadastrar(revista);
		if(funcionario.isTipo() == TipoFuncionario.ADMINISTRADOR){
			SistemaInternoAcervo.remover(anaisCongresso);
			SistemaInternoAcervo.remover(revista);
			assertEquals(0, SistemaInternoAcervo.listaAcervo.size());
		} else{
			assertEquals(0, SistemaInternoAcervo.listaAcervo.size());
		}
		
	} 
	
}
