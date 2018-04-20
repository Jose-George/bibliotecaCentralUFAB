package br.edu.ufab.interno.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.dao.acervo.LivroDAO;
import br.edu.ufab.model.acervo.Livro;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;
import br.edu.ufab.model.interno.SistemaInternoDeAcervo;

public class AcervoTestLivro {

	private Funcionario func;
	private SistemaInternoDeAcervo sisAcervo;
	private LivroDAO livroD;
	private Livro livro;



	@Before
	public void inicializandoTeste(){
		func = new Funcionario(TipoFuncionario.ADMINISTRADOR, 
				"1001", "Jose George", "1232","Cajazeiras", "Aprigio Veloso", 
				"99913413", "george.djc@gmail.com", "j.george", "123george");
		
		sisAcervo = new SistemaInternoDeAcervo(func);
		livroD = new LivroDAO();
		livro = new Livro("38912-1212", "use a cabeça", "kathy", "axvs", null, 1, 1232, "ti", "java");
		
	}
	
	@Test
	public void testCadastro() {
		livro.setIsbn("38912-1212");
		assertTrue(sisAcervo.cadastrar(livroD, livro));
	}

	@Test
	public void editarCadastro(){
		livro.setIsbn("38912-1212");
		livro.setAreaDoConhecimento("ti da informação");
		assertTrue(sisAcervo.editar(livroD, livro));
	}
	
	@Test
	public void remover(){
		livro.setIsbn("38912-1212");
		assertTrue(sisAcervo.remover(livroD, livro));
	}
	
}
