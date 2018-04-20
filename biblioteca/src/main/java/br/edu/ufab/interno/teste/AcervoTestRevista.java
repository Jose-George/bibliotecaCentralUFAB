package br.edu.ufab.interno.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.dao.acervo.RevistaDAO;
import br.edu.ufab.model.acervo.Revista;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;
import br.edu.ufab.model.interno.SistemaInternoDeAcervo;

public class AcervoTestRevista {

	private Funcionario func;
	private SistemaInternoDeAcervo sisAcervo;
	private Revista revista; 
	private RevistaDAO revistaDao;
	
	
	@Before
	public void inicializandoTeste(){
		func = new Funcionario(TipoFuncionario.ADMINISTRADOR, 
				"1001", "Jose George", "1232","Cajazeiras", "Aprigio Veloso", 
				"99913413", "george.djc@gmail.com", "j.george", "123george");
		
		sisAcervo = new SistemaInternoDeAcervo(func);
		
		revista = new Revista("modas e vc","moda_ag-", null, 2, 21);
		revistaDao = new RevistaDAO();
		
	}
	
	@Test
	public void testCadastro(){
		revista.setId(0);
		assertTrue(sisAcervo.cadastrar(revistaDao, revista));	
	}

	@Test
	public void testEditar(){
		revista.setId(0);
		revista.setEdicao(56);
		assertTrue(sisAcervo.editar(revistaDao, revista));	
	}
	
	@Test
	public void testExcluir(){
		revista.setId(0);
		assertTrue(sisAcervo.remover(revistaDao, revista));	
	}
	
	
}
