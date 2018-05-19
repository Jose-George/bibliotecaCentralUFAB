package br.edu.ufab.dao.implementation;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import br.edu.ufab.dao.interfaces.IAnaisCongresso;
import br.edu.ufab.model.acervo.AnaisCongresso;

@Repository
public class AnaisCongressoDao extends GenericDaoImplementation<AnaisCongresso> implements IAnaisCongresso {

	public boolean removeAnal(int codigo) {
		Query employeeTaskQuery = currentSession().createQuery("from AnaisCongresso u where :codigo");
		employeeTaskQuery.setParameter("codigo", codigo);
		return employeeTaskQuery.executeUpdate() > 0;
	}

	public boolean isAnalRegistered(int codigo) {
		Query employeeTaskQuery = currentSession().createQuery("select 'A' from AnaisCongresso u where codigo=:codigo");
		employeeTaskQuery.setParameter("codigo", codigo);
		return employeeTaskQuery.list().size() > 0;
	}

	public AnaisCongresso getAnal(int codigo) {
		Query query = currentSession().createQuery("from AnaisCongresso" + "where codigo=:codigo");
		query.setParameter("codigo", codigo);
		return (AnaisCongresso) query.uniqueResult();
	}
}