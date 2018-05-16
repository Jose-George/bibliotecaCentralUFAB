package br.edu.ufab.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import br.edu.ufab.model.Aluno;


@Repository

/**
* Classe que faz operacoes diretamente na Tabela Aluno
* @author Caio Silva e Jose George
* @version 1.0
* @since   2018-05-13
*/
public class AlunoDao implements IDao<Aluno> {
	
	private HibernateTemplate hibernateTemplate;
	
	/**
	* Lista todos objetos da tabela Aluno
	* @return List<Object>
	*/
	@SuppressWarnings("unchecked")
	public List<Aluno> listAllRegisters() {
		return (List<Aluno>) hibernateTemplate.find("FROM Aluno as aluno ORDER BY aluno.id");
	}

	public void addRegister(Aluno aluno) {		
		hibernateTemplate.save(aluno);
	}
	
	public void removeRegister(int id) {
		hibernateTemplate.delete(getRegisterById(id));
	}

	public void updateRegister(Aluno aluno) {		
		hibernateTemplate.update(aluno);
	}

	public Aluno getRegisterById(int id) {
		return hibernateTemplate.get(Aluno.class, id);
	}




}
