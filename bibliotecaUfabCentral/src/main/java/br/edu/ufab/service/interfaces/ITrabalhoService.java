package br.edu.ufab.service.interfaces;

import br.edu.ufab.model.acervo.TrabalhoDeConclusao;

public interface ITrabalhoService extends IGenericService<TrabalhoDeConclusao> {
	public boolean removeTrabalho(int codigo);
    public boolean isTrabalhoRegistered(int codigo);
    public TrabalhoDeConclusao getTrabalho(int codigo);
}
