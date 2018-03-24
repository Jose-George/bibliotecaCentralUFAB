package br.edu.ufab.funcionario;

public class Funcionario {

	private boolean tipo; /*USUÁRIO OPERADOR OU ADMINISTRADOR*/
	private String cpf; 
	private String nomeCompleto; 
	private String rg; 
	private String naturalidade; 
	private String endereco; 
	private String telefone; 
	private String email; 
	private String nomeUsuario; 
	private String senha;
	
	public Funcionario(boolean tipo, String cpf, String nomeCompleto, String rg, String naturalidade, String endereco,
			String telefone, String email, String nomeUsuario, String senha) {
		this.tipo = tipo;
		this.cpf = cpf;
		this.nomeCompleto = nomeCompleto;
		this.rg = rg;
		this.naturalidade = naturalidade;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
	}

	public boolean isTipo() {
		return tipo;
	}

	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
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

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	} 
	
	
	
	
}
