package br.mackenzie.interdisciplinarproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.mackenzie.interdisciplinarproject.dao.UsuarioDAO;
import br.mackenzie.interdisciplinarproject.dto.UsuarioDTO;
import br.mackenzie.interdisciplinarproject.model.Usuario;
import br.mackenzie.interdisciplinarproject.service.UsuarioService;
import br.mackenzie.interdisciplinarproject.util.DTOUtil;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioDAO usuarioDAO;

	@Override
	public List<Usuario> listarUsuarios() {
		return usuarioDAO.listar();
	}

	@Override
	public void inserirUsuario(Usuario usuario, UsuarioDTO usuarioDTO) {

		Usuario componente = new Usuario();
		DTOUtil.copiarPropriedades(componente, usuarioDTO, DTOUtil.obterNomesAtributos(UsuarioDTO.class));
		usuarioDAO.incluir(componente);
	}
}