package br.mackenzie.interdisciplinarproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.mackenzie.interdisciplinarproject.dto.UsuarioDTO;
import br.mackenzie.interdisciplinarproject.model.Usuario;
import br.mackenzie.interdisciplinarproject.service.UsuarioService;
import br.mackenzie.interdisciplinarproject.util.Utils;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioservice;
	
	Utils utils = new Utils();

	/**
	 * Metodo que tem como funcao listar Usuarios.
	 * 
	 * @return jsonUsuarios
	 */
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	@ResponseBody
	public String listar() {

		List<Usuario> usuarios = usuarioservice.listarUsuarios();

		String jsonUsuarios = utils.convertToJson(usuarios);
		return jsonUsuarios;
	}
	
	@RequestMapping(value = "/incluirNovoUsuario", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
	public void inserirUsuario(@RequestBody UsuarioDTO usuarioDTO){
    	usuarioservice.inserirUsuario(usuarioDTO);
	}
	
	@RequestMapping(value = "/atualizarUsuario", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void atualizarUsuario(@RequestBody UsuarioDTO usuarioDTO){
		usuarioservice.atualizarUsuario(usuarioDTO);
	}
	
	@RequestMapping(value = "/deletarUsuario", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void deletarUsuario(@RequestBody UsuarioDTO usuarioDTO){
		usuarioservice.deletarUsuario(usuarioDTO);
	}
}