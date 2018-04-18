package br.edu.ufab.model.interno;

import java.util.ArrayList;

import br.edu.ufab.model.acervo.ItemDeAcervo;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.TipoFuncionario;

public abstract class SistemaInternoAcervo  {
	/*atributo auxiliar no CRUD de itens do acervo, enquanto nao eh implementada uma base de dados*/
	public static ArrayList<ItemDeAcervo> listaAcervo = new ArrayList<ItemDeAcervo>();
	
	/*
	 * @author Jose George
	 * adiciona item ao acervo
	 * @param ItemAcervo item
	 * */
	public static void cadastrar(ItemDeAcervo item) { //adiciona item do acervo a lista
		listaAcervo.add(item);
	}
	
	/*
	 * @author Caio
	 * edita item
	 * @param ItemAcervo itemAntigo
	 * @param ItemaAcervo novoItem
	 * */
	public static void editar(ItemDeAcervo itemAntigo, ItemDeAcervo novoItem) throws Exception {
		int indexItemAntigo = listaAcervo.indexOf(itemAntigo);
		if(listaAcervo.contains(itemAntigo)){
			listaAcervo.set(indexItemAntigo, novoItem);
		}
	}
	
	/*
	 * @author Caio
	 * remove item do acervo
	 * @param ItemAcervo item
	 * @param Funcionario funcionario
	 * */
	public static void remover(ItemDeAcervo item, Funcionario funcionario) throws Exception {
		if (funcionario.isTipo() == TipoFuncionario.ADMINISTRADOR)
			listaAcervo.remove(item);
	}

}
