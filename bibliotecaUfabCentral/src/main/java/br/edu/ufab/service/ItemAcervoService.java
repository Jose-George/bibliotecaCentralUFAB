package br.edu.ufab.service;

import java.util.List;



import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vladium.emma.report.ItemComparator;

import br.edu.ufab.dao.interfaces.IFuncionarioDao;
import br.edu.ufab.dao.interfaces.IGenericDao;
import br.edu.ufab.dao.interfaces.IItemDao;
import br.edu.ufab.model.Funcionario;
import br.edu.ufab.model.acervo.ItemDeAcervo;
import br.edu.ufab.service.interfaces.IItemAcervoService;

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
public class ItemAcervoService extends GenericServiceImplementation<ItemDeAcervo> implements IItemAcervoService {
	
	private static final Logger logger = LogManager.getLogger(ItemAcervoService.class);
	
	private IItemDao itemDao;

	public ItemAcervoService(){	

	}

	@Autowired
	public ItemAcervoService(		
        @Qualifier("itemDao") IGenericDao<ItemDeAcervo> genericDao) {
		super(genericDao);
		this.itemDao = (IItemDao) genericDao;
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public boolean removeItem(int codigo) {
		 return itemDao.removeItem(codigo);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public boolean isItemRegistered(int codigo) {
		return itemDao.isItemRegistered(codigo);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public ItemDeAcervo getItem(int codigo) {
		 return itemDao.getItem(codigo);
	}


	
	

}
