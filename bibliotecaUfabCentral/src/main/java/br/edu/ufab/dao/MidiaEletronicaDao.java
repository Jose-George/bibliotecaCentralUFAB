package br.edu.ufab.dao;

import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;
import br.edu.ufab.model.acervo.MidiaEletronica;

public class MidiaEletronicaDao implements IDao<MidiaEletronica> {
	private HibernateTemplate hibernateTemplate;

	/**
	* Lista todos objetos da tabela MidiaEletronica
	* @return List<Jornal>
	*/
	@SuppressWarnings("unchecked")
	public List<MidiaEletronica> listAllRegisters() {
		return (List<MidiaEletronica>) hibernateTemplate.find("FROM Midia as midia ORDER BY midia.id");
	}
	/**
	* insere MidiaEletronica na tabela 
	* @return void
	*/
	public void addRegister(MidiaEletronica midia) {		
		hibernateTemplate.save(midia);
	}
	
	/**
	* remove instancia de MidiaEletronica pelo id
	* @return void
	*/
	public void removeRegister(int id) {
		hibernateTemplate.delete(getRegisterById(id));
	}
	
	/**
	* Update no MidiaEletronica
	* @return void
	*/
	public void updateRegister(MidiaEletronica midia) {		
		hibernateTemplate.update(midia);
	}
	
	/**
	* Lista registro pelo id
	* @return retorna um MidiaEletronica
	*/
	public MidiaEletronica getRegisterById(int id) {
		return hibernateTemplate.get(MidiaEletronica.class, id);
	}
	
}
