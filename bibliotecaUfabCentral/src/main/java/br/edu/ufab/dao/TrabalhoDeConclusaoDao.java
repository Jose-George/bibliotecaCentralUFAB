package br.edu.ufab.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import br.edu.ufab.model.acervo.TrabalhoDeConclusao;

public class TrabalhoDeConclusaoDao implements IDao<TrabalhoDeConclusao> {
	
	private HibernateTemplate hibernateTemplate;

	/**
	* Lista todos objetos da tabela Trabalho
	* @return List<Jornal>
	*/
	@SuppressWarnings("unchecked")
	public List<TrabalhoDeConclusao> listAllRegisters() {
		return (List<TrabalhoDeConclusao>) hibernateTemplate.find("FROM Trabalho as trabalho "
				+ "ORDER BY trabalho.id");
	}
	/**
	* insere TrabalhoDeConclusao na tabela 
	* @return void
	*/
	public void addRegister(TrabalhoDeConclusao trabalho) {		
		hibernateTemplate.save(trabalho);
	}
	
	/**
	* remove instancia de TrabalhoDeConclusao pelo id
	* @return void
	*/
	public void removeRegister(int id) {
		hibernateTemplate.delete(getRegisterById(id));
	}
	
	/**
	* Update no TrabalhoDeConclusao
	* @return void
	*/
	public void updateRegister(TrabalhoDeConclusao trab) {		
		hibernateTemplate.update(trab);
	}
	
	/**
	* Lista registro pelo id
	* @return retorna um TrabalhoDeConclusao
	*/
	public TrabalhoDeConclusao getRegisterById(int id) {
		return hibernateTemplate.get(TrabalhoDeConclusao.class, id);
	}
}
