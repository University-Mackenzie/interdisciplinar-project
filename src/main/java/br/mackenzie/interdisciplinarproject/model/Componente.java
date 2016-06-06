package br.mackenzie.interdisciplinarproject.model;

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
@Entity(name = "Componente")
@Table(name = "Componente")
public class Componente {
	
	@Id
	@Column(name = "ID_Componente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(name = "nome")
	private String nome;

	/**
	 * Construtor com seus parâmetros.
	 * @param codigo
	 * @param nome
	 */
	public Componente(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	/**
	 * Construtor vazio.
	 */
	public Componente() {
		super();
	}

	/**
	 * Métodos que retornam seus respectivos dados.
	 * @return
	 */
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}