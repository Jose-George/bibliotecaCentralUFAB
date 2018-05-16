package br.edu.ufab.model;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.apache.log4j.Logger;

import br.edu.ufab.model.enumerador.CursoEnum;

/**
 * A classe Aluno consiste em um Java Bean com anotacoes JPA
 * @author	Jose George e Caio Silva
 * */
@Entity
public class Aluno {
	
	private String nome;
	
	@Column(name = "Mae")
	private String nomeMae;
	
	@Id
	private String matricula;
	
	@Column(unique = true)
	private String cpf;
	
	@Column(unique = true)
	private String rg;
	
	private String naturalidade;
	private String endereco;
	private String telefone;
	
	@Column(unique = true)
	private String email;
	
	private String senha;
	
	@ManyToOne
    @JoinColumn(name = "Curso")
	private Curso curso;
	
	private int anoIngresso;
	private String periodoIngresso;
	
	private static final Logger logger = Logger.getLogger(Aluno.class);

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		logger.info("setando campo nome, passando"+nome);
		this.nome = nome;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		logger.info("setando nomeMae, passando"+nomeMae);
		this.nomeMae = nomeMae;
	}


//	public void setMatricula(String matricula) {
//		logger.info("setando matrícula, passando"+matricula);
//		this.matricula = matricula;
//	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		logger.info("setando CPF, passando"+cpf);
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		logger.info("setando RG, passando"+rg);
		this.rg = rg;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		logger.info("setando naturalidade, passando"+naturalidade);
		this.naturalidade = naturalidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		logger.info("setando endereco, passando"+endereco);
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		logger.info("setando telefone, passando"+telefone);
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		logger.info("setando email, passando"+email);
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		logger.info("setando senha, passando"+senha);
		this.senha = senha;
	}

	public String getCurso() {
		return curso.getNome();
	}

	public void setCurso(Curso curso) {
		logger.info("setando Curso, passando"+curso);
		this.curso = curso;
	}

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		logger.info("sentando campo AnoIgresso, passando"+anoIngresso);
		this.anoIngresso = anoIngresso;
	}

	public String getPeriodoInrgresso() {
		return periodoIngresso;
	}

	public void setPeriodoInrgresso(String periodoInrgresso) {
		logger.info("setando campo período, passando"+periodoInrgresso);
		this.periodoIngresso = periodoInrgresso;
	}

	public String getMatricula() {
		return matricula;
	}
	
	/*gerar uma matricula para o aluno baseado no curso, no ano que ele inicou, no periodo e no tipo de curso
	que ele faz*/
	public void setMatricula() {
		logger.info("gerando matricula");
		String retorno; 
		
		if (curso.getTipo().equals(CursoEnum.GRADUACAO)) {
			retorno = "G"+curso.getSiglaNomeCurso()+anoIngresso+periodoIngresso
					+numAleatorio()+numAleatorio()+numAleatorio();
			this.matricula = retorno;
			logger.info("matricula gerada = "+retorno);
			
		}
		else if (curso.getTipo().equals(CursoEnum.MESTRADO)) {
			
			retorno = "M"+curso.getSiglaNomeCurso()+anoIngresso+periodoIngresso
					+numAleatorio()+numAleatorio()+numAleatorio();
			this.matricula = retorno;
			logger.info("matricula gerada = "+retorno);			
				
		}

		else if (curso.getTipo().equals(CursoEnum.DOUTORADO)) {
			retorno = "D"+curso.getSiglaNomeCurso()+anoIngresso+periodoIngresso
					+numAleatorio()+numAleatorio()+numAleatorio();
			this.matricula = retorno;
			logger.info("matricula gerada = "+retorno);
			
		}

		else if(curso.getTipo().equals(CursoEnum.ESPECIALIZACAO)) {
			retorno = "E"+curso.getSiglaNomeCurso()+anoIngresso+periodoIngresso
					+numAleatorio()+numAleatorio()+numAleatorio();
			this.matricula = retorno;
			logger.info("matricula gerada = "+retorno);
			
		}		
		
	}

	public int numAleatorio() {
		Random gerador = new Random();
		return gerador.nextInt(9);
	}

}
