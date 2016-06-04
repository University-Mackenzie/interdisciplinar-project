package br.mackenzie.interdisciplinarproject.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Matricula")
@Table(name = "Matricula")
public class Matricula {
	
	@Id
	@Column(name = "Matricula")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tia;
		
	@Column(name = "Classificacao")
	private String classificacao;

	@Column(name = "Data")
	private Date data;

	/**
	 * Construtor com seus parâmetros.
	 * @param tia
	 * @param classificacao
	 * @param data
	 */
	public Matricula(int tia, String classificacao, Date data) {
		super();
		this.tia = tia;
		this.classificacao = classificacao;
		this.data = data;
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
	public int getTia() {
		return tia;
	}
	public void setTia(int tia) {
		this.tia = tia;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
}