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
@Entity(name = "Chamada")
@Table(name = "Chamada")
public class Chamada {
	
	@Id
	@Column(name = "Id_Aula")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_aula;
	
	@Column(name = "Tia_Aluno")
	private int tia_aluno;
	@Column(name = "Presenca")
	private int presenca;
	
	/**
	 * Construtor com seus parâmetros.
	 * @param id_aula
	 * @param tia_aluno
	 * @param presenca
	 */
	public Chamada(int id_aula, int tia_aluno, int presenca) {
		super();
		this.id_aula = id_aula;
		this.tia_aluno = tia_aluno;
		this.presenca = presenca;
	}
	/**
	 * Construtor vazio.
	 */
	public Chamada() {
		super();
	}
	
	/**
	 * Métodos que retornam seus respectivos dados.
	 * @return
	 */
	public int getId_aula() {
		return id_aula;
	}
	public void setId_aula(int id_aula) {
		this.id_aula = id_aula;
	}
	public int getTia_aluno() {
		return tia_aluno;
	}
	public void setTia_aluno(int tia_aluno) {
		this.tia_aluno = tia_aluno;
	}
	public int getPresenca() {
		return presenca;
	}
	public void setPresenca(int presenca) {
		this.presenca = presenca;
	}
}