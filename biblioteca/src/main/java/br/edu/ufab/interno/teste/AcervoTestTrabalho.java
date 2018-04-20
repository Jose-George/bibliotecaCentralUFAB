package br.edu.ufab.interno.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.dao.acervo.TrabalhoDAO;
import br.edu.ufab.model.acervo.TrabalhoDeConclusao;
import br.edu.ufab.model.acervo.TrabalhoDeConclusao.TrabalhoEnum;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;
import br.edu.ufab.model.interno.SistemaInternoDeAcervo;

public class AcervoTestTrabalho {

	private Funcionario func;
	private SistemaInternoDeAcervo sisAcervo;
	private TrabalhoDeConclusao trab;
	private TrabalhoDAO trabDao;
	
	@Before
	public void inicializandoTeste(){
		func = new Funcionario(TipoFuncionario.ADMINISTRADOR, 
				"1001", "Jose George", "1232","Cajazeiras", "Aprigio Veloso", 
				"99913413", "george.djc@gmail.com", "j.george", "123george");
		
		sisAcervo = new SistemaInternoDeAcervo(func);
		
	
		trabDao = new TrabalhoDAO();
		trab = new TrabalhoDeConclusao(TrabalhoEnum.DISSERTACAO, "Scher", "internet das coisas","George", null,
				"campina gande");
		
		
	}
	
	
	@Test
	public void testCadastro(){
		trab.setId(0);
		assertTrue(sisAcervo.cadastrar(trabDao, trab));	
	}

	@Test
	public void testEditar(){
		trab.setId(0);
		trab.setLocal("cajazeiras");
		assertTrue(sisAcervo.editar(trabDao,trab));	
	}
	
	@Test
	public void testExcluir(){
		trab.setId(0);
		assertTrue(sisAcervo.remover(trabDao, trab));	
	}
	
}
