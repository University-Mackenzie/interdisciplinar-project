package br.mackenzie.interdisciplinarproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.mackenzie.interdisciplinarproject.dao.UsuarioDAO;
import br.mackenzie.interdisciplinarproject.dto.UsuarioDTO;
import br.mackenzie.interdisciplinarproject.model.Usuario;
import br.mackenzie.interdisciplinarproject.service.UsuarioService;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Override
	public List<Usuario> listarUsuarios() {
		return usuarioDAO.listar();
	}
	
	@Override
	public void inserirUsuario(UsuarioDTO usuarioDTO) {
		Usuario usuario = new Usuario();
		usuario.setEmail(usuarioDTO.getEmail());
		usuario.setNome(usuarioDTO.getNome());
		usuario.setTia(usuarioDTO.getTia());
		usuario.setTipo_monitor(usuarioDTO.getTipo_monitor());
		usuario.setImg_perfil(usuarioDTO.getImg_perfil());
		usuarioDAO.incluir(usuario);
	}
	
	@Override
	public void atualizarUsuario(UsuarioDTO usuarioDTO) {
		Usuario usuario = new Usuario();
		usuario.setEmail(usuarioDTO.getEmail());
		usuario.setNome(usuarioDTO.getNome());
		usuario.setTia(usuarioDTO.getTia());
		usuario.setTipo_monitor(usuarioDTO.getTipo_monitor());
		usuario.setImg_perfil(usuarioDTO.getImg_perfil());
		usuarioDAO.atualizar(usuario);
	}
	
	@Override
	public void deletarUsuario(UsuarioDTO usuarioDTO) {
		Usuario usuario = new Usuario();
		usuario.setEmail(usuarioDTO.getEmail());
		usuario.setNome(usuarioDTO.getNome());
		usuario.setTia(usuarioDTO.getTia());
		usuario.setTipo_monitor(usuarioDTO.getTipo_monitor());
		usuario.setImg_perfil(usuarioDTO.getImg_perfil());
		usuarioDAO.excluir(usuario);
	}

	public Usuario buscarUsuario(String nome){
		return usuarioDAO.buscarUsuarioPorNome(nome);
	}
}