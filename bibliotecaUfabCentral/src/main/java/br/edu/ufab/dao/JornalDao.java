package br.edu.ufab.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import br.edu.ufab.model.acervo.Jornal;


public class JornalDao implements IDao<Jornal> {
	
	private HibernateTemplate hibernateTemplate;

	/**
	* Lista todos objetos da tabela Jornal
	* @return List<Jornal>
	*/
	@SuppressWarnings("unchecked")
	public List<Jornal> listAllRegisters() {
		return (List<Jornal>) hibernateTemplate.find("FROM Jornal as jornal ORDER BY jornal.id");
	}
	/**
	* insere Jornal na tabela 
	* @return void
	*/
	public void addRegister(Jornal jornal) {		
		hibernateTemplate.save(jornal);
	}
	
	/**
	* remove instancia de Jornal pelo id
	* @return void
	*/
	public void removeRegister(int id) {
		hibernateTemplate.delete(getRegisterById(id));
	}
	
	/**
	* Update no Jornal
	* @return void
	*/
	public void updateRegister(Jornal jornal) {		
		hibernateTemplate.update(jornal);
	}
	
	/**
	* Lista registro pelo id
	* @return retorna um Jornal
	*/
	public Jornal getRegisterById(int id) {
		return hibernateTemplate.get(Jornal.class, id);
	}
}
