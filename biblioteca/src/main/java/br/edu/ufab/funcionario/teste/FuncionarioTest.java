package br.edu.ufab.funcionario.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.TipoFuncionario;

public class FuncionarioTest {

	Funcionario funcionario; 
	
	@Before
	public void inicializando(){
		funcionario = new Funcionario(TipoFuncionario.ADMINISTRADOR, "101.239.213-92", "Jose George", "392.123-13",
				"Cajazeirense", "Rua aprigio Veloso", "9 9136-4561", "george.djc@gmail.com", "jgdias", "12345");
	}
	
	@Test
	public void VerificaSeFuncionarioADMtest() {
			assertTrue(funcionario.isTipo() == TipoFuncionario.ADMINISTRADOR);
	}
	
	

}
