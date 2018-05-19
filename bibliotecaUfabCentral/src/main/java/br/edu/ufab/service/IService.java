package br.edu.ufab.service;

import java.util.List;

import br.edu.ufab.service.exception.DuplicateItemException;


public interface IService <T> {
	public List<T> listAllRegisters();
	public boolean addRegister(T registro);
	public void updateRegister(T registro);
	public T getRegisterById(int id);
	public void removeRegister(int id);
}