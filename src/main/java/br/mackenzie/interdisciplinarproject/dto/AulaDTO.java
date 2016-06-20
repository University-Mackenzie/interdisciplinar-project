package br.mackenzie.interdisciplinarproject.dto;

import java.sql.Date;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
public class AulaDTO {

	private int idAula;
	private String professor;
	private String disciplina;
	private Date data;
	private int idSala;

	public AulaDTO() {
	}

	public AulaDTO(int idAula, String professor, String disciplina, Date data, int idSala) {
		this.idAula = idAula;
		this.professor = professor;
		this.disciplina = disciplina;
		this.data = data;
		this.idSala = idSala;
	}

	public int getIdAula() {
		return idAula;
	}

	public void setIdAula(int idAula) {
		this.idAula = idAula;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getIdSala() {
		return idSala;
	}

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}
}