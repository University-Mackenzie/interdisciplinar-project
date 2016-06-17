package br.mackenzie.interdisciplinarproject.dto;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
public class UsuarioDTO {
	
	/**
	 * 
	 */
	private String nome;
	private String email;
	private String tipo_monitor;
	private String img_perfil;
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
	public String getTipo_monitor() {
		return tipo_monitor;
	}
	public void setTipo_monitor(String tipo_monitor) {
		this.tipo_monitor = tipo_monitor;
	}
	public String getImg_perfil() {
		return img_perfil;
	}
	public void setImg_perfil(String img_perfil) {
		this.img_perfil = img_perfil;
	}
	public int getTia() {
		return tia;
	}
	public void setTia(int tia) {
		this.tia = tia;
	}
}