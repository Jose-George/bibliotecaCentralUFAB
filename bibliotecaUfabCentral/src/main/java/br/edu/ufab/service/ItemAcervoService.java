package br.edu.ufab.service;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import br.edu.ufab.dao.IDao;
import br.edu.ufab.model.acervo.ItemDeAcervo;

/**
* CRUD de itens de acervo
*
* @author  Caio Silva e Jose George
* @version 1.0
* @since   2018-05-15
*/

@Transactional
@Service
@Configuration
public class ItemAcervoService implements IService<ItemDeAcervo> {
	
	private static final Logger logger = LogManager.getLogger(ItemAcervoService.class);
	
	@Autowired
	private IDao<ItemDeAcervo> item;
	
	public void setCursoDao(IDao<ItemDeAcervo> item) {
		this.item= item;
	}
	
	public List<ItemDeAcervo> listAllRegisters() {
		logger.info("listando Itens de Acervo");
		return item.listAllRegisters();
	}

	public boolean addRegister(ItemDeAcervo item) {
		logger.info("inserindo"+item);
		this.item.addRegister(item);	
		return true;
	}

	public void updateRegister(ItemDeAcervo item) {
		logger.info("update em"+item);
		this.item.addRegister(item);		
	}

	public ItemDeAcervo getRegisterById(int id) {
		logger.info("obtendo Curso apartir do registro"+id);
		return this.item.getRegisterById(id);		
	}

	public void removeRegister(int id) {
		logger.info("removendo curso de id "+id);
		this.item.removeRegister(id);
		
	}

}
