package br.edu.ufab.model.interno;

//import java.util.ArrayList;

import br.edu.ufab.dao.acervo.ItemDAO;
import br.edu.ufab.model.acervo.ItemDeAcervo;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;

public class SistemaInternoDeAcervo {
	
	private Funcionario func;
	
	// só o ADM pode excluir curso
	public SistemaInternoDeAcervo(Funcionario funcionario){
		this.func = funcionario;
	}
	
	public boolean cadastrar(ItemDAO itemDao, ItemDeAcervo itemAcervo){
			return itemDao.insertion(itemAcervo);
	}
	
	public boolean editar(ItemDAO itemDao, ItemDeAcervo itemAcervo){
		return itemDao.update(itemAcervo);
	}
	
	public boolean remover(ItemDAO itemDao, ItemDeAcervo itemAcervo){
		if(func.isTipo().equals(TipoFuncionario.ADMINISTRADOR)){
			return itemDao.remove(itemAcervo);
		}
		return false;
	}
	
}
