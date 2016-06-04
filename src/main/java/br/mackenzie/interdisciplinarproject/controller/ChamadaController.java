package br.mackenzie.interdisciplinarproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.mackenzie.interdisciplinarproject.model.Chamada;
import br.mackenzie.interdisciplinarproject.service.ChamadaService;
import br.mackenzie.interdisciplinarproject.util.Utils;

@Controller
@RequestMapping("/chamada")
public class ChamadaController {
	
	@Autowired
	private ChamadaService chamadaservice;
	
	Utils utils = new Utils();

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	@ResponseBody
	public String listar() {

		List<Chamada> chamadas = chamadaservice.listarChamadas();

		String jsonChamadas = utils.convertToJson(chamadas);
		return jsonChamadas;

	}
	

}
