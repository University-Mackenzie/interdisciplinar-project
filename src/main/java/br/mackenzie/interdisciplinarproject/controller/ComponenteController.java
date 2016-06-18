package br.mackenzie.interdisciplinarproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.mackenzie.interdisciplinarproject.dto.ComponenteDTO;
import br.mackenzie.interdisciplinarproject.model.Componente;
import br.mackenzie.interdisciplinarproject.model.Usuario;
import br.mackenzie.interdisciplinarproject.service.ComponenteService;
import br.mackenzie.interdisciplinarproject.util.Utils;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
@Controller
@RequestMapping("/componente")
public class ComponenteController {
	
	@Autowired
	private ComponenteService componenteservice;
	
	Utils utils = new Utils();

	/**
	 * Metodo que tem como funcao listar Componentes.
	 * 
	 * @return jsonComponentes
	 */
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	@ResponseBody
	public String listar() {

		List<Componente> componente = componenteservice.listarComponentes();

		String jsonComponentes = utils.convertToJson(componente);
		return jsonComponentes;
	}
	
    @RequestMapping(value = "/incluirNovoComponente", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
	public void inserirComponente(@PathVariable(value = "tia") int tia, @RequestBody ComponenteDTO componenteDTO){
    	Usuario usuario = new Usuario();
    	usuario.setTia(tia);
    	componenteservice.inserirComponente(usuario,componenteDTO);
	}
}