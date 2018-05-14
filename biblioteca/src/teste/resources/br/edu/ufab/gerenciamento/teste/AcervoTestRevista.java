package br.edu.ufab.gerenciamento.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.dao.acervo.RevistaDAO;
import br.edu.ufab.model.acervo.Revista;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;
import br.edu.ufab.model.gerenciamento.GerenciamentoAcervo;

/**Essa Classe testa a inserção, remoção e atualização dos Revista na base de dados
 * @author	José George	 
 * */

public class AcervoTestRevista {

	private Funcionario func;
	private GerenciamentoAcervo sisAcervo;
	private Revista revista; 
	private RevistaDAO revistaDao;
	
	
	//Inicialização do teste
	@Before
	public void inicializandoTeste(){
		func = new Funcionario(TipoFuncionario.ADMINISTRADOR, 
				"1001", "Jose George", "1232","Cajazeiras", "Aprigio Veloso", 
				"99913413", "george.djc@gmail.com", "j.george", "123george");
		
		sisAcervo = new GerenciamentoAcervo(func);
		
		revista = new Revista("modas e vc","moda_ag-", null, 2, 21);
		revistaDao = new RevistaDAO();
		
	}
	
	//Teste Cadastro, chama o método cadastrar do sistemaInternoDeAcervo
	@Test
	public void testCadastro(){
		revista.setId(0);
		assertTrue(sisAcervo.cadastrar(revistaDao, revista));	
	}

	//Teste Editar, chama o método editar do sistemaInternoDeAcervo
	@Test
	public void testEditar(){
		revista.setId(0);
		revista.setEdicao(56);
		assertTrue(sisAcervo.editar(revistaDao, revista));	
	}
	
	//Teste Excluir, chama o método remover do sistemaInternoDeAcervo
	@Test
	public void testExcluir(){
		revista.setId(0);
		assertTrue(sisAcervo.remover(revistaDao, revista));	
	}
	
	
}
