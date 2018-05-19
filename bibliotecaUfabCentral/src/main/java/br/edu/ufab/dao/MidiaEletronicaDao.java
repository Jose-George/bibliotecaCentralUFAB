package br.edu.ufab.dao;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import br.edu.ufab.dao.interfaces.IMidiaDao;
import br.edu.ufab.model.acervo.MidiaEletronica;

@Repository
public class MidiaEletronicaDao extends GenericDaoImplementation<MidiaEletronica> implements IMidiaDao {

	public boolean removeMidia(int codigo) {
		Query employeeTaskQuery = currentSession().createQuery("from MidiaEletronica u where :codigo");
		employeeTaskQuery.setParameter("codigo", codigo);
		return employeeTaskQuery.executeUpdate() > 0;
	}

	public boolean isMidiaRegistered(int codigo) {
		Query employeeTaskQuery = currentSession()
				.createQuery("select 'A' from MidiaEletronica u where codigo=:codigo");
		employeeTaskQuery.setParameter("codigo", codigo);

		return employeeTaskQuery.list().size() > 0;
	}

	public MidiaEletronica getMidia(int codigo) {
		Query query = currentSession().createQuery("from MidiaEletronica " + "where codigo=:codigo");
		query.setParameter("codigo", codigo);
		return (MidiaEletronica) query.uniqueResult();
	}

}
