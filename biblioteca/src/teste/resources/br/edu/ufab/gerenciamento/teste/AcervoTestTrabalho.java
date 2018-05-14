package br.edu.ufab.gerenciamento.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.dao.acervo.TrabalhoDAO;
import br.edu.ufab.model.acervo.TrabalhoDeConclusao;
import br.edu.ufab.model.acervo.TrabalhoDeConclusao.TrabalhoEnum;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;
import br.edu.ufab.model.gerenciamento.GerenciamentoAcervo;

/**Essa Classe testa a inserção, remoção e atualização dos TrabalhoDeConclusao na base de dados
 * @author	José George	 
 * */

public class AcervoTestTrabalho {

	private Funcionario func;
	private GerenciamentoAcervo sisAcervo;
	private TrabalhoDeConclusao trab;
	private TrabalhoDAO trabDao;
	
	//Inicialização do teste
	@Before
	public void inicializandoTeste(){
		func = new Funcionario(TipoFuncionario.ADMINISTRADOR, 
				"1001", "Jose George", "1232","Cajazeiras", "Aprigio Veloso", 
				"99913413", "george.djc@gmail.com", "j.george", "123george");
		
		sisAcervo = new GerenciamentoAcervo(func);
		
	
		trabDao = new TrabalhoDAO();
		trab = new TrabalhoDeConclusao(TrabalhoEnum.DISSERTACAO, "Scher", "internet das coisas","George", null,
				"campina gande");
		
	}
	
	//Teste Cadastro, chama o método cadastrar do sistemaInternoDeAcervo
	@Test
	public void testCadastro(){
		trab.setId(0);
		assertTrue(sisAcervo.cadastrar(trabDao, trab));	
	}

	//Teste Editar, chama o método editar do sistemaInternoDeAcervo
	@Test
	public void testEditar(){
		trab.setId(0);
		trab.setLocal("cajazeiras");
		assertTrue(sisAcervo.editar(trabDao,trab));	
	}
	
	//Teste Excluir, chama o método remover do sistemaInternoDeAcervo
	@Test
	public void testExcluir(){
		trab.setId(0);
		assertTrue(sisAcervo.remover(trabDao, trab));	
	}
	
}
