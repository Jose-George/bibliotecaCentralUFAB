package br.edu.ufab.dao.implementation;


import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import br.edu.ufab.dao.interfaces.IAlunoDao;
import br.edu.ufab.model.Aluno;

@Repository

/**
 * Classe que faz operacoes diretamente na Tabela Aluno
 * 
 * @author Caio Silva e Jose George
 * @version 1.0
 * @since 2018-05-13
 */
public class AlunoDao extends GenericDaoImplementation<Aluno> implements IAlunoDao {

	public boolean removeAluno(String matricula) {
		Query employeeTaskQuery = currentSession().createQuery("from Aluno u where : matricula");
		employeeTaskQuery.setParameter("matricula", matricula);
		return employeeTaskQuery.executeUpdate() > 0;
	}

	public boolean isAlunoRegistered(String matricula) {
		Query employeeTaskQuery = currentSession().createQuery(
                "select 'A' from Aluno u where matricula=:matricula");
        employeeTaskQuery.setParameter("matricula", matricula);
        return employeeTaskQuery.list().size() > 0;
	}

	public Aluno getAluno(String matricula) {
		Query query = currentSession().createQuery(
                "from Admin " +
                        "where matricula=:matricula");
        query.setParameter("matricula", matricula);
        return (Aluno) query.uniqueResult();
	}

}
