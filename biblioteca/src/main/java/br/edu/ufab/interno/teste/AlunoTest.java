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

public class AlunoTest {


	Funcionario func;
	AlunoDAO alunoDao; 
	Aluno aluno;
	SistemaInternoDeAluno sisAluno;
	Curso curso;
	
	@Before
	public void inicializarTest(){
		func = new Funcionario(TipoFuncionario.ADMINISTRADOR, "1001", "Jose George", "1232", "Cajazeiras",
				"Aprigio Veloso", "99913413", "george.djc@gmail.com", "j.george", "123george");
		
		curso = new Curso("Biologia","area",CursoEnum.GRADUACAO);

		aluno = new Aluno("Samuel Jr.","Socorro","13214312","123413","1233",
				"Cajazeiras","rua padre ibiapina","971386687","freo@gmail.com",
				"13413as",curso,2012,"2012.1");
		
		alunoDao= new AlunoDAO();	
		
		sisAluno = new SistemaInternoDeAluno(func);
	}
	
	
	
	@Test
	public void testCadastrarAluno() {
		assertTrue(sisAluno.cadastrar(alunoDao, aluno));
	}
	
	@Test
	public void testAtualizarAluno(){
		aluno.setEmail("sergiopablo@gmaill.com");
		assertTrue(sisAluno.editar(alunoDao, aluno));	
	}
	
	@Test
	public void excluirAluno(){
		assertTrue(sisAluno.remover(alunoDao, aluno));
	}

	
	

}
