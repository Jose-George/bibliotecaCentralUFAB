package br.edu.ufab.dao.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.dao.acervo.JornalDao;
import br.edu.ufab.model.acervo.Jornal;

public class JornalTest {
	
	private Jornal jornal;
	JornalDao jornalDao = new JornalDao();
	
	@Before
	public void inicializandoTeste(){
		jornal= new Jornal(1212,"CG amanhace triste", null, 2);
	}
	
	@Test
	public void inserir(){
		assertTrue(jornalDao.create(jornal));
	}
	
	
	@Test
	public void testEditarCadastro() {
		jornal.setTitulo("nada de tristeza, por que Deus é alegria");
		jornal.setId(1);
		assertTrue(jornalDao.update(jornal));
	}
	
	@Test
	public void excluir(){
		jornal.setId(1);
		assertTrue(jornalDao.remove(jornal));
	}
	
}
