package br.edu.ufab.service;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import br.edu.ufab.dao.interfaces.IFuncionarioDao;
import br.edu.ufab.dao.interfaces.IGenericDao;

import br.edu.ufab.model.Funcionario;
import br.edu.ufab.service.interfaces.IFuncionarioService;

/**
 * CRUD de Funcionarios
 *
 * @author Caio Silva e Jose George
 * @version 1.0
 * @since 2018-05-15
 */

@Service
public class FuncionarioService extends GenericServiceImplementation<Funcionario> implements IFuncionarioService {

	private static final Logger logger = LogManager.getLogger(FuncionarioService.class);

	private IFuncionarioDao funcionarioDao;

	public FuncionarioService(){	

	}

	@Autowired
	public FuncionarioService(		
        @Qualifier("funcionarioDao") IGenericDao<Funcionario> genericDao) {
		super(genericDao);
		this.funcionarioDao = (IFuncionarioDao) genericDao;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public boolean removeFuncionario(String cpf) {
		return funcionarioDao.removeFunc(cpf);
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public boolean isAFuncionarioRegistered(String cpf) {
		return funcionarioDao.isFuncRegistered(cpf);
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public Funcionario getFuncionario(String matricula) {
		return funcionarioDao.getFunc(matricula);
	}




}
