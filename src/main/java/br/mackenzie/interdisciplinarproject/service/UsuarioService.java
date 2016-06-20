package br.mackenzie.interdisciplinarproject.service;

import java.util.List;

import br.mackenzie.interdisciplinarproject.dto.UsuarioDTO;
import br.mackenzie.interdisciplinarproject.model.Usuario;

public interface UsuarioService {
	
	/**
	 * Retorna lista de Usuarios
	 * 
	 * @return
	 */
	List<Usuario> listarUsuarios();

	/**
	 * Inserir Usuario
	 * 
	 * @param usuarioDTO
	 */
	void inserirUsuario(UsuarioDTO usuarioDTO);
	
	
	/**
	 * atualizar Usuario
	 * 
	 * @param usuarioDTO
	 */
	void atualizarUsuario(UsuarioDTO usuarioDTO);
	
	
	/**
	 * deletar Usuario
	 * 
	 * @param usuarioDTO
	 */
	void deletarUsuario(UsuarioDTO usuarioDTO);
	
	/**
	 * 
	 * Buscar Usuario por nome
	 * 
	 * @return Objeto usuario
	 */
	Usuario buscarUsuario(String nome);
}