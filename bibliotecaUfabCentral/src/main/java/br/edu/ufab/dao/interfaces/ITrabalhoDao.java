package br.edu.ufab.dao.interfaces;

import br.edu.ufab.model.acervo.TrabalhoDeConclusao;

public interface ITrabalhoDao extends IGenericDao<TrabalhoDeConclusao> {
	public boolean removeTrabalho(int id);
	public boolean isTrabalhoRegistered(int id);
	public TrabalhoDeConclusao getTrabalho(int id);
}
