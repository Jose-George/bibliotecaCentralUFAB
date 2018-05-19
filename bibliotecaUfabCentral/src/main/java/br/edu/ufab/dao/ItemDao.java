package br.edu.ufab.dao;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;


import br.edu.ufab.dao.interfaces.IItemDao;
import br.edu.ufab.model.acervo.AnaisCongresso;
import br.edu.ufab.model.acervo.ItemDeAcervo;

@Repository
public class ItemDao extends GenericDaoImplementation<ItemDeAcervo> implements IItemDao {
	public boolean removeItem(int codigo) {
		Query employeeTaskQuery = currentSession().createQuery("from ItemDeAcervo u where :codigo");
		employeeTaskQuery.setParameter("codigo", codigo);
		return employeeTaskQuery.executeUpdate() > 0;
	}

	public boolean isItemRegistered(int codigo) {
		Query employeeTaskQuery = currentSession().createQuery("select 'A' from ItemDeAcervo u where codigo=:codigo");
		employeeTaskQuery.setParameter("codigo", codigo);
		return employeeTaskQuery.list().size() > 0;
	}

	public ItemDeAcervo getItem(int codigo) {
		Query query = currentSession().createQuery("from ItemDeAcervo" + "where codigo=:codigo");
		query.setParameter("codigo", codigo);
		return (AnaisCongresso) query.uniqueResult();
	}
}
