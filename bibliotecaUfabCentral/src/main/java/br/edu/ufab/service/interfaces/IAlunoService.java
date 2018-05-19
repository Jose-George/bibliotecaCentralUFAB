package br.edu.ufab.service.interfaces;

import br.edu.ufab.model.Aluno;

public interface IAlunoService extends IGenericService<Aluno>{
	public boolean removeAluno(String matricula);
    public boolean isAlunoRegistered(String matricula);
    public Aluno getAluno(String matricula);
}
