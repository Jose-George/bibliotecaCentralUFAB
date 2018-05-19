package br.edu.ufab.dao.interfaces;



import br.edu.ufab.model.Aluno;

public interface IAlunoDao extends IGenericDao<Aluno> {
	public boolean removeAluno(String matricula);
    public boolean isAlunoRegistered(String matricula);
    public Aluno getAluno(String matricula);
}
