package br.edu.ufab.dao.implementation;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import br.edu.ufab.dao.interfaces.IJornalDao;
import br.edu.ufab.model.acervo.Jornal;

@Repository
public class JornalDao extends GenericDaoImplementation<Jornal> implements IJornalDao {

	public boolean removeJornal(int code) {
		Query employeeTaskQuery = currentSession().createQuery("from Jornal u where :codigo");
		employeeTaskQuery.setParameter("codigo", code);
		return employeeTaskQuery.executeUpdate() > 0;
	}

	public boolean isJornalRegistered(int code) {
		Query employeeTaskQuery = currentSession()
				.createQuery("select 'A' from Jornal u where codigo=:username and codigo=:codigo");
		employeeTaskQuery.setParameter("codigo", code);

		return employeeTaskQuery.list().size() > 0;
	}

	public Jornal getJornal(int code) {
		Query query = currentSession().createQuery("from Jornal " + "where codigo=:codigo");
		query.setParameter("codigo", code);
		return (Jornal) query.uniqueResult();
	}

}
