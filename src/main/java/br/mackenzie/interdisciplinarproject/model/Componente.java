package br.mackenzie.interdisciplinarproject.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
@Entity(name = "Componente")
@Table(name = "Componente")
public class Componente {
	
	private int codigo;
	private String nome;

}
