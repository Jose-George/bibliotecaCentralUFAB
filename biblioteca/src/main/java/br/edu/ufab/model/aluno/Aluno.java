package br.edu.ufab.model.aluno;

import java.util.Random;

import org.apache.log4j.Logger;

import br.edu.ufab.model.curso.Curso;
import br.edu.ufab.model.curso.Curso.CursoEnum;


/**
 * A classe Aluno é um classe que recebe vários dados de um aluno e gera uma matricula
 * @author	José George
 * */


public class Aluno {

	private String nome;
	private String nomeMae;
	private String matricula;
	private String cpf;
	private String rg;
	private String naturalidade;
	private String endereco;
	private String telefone;
	private String email;
	private String senha;
	private Curso curso;
	private int anoIngresso;
	private String periodoInrgresso;
	
	private static final Logger logger = Logger.getLogger(Aluno.class);

	public Aluno(String nome, String nomeMae, String cpf, String rg, String naturalidade, String endereco,
			String telefone, String email, String senha, Curso curso, int anoIngresso, String periodoInrgresso) {
		super();
		this.nome = nome;
		this.nomeMae = nomeMae;
		this.cpf = cpf;
		this.rg = rg;
		this.naturalidade = naturalidade;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
		this.curso = curso;
		this.anoIngresso = anoIngresso;
		this.periodoInrgresso = periodoInrgresso;
		gerandoMatricula();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		logger.info("passando"+nome);
		this.nome = nome;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		logger.info("passando"+nomeMae);
		this.nomeMae = nomeMae;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		logger.info("passando"+matricula);
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		logger.info("passando"+cpf);
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		logger.info("passando"+rg);
		this.rg = rg;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		logger.info("passando"+naturalidade);
		this.naturalidade = naturalidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		logger.info("passando"+endereco);
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		logger.info("passando"+telefone);
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		logger.info("passando"+email);
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		logger.info("passando"+senha);
		this.senha = senha;
	}

	public String getCurso() {
		return curso.getNome();
	}

	public void setCurso(Curso curso) {
		logger.info("passando"+curso);
		this.curso = curso;
	}

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		logger.info("passando"+anoIngresso);
		this.anoIngresso = anoIngresso;
	}

	public String getPeriodoInrgresso() {
		return periodoInrgresso;
	}

	public void setPeriodoInrgresso(String periodoInrgresso) {
		logger.info("passando"+periodoInrgresso);
		this.periodoInrgresso = periodoInrgresso;
	}

	/*gerar uma matricula para o aluno baseado no curso, no ano que ele inicou, no periodo e no tipo de curso
	que ele faz*/
	public String gerandoMatricula() {
		logger.info("gerando matricula");
		String retorno; 
		
		if (curso.getTipo().equals(CursoEnum.GRADUACAO)) {
			retorno = "G"+curso.getSiglaNomeCurso()+anoIngresso+periodoInrgresso
					+numAleatorio()+numAleatorio()+numAleatorio();
			this.matricula = retorno;
			logger.info("matricula gerada = "+retorno);
			
		}
		if (curso.getTipo().equals(CursoEnum.MESTRADO)) {
			
			retorno = "M"+curso.getSiglaNomeCurso()+anoIngresso+periodoInrgresso
					+numAleatorio()+numAleatorio()+numAleatorio();
			this.matricula = retorno;
			logger.info("matricula gerada = "+retorno);
			
				
		}

		if (curso.getTipo().equals(CursoEnum.DOUTORADO)) {
			retorno = "D"+curso.getSiglaNomeCurso()+anoIngresso+periodoInrgresso
					+numAleatorio()+numAleatorio()+numAleatorio();
			this.matricula = retorno;
			logger.info("matricula gerada = "+retorno);
			
		}

		if (curso.getTipo().equals(CursoEnum.ESPECIALIZACAO)) {
			retorno = "E"+curso.getSiglaNomeCurso()+anoIngresso+periodoInrgresso
					+numAleatorio()+numAleatorio()+numAleatorio();
			this.matricula = retorno;
			logger.info("matricula gerada = "+retorno);
			
		}
		
		return matricula;
	}

	public int numAleatorio() {
		Random gerador = new Random();
		return gerador.nextInt(9);
	}

}
