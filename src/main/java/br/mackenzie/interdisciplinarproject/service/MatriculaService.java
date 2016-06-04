package br.mackenzie.interdisciplinarproject.service;

import java.util.List;

import br.mackenzie.interdisciplinarproject.model.Matricula;

public interface MatriculaService {
	
	/**
	 * Retorna lista de Matriculas.
	 * @return
	 */
	List<Matricula> listarMatriculas();
}