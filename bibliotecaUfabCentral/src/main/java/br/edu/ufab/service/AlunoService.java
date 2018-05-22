package br.edu.ufab.service;


import br.edu.ufab.dao.usuarios.AlunoDao;
import br.edu.ufab.interfaces.IService;
import br.edu.ufab.model.Aluno;
import br.edu.ufab.model.Curso;
import br.edu.ufab.model.enumerador.CursoEnum;

/**
 * CRUD de Alunos
 *
 * @author Caio Silva e Jose George
 * @version 1.0
 * @since 2018-05-15
 */

public class AlunoService implements IService{

	private Aluno aluno; 
	private AlunoDao alunoDao;
	
	public AlunoService(String nome, String nomeMae, String cpf, String rg, String naturalidade, String endereco,
			String telefone, String email, String senha, Curso curso, int anoIngresso, String periodoInrgresso){
		aluno = new Aluno(nome,nomeMae,cpf,rg,naturalidade,endereco,telefone,email,senha,curso,anoIngresso,periodoInrgresso);
		aluno.setMatricula(validacaoMatricula());
		alunoDao = new AlunoDao();
		
	}
	
	public String validacaoMatricula(){
		
		String separador="-";
		String result=""; 
		StringBuilder stringBuilder = null;
		
		if(aluno.getCurso().equals(CursoEnum.GRADUACAO)){
			result="G";
		}
		
		if(aluno.getCurso().equals(CursoEnum.ESPECIALIZACAO)){
			result="E";
		}
		
		if(aluno.getCurso().equals(CursoEnum.MESTRADO)){
			result="M";
		}
		
		if(aluno.getCurso().equals(CursoEnum.DOUTORADO)){
			result="D";
		}
		
		result+= aluno.cursoVerificacao().toString();
		result+=separador;
		result+=aluno.getAnoIngresso() + aluno.getPeriodoInrgresso();
		result+= stringBuilder.append(aluno.getCpf().substring(0, 4));
		
		return result;
	}

	public boolean create() {
		
		if(alunoDao.buscaPorMatricula(aluno.getMatricula())){
			
		}
		return false;
	}

	public boolean remove() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update() { 
		return false;
	}
	
	
	
}
