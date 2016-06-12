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
	@Column(name = "img_perfil")
	private String img_perfil;
	@Column(name = "tipo_monitor")
	private String tipo_monitor;
	
	/**
	 * Construtor com seus parâmetros.
	 * @param tia
	 * @param nome
	 * @param email
	 * @param img_perfil
	 */
	public Usuario(int tia, String nome, String email, String img_perfil, String tipo_monitor) {
		super();
		this.tia = tia;
		this.nome = nome;
		this.email = email;
		this.img_perfil = img_perfil;
		this.tipo_monitor = tipo_monitor;
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
	public String getImg_perfil() {
		return img_perfil;
	}
	public void setImg_perfil(String img_perfil) {
		this.img_perfil = img_perfil;
	}
	public String getTipo_monitor() {
		return tipo_monitor;
	}
	public void setTipo_monitor(String tipo_monitor) {
		this.tipo_monitor = tipo_monitor;
	}
}