package br.edu.ufab.dao.interfaces;

import br.edu.ufab.model.Curso;

public interface ICursoDao extends IGenericDao<Curso> {
	public boolean removeCurso(String nome);
    public boolean isCursoRegistered(String nome);
    public Curso getCurso(String nome);
}
