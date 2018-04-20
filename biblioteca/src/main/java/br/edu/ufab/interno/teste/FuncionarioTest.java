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
		
		sisFuncionario = new SistemaInternoDeFuncionario(func);
	
	}
	
	@Test
	public void testCriarCadastro() {
		Funcionario operador = new Funcionario(TipoFuncionario.OPERADOR, "1002", "Jose", "1232", "Cajazeiras",
				"Aprigio Veloso", "99913413", "george.djc@gmail.com", "j.georgecg", "1234george");
	
		funcDao = new FuncionarioDAO();
		assertTrue(sisFuncionario.criarFuncionario(funcDao, operador));
		
	}
	
	@Test
	public void testRemoverCadastro() {
		Funcionario operador = new Funcionario(TipoFuncionario.OPERADOR, "1002", "Jose", "1232", "Cajazeiras",
				"Aprigio Veloso", "99913413", "george.djc@gmail.com", "j.georgecg", "1234george");
	
		funcDao = new FuncionarioDAO();
		assertTrue(sisFuncionario.removerFuncionario(funcDao, operador));
	}
	
	@Test
	public void testAtualizarCadastro() {
		Funcionario operador = new Funcionario(TipoFuncionario.ADMINISTRADOR, "1003231221", "Jose", "1232", "Cajazeiras",
				"Aprigio Veloso", "99913413", "george.djc@gmail.com", "j.f", "1234g2");
	
		funcDao = new FuncionarioDAO();
		assertTrue(sisFuncionario.editarFuncionario(funcDao, operador));
	}
	
}
