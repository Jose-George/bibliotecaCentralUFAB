package br.edu.ufab.dao.acervo;

/**Essa Interface é implementada em todas as classes do AcervoDAO, ela obriga as classes que a implementa
 * de implementar as operações de inserir, deletar e atualizar o base de dados.
 * @author	José George	
 * */

public interface ItemDAO {

	/*
	 * @param insertion()
	 * @param remove()
	 * @param update()
	 * */
	
	public boolean insertion(Object item);
	public boolean remove(Object item);
	public boolean update(Object item);
	
}
