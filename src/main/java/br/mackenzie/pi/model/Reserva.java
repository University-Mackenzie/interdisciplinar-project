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
@Entity(name = "Reserva")
@Table(name = "Reserva")
public class Reserva {
		
	@Id
	@Column(name = "ID_sala")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_sala;
	@Column(name = "Dt_Reserva")
	private Date dt_reserva;
	@Column(name = "Tia")
	private int tia;
	@Column(name = "Status")
	private Boolean sala_status;
	
	/**
	 * Construtor com seus parâmetros.
	 * @param tia
	 * @param dt_reserva
	 * @param id_sala
	 * @param sala_status
	 */
	public Reserva(int tia, Date dt_reserva, int id_sala, Boolean sala_status) {
		super();
		this.tia = tia;
		this.dt_reserva = dt_reserva;
		this.id_sala = id_sala;
		this.sala_status = sala_status;
	}
	/**
	 * Construtor vazio.
	 */
	public Reserva() {
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
	public Date getDt_reserva() {
		return dt_reserva;
	}
	public void setDt_reserva(Date dt_reserva) {
		this.dt_reserva = dt_reserva;
	}
	public int getId_sala() {
		return id_sala;
	}
	public void setId_sala(int id_sala) {
		this.id_sala = id_sala;
	}
	public Boolean getSala_status() {
		return sala_status;
	}
	public void setSala_status(Boolean sala_status) {
		this.sala_status = sala_status;
	}
}
