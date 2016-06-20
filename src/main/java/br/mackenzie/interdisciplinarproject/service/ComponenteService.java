package br.mackenzie.interdisciplinarproject.service;

import java.util.List;

import br.mackenzie.interdisciplinarproject.dto.ComponenteDTO;
import br.mackenzie.interdisciplinarproject.dto.UsuarioDTO;
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
	
	/**
	 * Atualizar Componente
	 * 
	 * @param componenteDTO
	 */
	void atualizarComponente(Usuario usuario,ComponenteDTO componenteDTO);
	
	
	/**
	 * Deletar Componente
	 * 
	 * @param componenteDTO
	 */
	void deletarComponente(Usuario usuario,ComponenteDTO componenteDTO);
	
	/**
	 * 
	 * Buscar Componente por nome
	 * 
	 * @return Objeto componente
	 */
	Componente buscarComponente(String nome);
}