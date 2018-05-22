package br.edu.ufab.model;



import org.apache.log4j.Logger;


/**
 * A classe Aluno consiste em um Java Bean com anotacoes JPA
 * 
 * @author Jose George e Caio Silva
 */

public class Aluno {

	private int id;
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
	private String periodoIngresso;

	private static final Logger logger = Logger.getLogger(Aluno.class);

	public Aluno() {

	}

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
		this.periodoIngresso = periodoInrgresso;

	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		logger.info("setando campo nome, passando" + nome);
		this.nome = nome;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		logger.info("setando nomeMae, passando" + nomeMae);
		this.nomeMae = nomeMae;
	}

	// public void setMatricula(String matricula) {
	// logger.info("setando matrícula, passando"+matricula);
	// this.matricula = matricula;
	// }

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		logger.info("setando CPF, passando" + cpf);
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		logger.info("setando RG, passando" + rg);
		this.rg = rg;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		logger.info("setando naturalidade, passando" + naturalidade);
		this.naturalidade = naturalidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		logger.info("setando endereco, passando" + endereco);
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		logger.info("setando telefone, passando" + telefone);
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		logger.info("setando email, passando" + email);
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		logger.info("setando senha, passando" + senha);
		this.senha = senha;
	}

	public String getCurso() {
		return curso.getNome();
	}
	
	public String cursoVerificacao() {
		return curso.getSiglaNomeCurso();
	}

	public void setCurso(Curso curso) {
		logger.info("setando Curso, passando" + curso);
		this.curso = curso;
	}

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		logger.info("sentando campo AnoIgresso, passando" + anoIngresso);
		this.anoIngresso = anoIngresso;
	}

	public String getPeriodoInrgresso() {
		return periodoIngresso;
	}

	public void setPeriodoInrgresso(String periodoInrgresso) {
		logger.info("setando campo período, passando" + periodoInrgresso);
		this.periodoIngresso = periodoInrgresso;
	}

	public String getMatricula() {
		return matricula;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
