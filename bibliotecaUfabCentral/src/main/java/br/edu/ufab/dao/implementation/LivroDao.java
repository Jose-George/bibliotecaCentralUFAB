package br.edu.ufab.dao.implementation;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import br.edu.ufab.dao.interfaces.ILivroDao;
import br.edu.ufab.model.acervo.Livro;

@Repository
public class LivroDao extends GenericDaoImplementation<Livro> implements ILivroDao {

	public boolean removeLivro(int id) {
		Query employeeTaskQuery = currentSession().createQuery("from Livro u where :codigo");
		employeeTaskQuery.setParameter("codigo", id);
		return employeeTaskQuery.executeUpdate() > 0;
	}

	public boolean isLivroRegistered(int id) {
		Query employeeTaskQuery = currentSession()
				.createQuery("select 'A' from Livro u where codigo=:codigo");
		employeeTaskQuery.setParameter("codigo", id);
		return employeeTaskQuery.list().size() > 0;
	}

	public Livro getLivro(int id) {
		Query query = currentSession().createQuery("from Livro " + "where codigo=:codigo");
		query.setParameter("codigo", id);
		return (Livro) query.uniqueResult();

	}

}
