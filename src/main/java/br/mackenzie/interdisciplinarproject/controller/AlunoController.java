package br.mackenzie.interdisciplinarproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.mackenzie.interdisciplinarproject.model.Aluno;
import br.mackenzie.interdisciplinarproject.service.AlunoService;
import br.mackenzie.interdisciplinarproject.util.Utils;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
@Controller
@RequestMapping("/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoservice;
	
	Utils utils = new Utils();

	/**
	 * Metodo que tem como funcao listar Aluno.
	 * 
	 * @return jsonAlunos
	 */
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	@ResponseBody
	public String listar() {

		List<Aluno> alunos = alunoservice.listarAlunos();

		String jsonAlunos = utils.convertToJson(alunos);
		return jsonAlunos;
	}
}