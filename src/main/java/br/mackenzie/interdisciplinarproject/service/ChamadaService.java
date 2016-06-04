package br.mackenzie.interdisciplinarproject.service;

import java.util.List;

import br.mackenzie.interdisciplinarproject.model.Chamada;

public interface ChamadaService {
	
	/**
	 * Retorna lista de Chamadas.
	 * @return
	 */
	List<Chamada> listarChamadas();
}