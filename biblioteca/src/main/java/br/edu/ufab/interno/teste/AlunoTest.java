package br.edu.ufab.interno.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.dao.aluno.AlunoDAO;
import br.edu.ufab.model.aluno.Aluno;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;
import br.edu.ufab.model.interno.SistemaInternoDeAluno;

public class AlunoTest {


	Funcionario func;
	AlunoDAO alunoDao; 
	Aluno aluno;
	SistemaInternoDeAluno sisAluno;
	
	@Before
	public void inicializarTest(){
		func = new Funcionario(TipoFuncionario.ADMINISTRADOR, "1001", "Jose George", "1232", "Cajazeiras",
				"Aprigio Veloso", "99913413", "george.djc@gmail.com", "j.george", "123george");
		
		aluno = new Aluno("Samuel Jr.","1232879");
		alunoDao= new AlunoDAO();
		
		sisAluno = new SistemaInternoDeAluno(func);
	}
	
	
	
	@Test
	public void testCadastrarAluno() {
		assertTrue(sisAluno.cadastrar(alunoDao, aluno));
	}
	
	@Test
	public void testAtualizarAluno(){
		Aluno aluno2 = new Aluno("SAMUEL NÃO JR","1232879");
		assertTrue(sisAluno.editar(alunoDao, aluno2));	
	}
	
	@Test
	public void excluirAluno(){
		assertTrue(sisAluno.remover(alunoDao, aluno));
	}

	
	

}
