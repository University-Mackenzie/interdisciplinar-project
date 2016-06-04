package br.mackenzie.interdisciplinarproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.mackenzie.interdisciplinarproject.model.Sala;
import br.mackenzie.interdisciplinarproject.service.SalaService;
import br.mackenzie.interdisciplinarproject.util.Utils;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
@Controller
@RequestMapping("/sala")
public class SalaController {
	
	@Autowired
	private SalaService salaservice;
	
	Utils utils = new Utils();

	/**
	 * Metodo que tem como funcao listar Salas.
	 * 
	 * @return jsonSalas
	 */
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	@ResponseBody
	public String listar() {

		List<Sala> salas = salaservice.listarSalas();

		String jsonSalas = utils.convertToJson(salas);
		return jsonSalas;
	}
}