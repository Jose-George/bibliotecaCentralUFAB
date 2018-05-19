package br.edu.ufab.dao;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import br.edu.ufab.dao.interfaces.ITrabalhoDao;
import br.edu.ufab.model.acervo.TrabalhoDeConclusao;

@Repository
public class TrabalhoDeConclusaoDao extends GenericDaoImplementation<TrabalhoDeConclusao> implements ITrabalhoDao {

	public boolean removeTrabalho(int id) {
		Query employeeTaskQuery = currentSession().createQuery("from TrabalhoDeConclusao u where :id");
		employeeTaskQuery.setParameter("id", id);
		return employeeTaskQuery.executeUpdate() > 0;
	}

	public boolean isTrabalhoRegistered(int id) {
		Query employeeTaskQuery = currentSession()
				.createQuery("select 'A' from TrabalhoDeConclusao u where codigo=:codigo");
		employeeTaskQuery.setParameter("codigo", id);

		return employeeTaskQuery.list().size() > 0;
	}

	public TrabalhoDeConclusao getTrabalho(int id) {
		Query query = currentSession().createQuery("from TrabalhoDeConclusao " + "where codigo=:codigo");
		query.setParameter("codigo", id);
		return (TrabalhoDeConclusao) query.uniqueResult();
	}

}
