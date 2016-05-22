package br.mackenzie.pi.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
@Entity(name = "Date")
@Table(name = "Date")
public class Date {
	
	private Date dt_atual;
	private Date dt_reserva;
	
	/**
	 * Construtor com seus parâmetros.
	 * @param dt_atual
	 * @param dt_reserva
	 */
	public Date(Date dt_atual, Date dt_reserva) {
		super();
		this.dt_atual = dt_atual;
		this.dt_reserva = dt_reserva;
	}
	/**
	 * Construtor vazio.
	 */
	public Date() {
		super();
	}

	/**
	 * Métodos que retornam seus respectivos dados.
	 * @return
	 */
	public Date getDt_atual() {
		return dt_atual;
	}
	public void setDt_atual(Date dt_atual) {
		this.dt_atual = dt_atual;
	}
	public Date getDt_reserva() {
		return dt_reserva;
	}
	public void setDt_reserva(Date dt_reserva) {
		this.dt_reserva = dt_reserva;
	}
}
