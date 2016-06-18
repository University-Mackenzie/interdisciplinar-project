package br.mackenzie.interdisciplinarproject.dto;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
public class ComponenteDTO {
	
	/**
	 * 
	 */
	private int codigo;
	private String nome;
	private String img_path;
	
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
	public void setImg_path() {
		this.img_path = img_path;
	}
	public String getImg_path() {
		return img_path;
	}
}