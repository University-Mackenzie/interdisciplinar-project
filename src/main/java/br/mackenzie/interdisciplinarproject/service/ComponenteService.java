package br.mackenzie.interdisciplinarproject.service;

import java.util.List;

import br.mackenzie.interdisciplinarproject.model.Componente;

public interface ComponenteService {
	
	/**
	 * Retorna lista de Compoenentes
	 * @return
	 */
	List<Componente> listarComponentes();
}