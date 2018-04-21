package br.edu.ufab.interno.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.dao.acervo.AnaisCongressoDAO;
import br.edu.ufab.model.acervo.AnaisCongresso;
import br.edu.ufab.model.acervo.AnaisCongresso.AnaisEnum;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;
import br.edu.ufab.model.interno.SistemaInternoDeAcervo;

/**
 * Essa Classe testa a inserção, remoção e atualização dos AnaisDeCongresso na base de dados
 * @author	José George	 
 * */

public class AcervoTestAnais {
	
	private AnaisCongresso anais;
	private Funcionario func;
	private AnaisCongressoDAO anaisDao;
	private SistemaInternoDeAcervo sisAcervo;
	
	
	//Inicialização do teste
	@Before
	public void inicializandoTeste(){
		 anais = new AnaisCongresso(AnaisEnum.ARTIGO, "CBA"
				,"Computacao parelala", "Jose ",null , "CG");
		func = new Funcionario(TipoFuncionario.ADMINISTRADOR, 
				"1001", "Jose George", "1232","Cajazeiras", "Aprigio Veloso", 
				"99913413", "george.djc@gmail.com", "j.george", "123george");
		anaisDao = new AnaisCongressoDAO();
		sisAcervo = new SistemaInternoDeAcervo(func);
	}

	//Teste Cadastro, chama o método cadastrar do sistemaInternoDeAcervo
	@Test
	public void testCadastro() {
		anais.setId(0);
		assertTrue(sisAcervo.cadastrar(anaisDao,anais));
	}

	//Teste Editar, chama o método editar do sistemaInternoDeAcervo
	@Test
	public void testEditarCadastro() {
		anais.setNomeDoCongresso("CBA - 2018 - JP");
		anais.setId(0);
		assertTrue(sisAcervo.editar(anaisDao, anais));
	}
	
	//Teste Excluir, chama o método remover do sistemaInternoDeAcervo
	@Test
	public void testExcluirCadastro() {
		anais.setId(0);
		assertTrue(sisAcervo.remover(anaisDao, anais));
	}
	
}
