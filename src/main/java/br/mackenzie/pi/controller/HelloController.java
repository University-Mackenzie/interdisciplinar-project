package br.mackenzie.pi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.mackenzie.pi.model.Transacao;
import br.mackenzie.pi.service.TransacaoService;
import br.mackenzie.pi.util.Utils;

@Controller
@RequestMapping("/transacoes")
public class HelloController {

	@Autowired
	private TransacaoService transacaoService;
	
	Utils utils = new Utils(); 
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	@ResponseBody
	public String listar() {
	
		List<Transacao> transacoes = transacaoService.listarTransacoes();
		
		String jsonTransacoes = utils.convertToJson(transacoes);
		return jsonTransacoes;

	}

}