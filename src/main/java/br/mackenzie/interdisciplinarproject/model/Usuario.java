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
	private String nome;
	@Column(name = "email")
	private String email;
	
	/**
	 * Construtor com seus parâmetros.
	 * @param tia
	 * @param nome
	 * @param email
	 */
	public Usuario(int tia, String nome, String email) {
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
}