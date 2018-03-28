package br.edu.ufab.interno;

import java.util.ArrayList;

import br.edu.ufab.acervo.ItemAcervo;

public abstract class SistemaInternoAcervo  {

	public static ArrayList<ItemAcervo> listaAcervo = new ArrayList<ItemAcervo>();

	public static void cadastrar(ItemAcervo item) {
		listaAcervo.add(item);
	}

	public static void editar(ItemAcervo item, ItemAcervo novoItem) throws Exception {
		if(listaAcervo.contains(item)){
			remover(item);
			listaAcervo.add(novoItem);
		}
	}

	public static void remover(ItemAcervo item) throws Exception {
		listaAcervo.remove(item);		
	}

}
