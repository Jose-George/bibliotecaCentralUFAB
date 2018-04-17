package br.edu.ufab.dao.acervo;

public interface ItemDAO<tipo> {

	public boolean insertion(tipo object);
	public boolean remove(tipo object);
	public boolean update(tipo object);
	
}
