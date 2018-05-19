package br.edu.ufab.dao.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.model.acervo.AnaisCongresso;
import br.edu.ufab.model.enumerador.AnaisEnum;

public class AnaisCongressoTest {

	private AnaisCongresso anais;
	
	@Before
	public void inicializandoTeste(){
		 anais = new AnaisCongresso(121212,AnaisEnum.ARTIGO, "CBA"
				,"Computacao parelala", "Jose ",null , "CG");
	}
	
	
	
}
