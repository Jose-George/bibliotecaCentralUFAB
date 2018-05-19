package br.edu.ufab.service.interfaces;

import br.edu.ufab.model.Funcionario;

public interface IFuncionarioService extends IGenericService<Funcionario> {
	public boolean removeFuncionario(String cpf);
    public boolean isAFuncionarioRegistered(String cpf);
    public Funcionario getFuncionario(String cpf);
}
