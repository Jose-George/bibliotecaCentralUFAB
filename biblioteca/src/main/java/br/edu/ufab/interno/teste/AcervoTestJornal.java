package br.edu.ufab.interno.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.dao.acervo.JornalDAO;

import br.edu.ufab.model.acervo.Jornal;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;
import br.edu.ufab.model.interno.SistemaInternoDeAcervo;

public class AcervoTestJornal {

	
	private Jornal jornal;
	private Funcionario func;
	private JornalDAO jornalDao;
	private SistemaInternoDeAcervo sisAcervo;
	
	@Before
	public void inicializandoTeste(){
		func = new Funcionario(TipoFuncionario.ADMINISTRADOR, 
				"1001", "Jose George", "1232","Cajazeiras", "Aprigio Veloso", 
				"99913413", "george.djc@gmail.com", "j.george", "123george");
		
		sisAcervo = new SistemaInternoDeAcervo(func);
		jornal= new Jornal("CG amanhace triste", null, 2);
		jornalDao = new JornalDAO();
		
	}
	
	@Test
	public void testCadastro() {
		jornal.setId(0);
		assertTrue(sisAcervo.cadastrar(jornalDao, jornal));
	}

	@Test
	public void testEditarCadastro() {
		jornal.setId(0);
		jornal.setEdicao(3);
		assertTrue(sisAcervo.editar(jornalDao, jornal));
	}
	
	@Test
	public void testExcluirCadastro(){
		jornal.setId(0);
		assertTrue(sisAcervo.remover(jornalDao, jornal));
	}
	
}
