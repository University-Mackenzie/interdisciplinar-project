package br.mackenzie.interdisciplinarproject.dto;

import java.sql.Date;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
public class AulaDTO {
	
	/**
	 * 
	 */
	private String componente;
	private int ID_Sala;
	private String professor;
	private Date data;
	private int ID_Aula;
	
	/**
	 * 
	 * @return
	 */
	public String getComponente() {
		return componente;
	}
	public void setComponente(String componente) {
		this.componente = componente;
	}
	public int getID_Sala() {
		return ID_Sala;
	}
	public void setID_Sala(int iD_Sala) {
		ID_Sala = iD_Sala;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getID_Aula() {
		return ID_Aula;
	}
	public void setID_Aula(int iD_Aula) {
		ID_Aula = iD_Aula;
	}
}