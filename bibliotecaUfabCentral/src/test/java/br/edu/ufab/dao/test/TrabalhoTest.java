package br.edu.ufab.dao.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.dao.acervo.TrabalhoDao;
import br.edu.ufab.model.acervo.TrabalhoDeConclusao;
import br.edu.ufab.model.enumerador.TrabalhoEnum;

public class TrabalhoTest {

	private TrabalhoDeConclusao trab;
	private TrabalhoDao tDao= new TrabalhoDao();;

	@Before
	public void inicializandoTeste(){
		trab = new TrabalhoDeConclusao(998,TrabalhoEnum.DISSERTACAO, "Scher", "internet das coisas","George", null,
				"campina gande");
	}
	
	@Test
	public void inserir(){
		assertTrue(tDao.create(trab));
	}
	
	
	@Test
	public void testEditarCadastro() {
		trab.setTitulo("O tesouro escondido");
		trab.setId(1);
		assertTrue(tDao.update(trab));
	}

	@Test
	public void excluir(){
		trab.setId(1);
		assertTrue(tDao.remove(trab));
	}
	
	
	
}
