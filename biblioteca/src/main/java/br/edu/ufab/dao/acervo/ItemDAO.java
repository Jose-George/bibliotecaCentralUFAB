package br.edu.ufab.dao.acervo;

public interface ItemDAO<tipo> {

	public boolean insertion(tipo item);
	public boolean remove(tipo item);
	public boolean update(tipo item);
	
}
