package br.edu.ufab.interno.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.dao.funcionario.FuncionarioDAO;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;
import br.edu.ufab.model.interno.SistemaInternoDeFuncionario;

public class FuncionarioTest {

	
	Funcionario func;
	FuncionarioDAO funcDao;
	SistemaInternoDeFuncionario sisFuncionario;
	
	
	@Before
	public void inicializarTest() {
		func = new Funcionario(TipoFuncionario.ADMINISTRADOR, "1001", "Jose George", "1232", "Cajazeiras",
				"Aprigio Veloso", "99913413", "george.djc@gmail.com", "j.george", "123george");
		funcDao = new FuncionarioDAO();
		sisFuncionario = new SistemaInternoDeFuncionario(func);
	
	}
	
	@Test
	public void testCriarCadastro() {
		assertTrue(sisFuncionario.criarFuncionario(funcDao, func));
	}
	
	@Test
	public void testAtualizarCadastro() {
		func.setCpf("1001");
		func.setEndereco("cabo branco");
		assertTrue(sisFuncionario.editarFuncionario(funcDao, func));
	}
	
	@Test
	public void testRemoverCadastro() {
		func.setCpf("1001");
		assertTrue(sisFuncionario.removerFuncionario(funcDao, func));
	}
}
