package br.edu.ufab.service;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import br.edu.ufab.dao.FuncionarioDao;
import br.edu.ufab.model.Funcionario;

/**
* CRUD de Funcionarios
*
* @author  Caio Silva e Jose George
* @version 1.0
* @since   2018-05-15
*/

@Transactional
@Service
@Configuration
public class FuncionarioService implements IService<Funcionario> {

private static final Logger logger = LogManager.getLogger(FuncionarioService.class);
	
	@Autowired
	private FuncionarioDao funcionario;
	
	public void setCursoDao(FuncionarioDao funcionario) {
		this.funcionario= funcionario;
	}
	
	public List<Funcionario> listAllRegisters() {
		logger.info("listando cursos");
		return funcionario.listAllRegisters();
	}

	public boolean addRegister(Funcionario funcionario) {
		logger.info("inserindo"+funcionario);
		this.funcionario.addRegister(funcionario);
		return true;
	}

	public void updateRegister(Funcionario funcionario) {
		logger.info("update em"+funcionario);
		this.funcionario.addRegister(funcionario);		
	}

	public Funcionario getRegisterById(int id) {
		logger.info("obtendo Curso apartir do registro"+id);
		return this.funcionario.getRegisterById(id);		
	}

	public void removeRegister(int id) {
		logger.info("removendo curso de id "+id);
		this.funcionario.removeRegister(id);
		
	}

}
