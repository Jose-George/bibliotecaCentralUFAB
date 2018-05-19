package br.edu.ufab.service.interfaces;

import br.edu.ufab.model.acervo.AnaisCongresso;

public interface IAnaisCongresso extends IGenericService<AnaisCongresso> {
	public boolean removeAnal(int codigo);

	public boolean isAnalRegistered(int codigo);

	public AnaisCongresso getAnal(int codigo);
}
