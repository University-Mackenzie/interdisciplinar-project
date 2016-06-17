package br.mackenzie.interdisciplinarproject.service;

import java.util.List;

import br.mackenzie.interdisciplinarproject.dto.UsuarioDTO;
import br.mackenzie.interdisciplinarproject.model.Usuario;

public interface UsuarioService {
	
	/**
	 * Retorna lista de Usuarios
	 * @return
	 */
	List<Usuario> listarUsuarios();
	
	/**
	 * Inserir Usuario.
	 * 
	 * @param usuarioDTO
	 */
	public void inserirUsuario(Usuario usuario,UsuarioDTO usuarioDTO);
}