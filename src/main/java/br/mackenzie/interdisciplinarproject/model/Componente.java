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

	@Column(name = "img_path")
	private String img_path;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "tia_fk")
	private int tia_fk;

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

	public String getImg_path() {
		return img_path;
	}

	public void setImg_path(String img_path) {
		this.img_path = img_path;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getTia_fk() {
		return tia_fk;
	}

	public void setTia_fk(int tia_fk) {
		this.tia_fk = tia_fk;
	}
}