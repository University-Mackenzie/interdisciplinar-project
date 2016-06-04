package br.mackenzie.interdisciplinarproject.service;

import java.util.List;

import br.mackenzie.interdisciplinarproject.model.Usuario;

public interface UsuarioService {
	
	/**
	 * Retorna lista de Usuarios
	 * @return
	 */
	List<Usuario> listarUsuarios();
}