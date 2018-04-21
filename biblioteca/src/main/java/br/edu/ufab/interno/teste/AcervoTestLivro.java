package br.edu.ufab.interno.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.dao.acervo.LivroDAO;
import br.edu.ufab.model.acervo.Livro;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;
import br.edu.ufab.model.interno.SistemaInternoDeAcervo;

/*Essa Classe testa a inserção, remoção e atualização dos Livros na base de dados
 * @author	José George	 
 * */

public class AcervoTestLivro {

	private Funcionario func;
	private SistemaInternoDeAcervo sisAcervo;
	private LivroDAO livroD;
	private Livro livro;


	//Inicialização do teste
	@Before
	public void inicializandoTeste(){
		func = new Funcionario(TipoFuncionario.ADMINISTRADOR, 
				"1001", "Jose George", "1232","Cajazeiras", "Aprigio Veloso", 
				"99913413", "george.djc@gmail.com", "j.george", "123george");
		
		sisAcervo = new SistemaInternoDeAcervo(func);
		livroD = new LivroDAO();
		livro = new Livro("38912-1212", "use a cabeça", "kathy", "axvs", null, 1, 1232, "ti", "java");
		
	}
	
	//Teste Cadastro, chama o método cadastrar do sistemaInternoDeAcervo
	@Test
	public void testCadastro() {
		livro.setIsbn("38912-1212");
		assertTrue(sisAcervo.cadastrar(livroD, livro));
	}

	//Teste Editar, chama o método editar do sistemaInternoDeAcervo
	@Test
	public void editarCadastro(){
		livro.setIsbn("38912-1212");
		livro.setAreaDoConhecimento("ti da informação");
		assertTrue(sisAcervo.editar(livroD, livro));
	}
	
	//Teste Excluir, chama o método remover do sistemaInternoDeAcervo
	@Test
	public void remover(){
		livro.setIsbn("38912-1212");
		assertTrue(sisAcervo.remover(livroD, livro));
	}
	
}
