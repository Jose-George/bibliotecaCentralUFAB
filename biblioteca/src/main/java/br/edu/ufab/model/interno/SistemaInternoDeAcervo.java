package br.edu.ufab.model.interno;

/*Essa Classe é responsável por controlar todo o sistema de acervo, ela tem três metódos
 * que fazem chamadas ao ItemDao e ItemDeAcervo
 * 
 * @author José George
 * */

import br.edu.ufab.dao.acervo.ItemDAO;
import br.edu.ufab.model.acervo.ItemDeAcervo;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;

public class SistemaInternoDeAcervo {
	
	private Funcionario func;
	
	
	/*
	 * @param cadastrarItemDeAcervo()
	 * @param editarItemDeAcervo()
	 * @param excluirItemDeAcervo()
	 * */
	
	
	/* só o ADM pode excluir curso, sendo assim se faz necessário informar o funcionario
	   que irá instaciar a classe
	 */
	public SistemaInternoDeAcervo(Funcionario funcionario){
		this.func = funcionario;
	}
	
	/*Metodo de cadastro, recebe por parametro um tipo de ItemDao(usamos polimorfismo), esse tipo
	 * é generico  se estende para todo o acervoDAO .
	 * Também é usado um itemDeAcervo, que pode ser qualquer classe que estende ItemDeAcervo
	 * 
	 * @return false, se o cadastro não for possível
	 * @return true, caso o cadastro seja efetuado
	 * */
	public boolean cadastrar(ItemDAO itemDao, ItemDeAcervo itemAcervo){
			return itemDao.insertion(itemAcervo);
	}
	
	 /* @return false, se o cadastro não for possível
			 * @return true, caso o cadastro seja efetuado
	 * */
	public boolean editar(ItemDAO itemDao, ItemDeAcervo itemAcervo){
		return itemDao.update(itemAcervo);
	}
	
	/*Caso o funcionario que esteja tendo excluir um itemDeAcervo não seja adminstrador
	 * @return false, será retornado um false
	 * @return true, o funcionario Administrador tem direito de excluir, qualquer item do acervo
	 * */
	public boolean remover(ItemDAO itemDao, ItemDeAcervo itemAcervo){
		if(func.isTipo().equals(TipoFuncionario.ADMINISTRADOR)){
			return itemDao.remove(itemAcervo);
		}
		return false;
	}
	
}
