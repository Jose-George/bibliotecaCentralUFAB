package br.edu.ufab.dao.interfaces;

import br.edu.ufab.model.Funcionario;

public interface IFuncionarioDao extends IGenericDao<Funcionario> {
	public boolean removeFunc(String cpf);
    public boolean isFuncRegistered(String cpf);
    public Funcionario getFunc(String cpf);
}
