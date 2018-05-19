package br.edu.ufab.interfaces;

import java.util.ArrayList;

public interface UserDao<T> {
	public boolean create(T user); 
	public boolean remove(T user); 
	public boolean update(T user); 
	public ArrayList<T> searchAll(String id);
}
