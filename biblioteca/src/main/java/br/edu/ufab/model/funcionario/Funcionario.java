package br.edu.ufab.model.funcionario;

import org.apache.log4j.Logger;



/**
 * @author Jose George
 * Classe Funcionario
 * inicializa dados do funcionario por construtor
 * possui gets referentes a cada atributo
 * 
 * o usuario pode ser admin ou operador
 * o tipo do atributo 'tipo' referencia o Enum 'TipoFuncionario'
 * */

public class Funcionario {

	/**
	 * @param gerarMatricula()
	 * */
	public enum TipoFuncionario {
		ADMINISTRADOR, OPERADOR
	}
	
	private static final Logger logger = Logger.getLogger(Funcionario.class);
	
	private TipoFuncionario tipo; /*USUARIO OPERADOR OU ADMINISTRADOR*/
	private String cpf; 
	private String nomeCompleto; 
	private String rg; 
	private String naturalidade; 
	private String endereco; 
	private String telefone; 
	private String email; 
	private String nomeUsuario; 
	private String senha;
	
	public Funcionario(TipoFuncionario tipo, String cpf, String nomeCompleto, String rg, String naturalidade, String endereco,
			String telefone, String email, String nomeUsuario, String senha) {
		
		this.setTipo(tipo);
		this.setCpf(cpf);
		this.setNomeCompleto(nomeCompleto);
		this.setRg(rg);
		this.setNaturalidade(naturalidade);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
		this.setEmail(email);
		this.setNomeUsuario(nomeUsuario);
		this.setSenha(senha);
	}

	public TipoFuncionario isTipo() {
		return tipo;
	}

	public void setTipo(TipoFuncionario tipo) {
		logger.info("passando"+tipo);
		this.tipo = tipo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		logger.info("passando"+cpf);
		this.cpf = cpf;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		logger.info("passando"+nomeCompleto);
		this.nomeCompleto = nomeCompleto;
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

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		logger.info("passando"+nomeUsuario);
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		logger.info("passando"+senha);
		this.senha = senha;
	} 
	
	
	
	
}
