package br.edu.ufab.dao;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import br.edu.ufab.dao.interfaces.IFuncionarioDao;
import br.edu.ufab.model.Funcionario;

/**
 * Classe que faz operacoes diretamente na Tabela Funcionario
 * 
 * @author Caio Silva e Jose George
 * @version 1.0
 * @since 2018-05-13
 */
@Repository
public class FuncionarioDao extends GenericDaoImplementation<Funcionario> implements IFuncionarioDao {

	public boolean removeFunc(String cpf) {
		Query employeeTaskQuery = currentSession().createQuery("from Funcionario u where :cpf");
		employeeTaskQuery.setParameter("cpf", cpf);
		return employeeTaskQuery.executeUpdate() > 0;
	}

	public boolean isFuncRegistered(String cpf) {
		Query employeeTaskQuery = currentSession().createQuery("select 'A' from Curso u where cpf=:cpf");
		employeeTaskQuery.setParameter("username", cpf);

		return employeeTaskQuery.list().size() > 0;
	}

	public Funcionario getFunc(String cpf) {
		Query query = currentSession().createQuery("from Funcionario" + "where cpf=:cpf");
		query.setParameter("cpf", cpf);
		return (Funcionario) query.uniqueResult();
	}

}
