package br.edu.ufab.dao;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import br.edu.ufab.dao.interfaces.ICursoDao;

import br.edu.ufab.model.Curso;

/**
 * Classe que faz operacoes diretamente na Tabela Curso
 * 
 * @author Caio Silva e Jose George
 */

@Repository
public class CursoDao extends GenericDaoImplementation<Curso> implements ICursoDao {

	public boolean removeCurso(String nome) {
		Query employeeTaskQuery = currentSession().createQuery("from Curso u where :nome");
		employeeTaskQuery.setParameter("nome", nome);
		return employeeTaskQuery.executeUpdate() > 0;
	}

	public boolean isCursoRegistered(String nome) {
		Query employeeTaskQuery = currentSession().createQuery("select 'A' from Curso u where nome=:nome");
		employeeTaskQuery.setParameter("nome", nome);
		return employeeTaskQuery.list().size() > 0;
	}

	public Curso getCurso(String nome) {
		Query query = currentSession().createQuery("from Curso" + "where nome=:nome");
		query.setParameter("nome", nome);
		return (Curso) query.uniqueResult();
	}

}
