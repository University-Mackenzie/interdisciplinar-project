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
@Entity(name = "Sala")
@Table(name = "Sala")
public class Sala {
	
	@Id
	@Column(name = "ID_sala")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSala;
	
	private int id_sala;
	@Column(name = "Numero")
	private int numero;
	@Column(name = "Predio")
	private int predio;
	@Column(name = "QtdAlunos")
	private int qtd_alunos;
	@Column(name = "Unidade")
	private int unidade;
	
	/**
	 * Construtor com seus parâmetros
	 * @param idSala
	 * @param id_sala
	 * @param numero
	 * @param predio
	 * @param qtd_alunos
	 * @param unidade
	 */
	public Sala(int idSala, int id_sala, int numero, int predio, int qtd_alunos, int unidade) {
		super();
		this.idSala = idSala;
		this.id_sala = id_sala;
		this.numero = numero;
		this.predio = predio;
		this.qtd_alunos = qtd_alunos;
		this.unidade = unidade;
	}
	/**
	 * Construtor vazio.
	 */
	public Sala() {
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
	public int getId_sala() {
		return id_sala;
	}
	public void setId_sala(int id_sala) {
		this.id_sala = id_sala;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getPredio() {
		return predio;
	}
	public void setPredio(int predio) {
		this.predio = predio;
	}
	public int getQtd_alunos() {
		return qtd_alunos;
	}
	public void setQtd_alunos(int qtd_alunos) {
		this.qtd_alunos = qtd_alunos;
	}
	public int getUnidade() {
		return unidade;
	}
	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}	
}