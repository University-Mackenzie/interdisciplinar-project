package br.mackenzie.interdisciplinarproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.mackenzie.interdisciplinarproject.model.Matricula;
import br.mackenzie.interdisciplinarproject.service.MatriculaService;
import br.mackenzie.interdisciplinarproject.util.Utils;

/**
 * 
 * @author jonyfernandoschulz
 *
 */

@Controller
@RequestMapping("/matricula")
public class MatriculaController {
	
	@Autowired
	private MatriculaService matriculaservice;
	
	Utils utils = new Utils();

	/**
	 * Metodo que tem como funcao listar Aulas.
	 * 
	 * @return jsonMatricula
	 */
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	@ResponseBody
	public String listar() {

		List<Matricula> matriculas = matriculaservice.listarMatriculas();

		String jsonMatricula = utils.convertToJson(matriculas);
		return jsonMatricula;
	}
}