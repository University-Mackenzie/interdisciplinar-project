package br.mackenzie.interdisciplinarproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.mackenzie.interdisciplinarproject.model.Reserva;
import br.mackenzie.interdisciplinarproject.service.ReservaService;
import br.mackenzie.interdisciplinarproject.util.Utils;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
@Controller
@RequestMapping("/reserva")
public class ReservaController {
	
	@Autowired
	private ReservaService reservaservice;
	
	Utils utils = new Utils();

	/**
	 * Metodo que tem como funcao listar Reservas de aulas.
	 * 
	 * @return jsonReservas
	 */
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	@ResponseBody
	public String listar() {

		List<Reserva> reservas = reservaservice.listarReservas();

		String jsonReservas = utils.convertToJson(reservas);
		return jsonReservas;
	}
}