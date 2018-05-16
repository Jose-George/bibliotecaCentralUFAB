package br.edu.ufab.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import br.edu.ufab.model.Funcionario;

/**
* Classe que faz operacoes diretamente na Tabela Funcionario
* @author Caio Silva e Jose George
* @version 1.0
* @since   2018-05-13
*/
public class FuncionarioDao implements IDao<Funcionario> {
	private HibernateTemplate hibernateTemplate;
	
	/**
	* Lista todos registros da tabela Funcionario
	* @return List<Object>
	*/
	public List<Funcionario> listAllRegisters() {
		return (List<Funcionario>) hibernateTemplate.find("FROM Funcionario as funcionario ORDER BY funcionario.Cpf");
	}

	public void addRegister(Funcionario funcionario) {
		hibernateTemplate.save(funcionario);
		
	}

	public void updateRegister(Funcionario funcionario) {
		hibernateTemplate.update(funcionario);
		
	}

	public Funcionario getRegisterById(int id) {
		return hibernateTemplate.get(Funcionario.class, id);
	}

	public void removeRegister(int id) {
		hibernateTemplate.delete(getRegisterById(id));
		
	}
}
