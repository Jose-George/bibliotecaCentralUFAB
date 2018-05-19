package br.edu.ufab.service.interfaces;

import br.edu.ufab.model.Curso;

public interface ICursoService extends IGenericService<Curso> {
	public boolean removeCurso(String nome);
    public boolean isCursoRegistered(String nome);
    public Curso getAdmin(String nome);
}
