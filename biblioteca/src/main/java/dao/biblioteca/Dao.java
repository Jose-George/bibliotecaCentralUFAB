package dao.biblioteca;

import exception.ExceptionDao;

public interface Dao {

	public void insert(Object dao)  throws ExceptionDao;
	public void uptade(Object dao)  throws ExceptionDao;
	public void delete(Object dao)  throws ExceptionDao;
	
}
