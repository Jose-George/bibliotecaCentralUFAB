package br.edu.ufab.model.interno;

//import java.util.ArrayList;

import br.edu.ufab.dao.acervo.ItemDAO;
import br.edu.ufab.model.acervo.ItemDeAcervo;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;

public class SistemaInternoDeAcervo {
	
	// só o ADM pode ter acesso a essa classe
	public SistemaInternoDeAcervo(Funcionario funcionario){
		if(funcionario.isTipo().equals(TipoFuncionario.OPERADOR)){
			throw new IllegalArgumentException();
		}
	}
	
	public boolean cadastrar(ItemDAO itemDao, ItemDeAcervo itemAcervo){
			return itemDao.insertion(itemAcervo);
	}
	
	public boolean editar(ItemDAO itemDao, ItemDeAcervo itemAcervo){
		return itemDao.update((ItemDeAcervo) itemAcervo);
	}
	
	public boolean remover(ItemDAO itemDao, ItemDeAcervo itemAcervo){
		return itemDao.remove((ItemDeAcervo) itemAcervo);
	}
	
}
