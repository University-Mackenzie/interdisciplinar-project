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
	private String descricao;
	private int tia_fk;
	
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