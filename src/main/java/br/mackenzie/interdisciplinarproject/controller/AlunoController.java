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

import br.mackenzie.interdisciplinarproject.dto.AlunoDTO;
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
	 * Metodo que tem como funcao listar Alunos.
	 * 
	 * @return jsonAlunos
	 */
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	@ResponseBody
	public String listar() {

		List<Aluno> aluno = alunoservice.listarAlunos();

		String jsonAlunos = utils.convertToJson(aluno);
		return jsonAlunos;
	}
	
    @RequestMapping(value = "/incluirNovoAluno", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
	public void inserirAluno(@RequestBody AlunoDTO alunoDTO){
    	alunoservice.inserirAluno(alunoDTO);
	}
}