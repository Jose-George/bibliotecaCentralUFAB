package br.edu.ufab.interno.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.dao.acervo.MidiaDAO;
import br.edu.ufab.model.acervo.MidiaEletronica;
import br.edu.ufab.model.acervo.MidiaEletronica.MidiaEnum;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;
import br.edu.ufab.model.interno.SistemaInternoDeAcervo;

public class AcervoTestMidia {

	private Funcionario func;
	private SistemaInternoDeAcervo sisAcervo;
	private MidiaEletronica midia;
	private MidiaDAO midiaDao;
	

	@Before
	public void inicializandoTeste(){
		func = new Funcionario(TipoFuncionario.ADMINISTRADOR, 
				"1001", "Jose George", "1232","Cajazeiras", "Aprigio Veloso", 
				"99913413", "george.djc@gmail.com", "j.george", "123george");
		
		sisAcervo = new SistemaInternoDeAcervo(func);
		
		midiaDao = new MidiaDAO();
		
		midia = new MidiaEletronica(MidiaEnum.CD, "trabalho ", null);
	}
	
	@Test
	public void testCadastrar(){
		midia.setId(0);
		assertTrue(sisAcervo.cadastrar(midiaDao, midia));
	}
	
	@Test
	public void testEditar(){
		midia.setId(0);
		midia.setTitulo("uma história");
		assertTrue(sisAcervo.editar(midiaDao, midia));
	}
	@Test
	public void TestRemover(){
		midia.setId(0);
		assertTrue(sisAcervo.remover(midiaDao, midia));
	}
	
	
	
	
}
