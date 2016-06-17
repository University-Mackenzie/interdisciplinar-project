package br.mackenzie.interdisciplinarproject.dto;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
public class SalaDTO {
	
	/**
	 * 
	 */
	private int numero_sala;
	private int numero_predio;
	private String unidade;
	private int ID_Sala;

	/**
	 * 
	 */
	public int getNumero_sala() {
		return numero_sala;
	}
	public void setNumero_sala(int numero_sala) {
		this.numero_sala = numero_sala;
	}
	public int getNumero_predio() {
		return numero_predio;
	}
	public void setNumero_predio(int numero_predio) {
		this.numero_predio = numero_predio;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public int getID_Sala() {
		return ID_Sala;
	}
	public void setID_Sala(int iD_Sala) {
		ID_Sala = iD_Sala;
	}
}