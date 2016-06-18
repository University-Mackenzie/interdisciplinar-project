package br.mackenzie.interdisciplinarproject.service;

import java.util.List;

import br.mackenzie.interdisciplinarproject.dto.AlunoDTO;
import br.mackenzie.interdisciplinarproject.dto.UsuarioDTO;
import br.mackenzie.interdisciplinarproject.model.Usuario;

public interface UsuarioService {
	
	/**
	 * Retorna lista de Usuarios
	 * @return
	 */
	List<Usuario> listarUsuarios();
	
	/**
	 * Inserir Aluno
	 * 
	 * @param usuarioDTO
	 */
	public void inserirUsuario(UsuarioDTO usuarioDTO);
}