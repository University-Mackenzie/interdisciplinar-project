package br.mackenzie.interdisciplinarproject.dto;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
public class ChamadaDTO {
	
	/**
	 * 
	 */
	private int ID_Sala;
	private int tia;
	private int presenca;
	
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
	public int getPresenca() {
		return presenca;
	}
	public void setPresenca(int presenca) {
		this.presenca = presenca;
	}
}