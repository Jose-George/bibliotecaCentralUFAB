
package br.edu.ufab.interno.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufab.dao.curso.CursoDAO;
import br.edu.ufab.model.curso.Curso;
import br.edu.ufab.model.curso.Curso.CursoEnum;
import br.edu.ufab.model.funcionario.Funcionario;
import br.edu.ufab.model.funcionario.Funcionario.TipoFuncionario;
import br.edu.ufab.model.interno.SistemaInternoDeCurso;

/*Essa classe CursoTest realiza teste para verificar se os dados do curso estão 
 * sendo corretamente salvos, como também atualizados e excluidos da base de dados
 * @author	José George	 
 * */

public class CursoTest {

	Funcionario func;
	Curso curso;
	CursoDAO cursoDao;
	SistemaInternoDeCurso sisCurso;
	
	/*Inicializando o teste
	 * Aqui é criado objetos do tipo, cursoDAO, curso, Funcionario e SistemaInternoDeAcervo,
	 * pois todos participam do cadastro de um curso na base de dados.	
	*/
	@Before
	public void inicializarTest() {
		
		func = new Funcionario(TipoFuncionario.ADMINISTRADOR, "1001", "Jose George", "1232", "Cajazeiras",
				"Aprigio Veloso", "99913413", "george.djc@gmail.com", "j.george", "123george");
		curso = new Curso("Psicologia", "Saúde","PI", CursoEnum.GRADUACAO);
		sisCurso = new SistemaInternoDeCurso(func);
		cursoDao = new CursoDAO();
	}

	/*Cadastrar um Curso
	 * @return false, o curso não foi salvo na base
	 * @return true, aluno salvo devidamente na base
	 */
	@Test
	public void testAdicionarCurso() {
		curso.setNome("Psicologia");
		assertTrue(sisCurso.cadastrar(cursoDao, curso));	
	}
	
	/*Editar um Curso
	 * @return false, o curso não foi salvo na base
	 * @return true, aluno salvo devidamente na base
	 */
	@Test
	public void testEditarCurso() {
		curso.setArea("humana/saúde");
		curso.setTipo(Curso.CursoEnum.GRADUACAO);
		curso.setNome("Psicologia");
		assertTrue(sisCurso.editar(cursoDao, curso));	
	}

	/*Remover um Curso
	 * @return false, o curso não foi salvo na base
	 * @return true, aluno salvo devidamente na base
	 */
	@Test
	public void testRemoverCurso() {
		curso.setNome("Psicologia");
		assertTrue(sisCurso.remover(cursoDao, curso));	
	}
	
	
}
