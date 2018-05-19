package br.edu.ufab.dao.interfaces;


import br.edu.ufab.model.acervo.AnaisCongresso;


public interface IAnaisCongresso extends IGenericDao<AnaisCongresso>{
	public boolean removeAnal(int codigo);
    public boolean isAnalRegistered(int codigo);
    public AnaisCongresso getAnal(int codigo);
}
