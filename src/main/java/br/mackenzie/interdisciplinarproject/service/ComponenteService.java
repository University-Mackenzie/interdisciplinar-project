package br.mackenzie.interdisciplinarproject.service;

import java.util.List;

import br.mackenzie.interdisciplinarproject.dto.ComponenteDTO;
import br.mackenzie.interdisciplinarproject.model.Componente;
import br.mackenzie.interdisciplinarproject.model.Usuario;

public interface ComponenteService {
	
	/**
	 * Retorna lista de Compoenentes
	 * @return
	 */
	List<Componente> listarComponentes();
	
	
	/**
	 * Inserir Componente
	 * 
	 * @param componenteDTO
	 */
	public void inserirComponente(Usuario usuario,ComponenteDTO componenteDTO);
}