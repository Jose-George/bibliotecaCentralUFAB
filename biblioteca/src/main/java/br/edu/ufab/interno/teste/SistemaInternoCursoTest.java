package br.edu.ufab.interno.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.model.curso.Curso;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.TipoFuncionario;
import br.edu.ufab.model.interno.SistemaInternoCurso;
/*
 * @author Caio
 * 
 * */
public class SistemaInternoCursoTest {
	public Curso computacao;
	public Curso matematica;
	public Funcionario funcionario;
	
	@Before
	public void iniciandoTestesCurso(){
		/*criacao de novos cursos*/
		computacao = new Curso ("Computacao", "Exatas", "Graduacao");
		matematica = new Curso ("Matematica","Exatas","Graduacao");
		
		/*criacao de funcionario (admin)*/
		funcionario = new Funcionario(TipoFuncionario.ADMINISTRADOR, "101.239.213-92", "Jose George", "392.123-13",
				"Cajazeirense", "Rua aprigio Veloso", "9 9136-4561", "george.djc@gmail.com", "jgdias", "12345");
		
	}
	
	@Test
	public void cadastrarCursoTest() {/*testa cadastro do curso*/
		SistemaInternoCurso.cadastrarCurso(computacao);
		assertTrue(SistemaInternoCurso.listaCurso.contains(computacao));
	}
	
	@Test
	public void excluirCursoTest() throws Exception {/*testa exclusão do curso da lista de cursos */
		SistemaInternoCurso.cadastrarCurso(matematica);
		SistemaInternoCurso.cadastrarCurso(computacao);
		
		SistemaInternoCurso.removerCurso(matematica, funcionario); /*exclui curso, se o funcionario for adm*/
		assertFalse(SistemaInternoCurso.listaCurso.contains(matematica));
		
		SistemaInternoCurso.removerCurso(computacao, funcionario);
		assertFalse(SistemaInternoCurso.listaCurso.contains(computacao));
	}
	
	@Test
	public void editarCursoTest()  { /*testa edicao dos cursos*/
		SistemaInternoCurso.cadastrarCurso(matematica);
		SistemaInternoCurso.editarCurso(matematica, computacao); 
		
		assertFalse(SistemaInternoCurso.listaCurso.contains(matematica)); /*o sistema nao deve conter matematica nos cursos*/
		assertTrue(SistemaInternoCurso.listaCurso.contains(computacao));  /*o sistema deve conter comptacao nos cursos*/
		
	}

}
