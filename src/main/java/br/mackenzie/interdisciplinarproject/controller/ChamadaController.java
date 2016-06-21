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

import br.mackenzie.interdisciplinarproject.dto.AlunoDTO;
import br.mackenzie.interdisciplinarproject.dto.ChamadaDTO;
import br.mackenzie.interdisciplinarproject.model.Chamada;
import br.mackenzie.interdisciplinarproject.service.ChamadaService;
import br.mackenzie.interdisciplinarproject.util.Utils;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
@Controller
@RequestMapping("/chamada")
public class ChamadaController {

	@Autowired
	private ChamadaService chamadaservice;

	Utils utils = new Utils();

	/**
	 * Metodo que tem como funcao listar Chamadas em aulas.
	 * 
	 * @return jsonChamadas
	 */
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	@ResponseBody
	public String listar() {

		List<Chamada> chamadas = chamadaservice.listarChamadas();

		String jsonChamadas = utils.convertToJson(chamadas);
		return jsonChamadas;
	}

	@RequestMapping(value = "/incluirNovoChamada", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void inserirAluno(@RequestBody ChamadaDTO chamadaDTO) {
		chamadaservice.inserirChamada(chamadaDTO);
	}

	@RequestMapping(value = "/atualizarChamda", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void atualizarAluno(@RequestBody ChamadaDTO chamadaDTO) {
		chamadaservice.atualizarChamada(chamadaDTO);
	}

	@RequestMapping(value = "/deletarChamda", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void deletarAluno(@RequestBody ChamadaDTO chamadaDTO) {
		chamadaservice.deletarChamada(chamadaDTO);
	}

}