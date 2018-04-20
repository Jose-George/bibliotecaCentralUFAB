package br.edu.ufab.model.interno;

//import java.util.ArrayList;

import br.edu.ufab.dao.acervo.ItemDAO;
import br.edu.ufab.model.acervo.ItemDeAcervo;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;

public class SistemaInternoDeAcervo {
	
	// só o usuário pode ter acesso a essa classe
	public SistemaInternoDeAcervo(Funcionario funcionario){
		if(funcionario.isTipo() != TipoFuncionario.ADMINISTRADOR){
			throw new IllegalArgumentException();
		}
	}
	
	/*
	public static ArrayList<ItemDeAcervo> listaAcervo = new ArrayList<ItemDeAcervo>();
	
	public static void cadastrar(ItemDeAcervo item) { //adiciona item do acervo a lista
		
		
		listaAcervo.add(item);
	}
	
	public static void editar(ItemDeAcervo itemAntigo, ItemDeAcervo novoItem) throws Exception {
		int indexItemAntigo = listaAcervo.indexOf(itemAntigo);
		if(listaAcervo.contains(itemAntigo)){
			listaAcervo.set(indexItemAntigo, novoItem);
		}
	}
	
	public static void remover(ItemDeAcervo item, Funcionario funcionario) throws Exception {
		if (funcionario.isTipo() == TipoFuncionario.ADMINISTRADOR)
			listaAcervo.remove(item);
	}
	*/
	
	// as operações são realizadas direto no banco de dados
	public static boolean cadastrar(ItemDAO<ItemDeAcervo> itemDao, Object itemAcervo){
			return itemDao.insertion((ItemDeAcervo) itemAcervo);
	}
	
	public static boolean editar(ItemDAO<ItemDeAcervo> itemDao, Object itemAcervo){
		return itemDao.update((ItemDeAcervo) itemAcervo);
	}
	
	public static boolean remover(ItemDAO<ItemDeAcervo> itemDao, Object itemAcervo){
		return itemDao.remove((ItemDeAcervo) itemAcervo);
	}
	
}
