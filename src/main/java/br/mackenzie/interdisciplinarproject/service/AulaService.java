package br.mackenzie.interdisciplinarproject.service;

import java.util.List;

import br.mackenzie.interdisciplinarproject.model.Aula;

public interface AulaService {
	
	/**
	 * Retorna lista de Aulas.
	 * @return
	 */
	List<Aula> listarAulas();
}