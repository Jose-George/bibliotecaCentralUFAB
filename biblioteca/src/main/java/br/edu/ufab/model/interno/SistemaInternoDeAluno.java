package br.edu.ufab.model.interno;

import br.edu.ufab.dao.aluno.AlunoDAO;
import br.edu.ufab.model.aluno.Aluno;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;

/*Essa Classe é responsável por controlar todo os alunos do sistema, ela tem três metódos
 * que fazem chamadas ao AlunoDAO e aluno
 * 
 * @author José George
 * */

public class SistemaInternoDeAluno {

	private Funcionario func;
	
	/* só o ADM pode excluir aluno, sendo assim se faz necessário informar o funcionario
	   que irá instaciar a classe
	 */
	public SistemaInternoDeAluno(Funcionario func){
		this.func = func;
	}
	
	/*Metodo de cadastro, recebe por parametro um AlunoDAO e um Aluno
	 * @return false, se o cadastro não for possível
	 * @return true, caso o cadastro seja efetuado
	 * */
	public boolean cadastrar(AlunoDAO alunoDao, Aluno aluno) {
		return alunoDao.insertion(aluno);
	}

	/*Metodo de excluir, recebe por parametro um AlunoDAO e um Aluno
	 * @return false, se o cadastro não for possível
	 * @return true, caso o cadastro seja efetuado
	 * */
	public boolean editar(AlunoDAO alunoDao, Aluno aluno) {
		return alunoDao.update(aluno);
	}

	/*Metodo de remover, recebe por parametro um AlunoDAO e um Aluno,
	 * para excluir um aluno da base é necessário que o funcionário seja do tipo Administrador,
	 * essa verificação é feita dentro do método.
	 * 
	 * @return false, se o cadastro não for possível
	 * @return true, caso o cadastro seja efetuado
	 * */
	public boolean remover(AlunoDAO alunoDao, Aluno aluno) {
		if(func.isTipo().equals(TipoFuncionario.ADMINISTRADOR)){
			return alunoDao.remove(aluno);
		}
			//lançar log/exceção
			return false;
	}

}
