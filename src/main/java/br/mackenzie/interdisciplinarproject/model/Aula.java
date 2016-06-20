package br.mackenzie.interdisciplinarproject.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
@Entity(name = "Aula")
@Table(name = "Aula")
public class Aula {

	@Id
	@Column(name = "ID_Aula")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAula;
	@Column(name = "professor")
	private String professor;
	@Column(name = "Disciplina")
	private String disciplina;
	@Column(name = "Data")
	private Date data;
	@Column(name = "ID_sala")
	private int idSala;

	public Aula() {
		super();
	}
	
	public Aula( String professor, String disciplina, Date data, int idSala) {
		super();
		this.professor = professor;
		this.disciplina = disciplina;
		this.data = data;
		this.idSala = idSala;
	}

	public Aula(int idAula, String professor, String disciplina, Date data, int idSala) {
		super();
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