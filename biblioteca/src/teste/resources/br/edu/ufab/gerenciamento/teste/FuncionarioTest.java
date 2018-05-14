package br.edu.ufab.gerenciamento.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.dao.funcionario.FuncionarioDAO;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;
import br.edu.ufab.model.gerenciamento.GerenciamentoDeFuncionario;


/**
 * Essa classe FuncionarioTest realiza teste para verificar se os dados do curso estão 
 * sendo corretamente salvos, como também atualizados e excluidos da base de dados
 * @author	José George	 
 * */


public class FuncionarioTest {

	
	Funcionario func;
	FuncionarioDAO funcDao;
	GerenciamentoDeFuncionario sisFuncionario;
	
	
	/**
	 * Inicializando o teste
	 * Aqui é criado objetos do tipo, FunncinarioDAO, Funcionario e SistemaInternoDeAcervo,
	 * pois todos participam do cadastro de um curso na base de dados.	
	*/
	@Before
	public void inicializarTest() {
		func = new Funcionario(TipoFuncionario.ADMINISTRADOR, "1001", "Jose George", "1232", "Cajazeiras",
				"Aprigio Veloso", "99913413", "george.djc@gmail.com", "j.george", "123george");
		funcDao = new FuncionarioDAO();
		sisFuncionario = new GerenciamentoDeFuncionario(func);
	
	}
	
	/**
	 * Cadastrar um Funcionario
	 * @return false, o funcionario não foi salvo na base
	 * @return true, aluno salvo devidamente na base
	 */
	@Test
	public void testCriarCadastro() {
		assertTrue(sisFuncionario.criarFuncionario(funcDao, func));
	}
	

	/**
	 * Atualizar um Funcionario
	 * @return false, o funcionario não foi salvo na base
	 * @return true, aluno salvo devidamente na base
	 */
	@Test
	public void testAtualizarCadastro() {
		func.setCpf("1001");
		func.setEndereco("cabo branco");
		assertTrue(sisFuncionario.editarFuncionario(funcDao, func));
	}

	/**
	 * Remover um Funcionario
	 * @return false, o funcionario não foi salvo na base
	 * @return true, aluno salvo devidamente na base
	 */
	@Test
	public void testRemoverCadastro() {
		func.setCpf("1001");
		assertTrue(sisFuncionario.removerFuncionario(funcDao, func));
	}
}
