package br.edu.ufab.dao.interfaces;

import br.edu.ufab.model.acervo.ItemDeAcervo;

public interface IItemDao extends IGenericDao<ItemDeAcervo> {
	public boolean removeItem(int codigo);

	public boolean isItemRegistered(int codigo);

	public ItemDeAcervo getItem(int codigo);
}
