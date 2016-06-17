package br.mackenzie.interdisciplinarproject.dto;

import java.util.Date;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
public class MatriculaDTO {
	
	/**
	 * 
	 */
	private int matricula;
	private String classificacao;
	private Date data;
	
	/**
	 * 
	 * @return
	 */
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
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