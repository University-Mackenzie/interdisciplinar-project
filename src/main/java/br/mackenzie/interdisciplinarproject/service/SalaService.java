package br.mackenzie.interdisciplinarproject.service;

import java.util.List;

import br.mackenzie.interdisciplinarproject.model.Sala;

public interface SalaService {
	
	/**
	 * Retorna lista de Salas.
	 * @return
	 */
	List<Sala> listarSalas();
}