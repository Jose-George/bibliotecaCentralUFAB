package br.edu.ufab.dao.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.dao.acervo.LivroDao;
import br.edu.ufab.model.acervo.Jornal;
import br.edu.ufab.model.acervo.Livro;

public class LivroTest {

	LivroDao livroDao = new LivroDao();
	private Livro livro;
	
	@Before
	public void inicializandoTeste(){
		livro = new Livro(12212,"38912-1212", "use a cabeça", "kathy", "axvs", null, 1, 1232, "ti", "java");
		
	}
	
	@Test
	public void inserir(){
		assertTrue(livroDao.create(livro));
	}
	
	
	@Test
	public void testEditarCadastro() {
		livro.setTitulo("O tesouro escondido");
		livro.setId(1);
		assertTrue(livroDao.update(livro));
	}

	@Test
	public void excluir(){
		livro.setId(1);
		assertTrue(livroDao.remove(livro));
	}
	

}
