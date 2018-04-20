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

public class AcervoTest {
	
	AnaisCongresso anais;
	Funcionario func;
	AnaisCongressoDAO anaisDao;
	SistemaInternoDeAcervo sisAcervo;
	
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

	@Test
	public void testCadastro() {
		assertTrue(sisAcervo.cadastrar(anaisDao,anais));
	}
	
	@Test
	public void testEditarCadastro() {
		AnaisCongresso anaisUp = new AnaisCongresso(AnaisEnum.POSTER, "CBA",
				"Computacao parelala", "Jose ",null , "CG");
		anaisUp.setId(1);
		assertTrue(sisAcervo.editar(anaisDao, anaisUp));
	}
	
	@Test
	public void testExcluirCadastro() {
		anais.setId(7);
		assertTrue(sisAcervo.remover(anaisDao, anais));
	}
	
}
