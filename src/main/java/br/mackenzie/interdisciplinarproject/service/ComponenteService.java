package br.mackenzie.interdisciplinarproject.service;

import java.util.List;

import br.mackenzie.interdisciplinarproject.dto.ComponenteDTO;
import br.mackenzie.interdisciplinarproject.model.Componente;

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
	public void inserirComponente(ComponenteDTO componenteDTO);
	
	/**
	 * Atualizar Componente
	 * 
	 * @param componenteDTO
	 */
	void atualizarComponente(ComponenteDTO componenteDTO);
	
	
	/**
	 * Deletar Componente
	 * 
	 * @param componenteDTO
	 */
	void deletarComponente(ComponenteDTO componenteDTO);
	
	/**
	 * 
	 * Buscar Componente por nome
	 * 
	 * @return Objeto componente
	 */
	Componente buscarComponente(String nome);
}