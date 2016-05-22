package br.mackenzie.pi.model;

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
	@Column(name = "ID_sala")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSala;
	@Column(name = "professor")
	private int idProfessor;

	/**
	 * Construtor com seus parâmetros.
	 * @param idSala
	 * @param idProfessor
	 */
	public Aula(int idSala, int idProfessor) {
		super();
		this.idSala = idSala;
		this.idProfessor = idProfessor;
	}
	/**
	 * Construtor vazio.
	 */
	public Aula() {
		super();
	}

	/**
	 * Métodos que retornam seus respectivos dados.
	 * @return
	 */
	public int getIdSala() {
		return idSala;
	}
	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}
	public int getIdProfessor() {
		return idProfessor;
	}
	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}
}