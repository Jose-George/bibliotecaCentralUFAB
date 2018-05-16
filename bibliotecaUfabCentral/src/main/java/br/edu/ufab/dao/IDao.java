package br.edu.ufab.dao;

import java.util.List;

public interface IDao <T> {
	public List<T> listAllRegisters();
	public void addRegister(T registro);
	public void updateRegister(T registro);
	public T getRegisterById(int id);
	public void removeRegister(int id);
}
