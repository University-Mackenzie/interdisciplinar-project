package br.mackenzie.pi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
@Entity(name = "Matricula")
@Table(name = "Matricula")
public class Matricula {
	
	@Column(name = "Matricula")
	private int matricula;
	@Column(name = "Situacao")
	private String situacao;
	@Column(name = "Classificacao")
	private String classificacao;
	@Column(name = "DataIni")
	private Date dt_ini;
	@Column(name = "DataFim")
	private Date dt_fim;
	
	/**
	 * Construtor com seus parâmetros.
	 * @param matricula
	 * @param situacao
	 * @param classificacao
	 * @param dt_ini
	 * @param dt_fim
	 */
	public Matricula(int matricula, String situacao, String classificacao, Date dt_ini, Date dt_fim) {
		super();
		this.matricula = matricula;
		this.situacao = situacao;
		this.classificacao = classificacao;
		this.dt_ini = dt_ini;
		this.dt_fim = dt_fim;
	}
	/**
	 * Construtor vazio.
	 */
	public Matricula() {
		super();
	}
	
	/**
	 * Métodos que retornam seus respectivos dados.
	 * @return
	 */
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public Date getDt_ini() {
		return dt_ini;
	}
	public void setDt_ini(Date dt_ini) {
		this.dt_ini = dt_ini;
	}
	public Date getDt_fim() {
		return dt_fim;
	}
	public void setDt_fim(Date dt_fim) {
		this.dt_fim = dt_fim;
	}
}