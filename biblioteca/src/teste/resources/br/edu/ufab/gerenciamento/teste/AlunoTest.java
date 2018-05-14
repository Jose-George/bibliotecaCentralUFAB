package br.edu.ufab.interno.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.dao.aluno.AlunoDAO;
import br.edu.ufab.model.aluno.Aluno;
import br.edu.ufab.model.curso.Curso;
import br.edu.ufab.model.curso.Curso.CursoEnum;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;
import br.edu.ufab.model.interno.SistemaInternoDeAluno;

/**Essa classe AlunoTest realiza teste para verificar se os dados do aluno estão 
 * sendo corretamente salvos, como também atualizados e excluidos da base de dados
 * @author	José George	 
 * */
public class AlunoTest {


	Funcionario func;
	AlunoDAO alunoDao; 
	Aluno aluno;
	SistemaInternoDeAluno sisAluno;
	Curso curso;
	
	/**
	 * Inicializando o teste
	 * Aqui é criado objetos do tipo, alunoDAO, curso, Aluno e Funcionario e SistemaInternoDeAcervo,
	 * pois todos participam do cadastro de um aluno na base de dados.	
	*/
	@Before
	public void inicializarTest(){
		func = new Funcionario(TipoFuncionario.ADMINISTRADOR, "1001", "Jose George", "1232", "Cajazeiras",
				"Aprigio Veloso", "99913413", "george.djc@gmail.com", "j.george", "123george");
		
		curso = new Curso("Biologia","area","BI",CursoEnum.GRADUACAO);

		aluno = new Aluno("Samuel Jr.","Socorro","123413","1233",
				"Cajazeiras","rua padre ibiapina","971386687","freo@gmail.com",
				"13413as",curso,2012,"1");
		

		alunoDao= new AlunoDAO();	
		
		sisAluno = new SistemaInternoDeAluno(func);
	}
	
	
	/**
	 * Cadastrar um aluno
	 * @return false, o aluno não foi salvo na base
	 * @return true, aluno salvo devidamente na base
	 */
	@Test
	public void testCadastrarAluno() {
		aluno.setCpf("123413");
		assertTrue(sisAluno.cadastrar(alunoDao, aluno));
	}

	/**
	 * Atualizar um aluno
	 * @return false, o aluno não foi salvo na base
	 * @return true, aluno salvo devidamente na base
	 */	
	@Test
	public void testAtualizarAluno(){
		aluno.setCpf("123413");
		aluno.setNaturalidade("cg-pb");
		assertTrue(sisAluno.editar(alunoDao, aluno));	
	}
	
	/**
	 * Excluir um aluno
	 * @return false, o aluno não foi salvo na base
	 * @return true, aluno salvo devidamente na base
	 */
	@Test
	public void excluirAluno(){
		aluno.setCpf("123413");
		assertTrue(sisAluno.remover(alunoDao, aluno));
	}
	
	

	
	

}
