package br.edu.ufab.service.interfaces;

import br.edu.ufab.model.acervo.Jornal;

public interface IJornalService extends IGenericService<Jornal> {
	public boolean removeJornal(int codigo);
    public boolean isJornalRegistered(int codigo);
    public Jornal getJornal(int codigo);
}
