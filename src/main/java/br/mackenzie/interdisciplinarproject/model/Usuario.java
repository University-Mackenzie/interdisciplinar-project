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
@Entity(name = "Usuario")
@Table(name = "Usuario")
public class Usuario {
	
	@Id
	@Column(name = "Tia")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tia;

	@Column(name = "nome")
	private int nome;
	@Column(name = "email")
	private int email;
	
	/**
	 * Construtor com seus parâmetros.
	 * @param tia
	 * @param nome
	 * @param email
	 */
	public Usuario(int tia, int nome, int email) {
		super();
		this.tia = tia;
		this.nome = nome;
		this.email = email;
	}
	/**
	 * Construtor vazio.
	 */
	public Usuario() {
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
	public int getNome() {
		return nome;
	}
	public void setNome(int nome) {
		this.nome = nome;
	}
	public int getEmail() {
		return email;
	}
	public void setEmail(int email) {
		this.email = email;
	}	
}