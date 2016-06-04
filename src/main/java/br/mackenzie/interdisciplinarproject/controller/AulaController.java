package br.mackenzie.interdisciplinarproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.mackenzie.interdisciplinarproject.model.Aula;
import br.mackenzie.interdisciplinarproject.service.AulaService;
import br.mackenzie.interdisciplinarproject.util.Utils;

/**
 * 
 * @author jonyfernandoschulz
 *
 */

@Controller
@RequestMapping("/aula")
public class AulaController {
	
	@Autowired
	private AulaService aulaservice;
	
	Utils utils = new Utils();

	/**
	 * Metodo que tem como funcao listar Aulas.
	 * 
	 * @return jsonAulas
	 */
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	@ResponseBody
	public String listar() {

		List<Aula> aulas = aulaservice.listarAulas();

		String jsonAulas = utils.convertToJson(aulas);
		return jsonAulas;
	}
}