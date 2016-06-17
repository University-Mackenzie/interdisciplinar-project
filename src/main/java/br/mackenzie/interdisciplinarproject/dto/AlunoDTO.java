package br.mackenzie.interdisciplinarproject.dto;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
public class AlunoDTO {
	
	/**
	 * 
	 */
	private String nome;
	private String email;
	private int tia;
	
	/**
	 * 
	 * @return
	 */
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
	public int getTia() {
		return tia;
	}
	public void setTia(int tia) {
		this.tia = tia;
	}	
}