package br.mackenzie.interdisciplinarproject.dto;

import java.sql.Date;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
public class ReservaDTO {
	
	/**
	 * 
	 */
	private int ID_Sala;
	private int tia;
	private Date data;
	private int status;
	
	/**
	 * 
	 * @return
	 */
	public int getID_Sala() {
		return ID_Sala;
	}
	public void setID_Sala(int iD_Sala) {
		ID_Sala = iD_Sala;
	}
	public int getTia() {
		return tia;
	}
	public void setTia(int tia) {
		this.tia = tia;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}	
}