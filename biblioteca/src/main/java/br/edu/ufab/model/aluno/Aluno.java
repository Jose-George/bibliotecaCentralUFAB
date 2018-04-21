package br.edu.ufab.model.aluno;

import java.util.Random;

import br.edu.ufab.model.curso.Curso;
import br.edu.ufab.model.curso.Curso.CursoEnum;

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
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCurso() {
		return curso.getNome();
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

	public String getPeriodoInrgresso() {
		return periodoInrgresso;
	}

	public void setPeriodoInrgresso(String periodoInrgresso) {
		this.periodoInrgresso = periodoInrgresso;
	}

	public String gerandoMatricula() {

		String retorno; 
		
		if (curso.getTipo().equals(CursoEnum.GRADUACAO)) {
			retorno = "G"+curso.getSiglaNomeCurso()+anoIngresso+periodoInrgresso
					+numAleatorio()+numAleatorio()+numAleatorio();
			this.matricula = retorno;
			return matricula;
		}
		if (curso.getTipo().equals(CursoEnum.MESTRADO)) {
			
			retorno = "M"+curso.getSiglaNomeCurso()+anoIngresso+periodoInrgresso
					+numAleatorio()+numAleatorio()+numAleatorio();
			this.matricula = retorno;
			return matricula;
				
		}

		if (curso.getTipo().equals(CursoEnum.DOUTORADO)) {
			retorno = "D"+curso.getSiglaNomeCurso()+anoIngresso+periodoInrgresso
					+numAleatorio()+numAleatorio()+numAleatorio();
			this.matricula = retorno;
			return matricula;
		}

		if (curso.getTipo().equals(CursoEnum.ESPECIALIZACAO)) {
			retorno = "E"+curso.getSiglaNomeCurso()+anoIngresso+periodoInrgresso
					+numAleatorio()+numAleatorio()+numAleatorio();
			this.matricula = retorno;
			return matricula;
		}
		
		return "";
	}

	public int numAleatorio() {
		Random gerador = new Random();
		return gerador.nextInt(9);
	}

}
