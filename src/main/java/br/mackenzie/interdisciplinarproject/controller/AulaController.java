package br.mackenzie.interdisciplinarproject.controller;

import java.util.Date;
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

import br.mackenzie.interdisciplinarproject.dto.AulaDTO;
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

	@RequestMapping(value = "/incluirNovaAula", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void inserirAula(@RequestBody AulaDTO aulaDTO) {
		Aula aula = new Aula(aulaDTO.getProfessor(), aulaDTO.getDisciplina(), new Date(), aulaDTO.getIdSala());
		aulaservice.inserirAula(aula);
	}

	@RequestMapping(value = "/atualizarAula", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void atualizarAula(@RequestBody AulaDTO aulaDTO) {
		Aula aula = new Aula(aulaDTO.getIdAula(), aulaDTO.getProfessor(), aulaDTO.getDisciplina(), aulaDTO.getData(),
				aulaDTO.getIdSala());
		aulaservice.atualizarAula(aula);
	}

	@RequestMapping(value = "/excluirAula", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void excluirAula(@RequestBody AulaDTO aulaDTO) {
		Aula aula = new Aula(aulaDTO.getIdAula(), aulaDTO.getProfessor(), aulaDTO.getDisciplina(), aulaDTO.getData(),
				aulaDTO.getIdSala());
		aulaservice.deletarAula(aula);
	}
}