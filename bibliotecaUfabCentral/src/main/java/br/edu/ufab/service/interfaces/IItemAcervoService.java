package br.edu.ufab.service.interfaces;

import br.edu.ufab.model.acervo.ItemDeAcervo;

public interface IItemAcervoService extends IGenericService<ItemDeAcervo> {
	public boolean removeItem(int codigo);
    public boolean isItemRegistered(int codigo);
    public ItemDeAcervo getItem(int codigo);
}
