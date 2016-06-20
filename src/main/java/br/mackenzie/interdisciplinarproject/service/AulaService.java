package br.mackenzie.interdisciplinarproject.service;

import java.util.List;

import br.mackenzie.interdisciplinarproject.model.Aula;

public interface AulaService {
	
	/**
	 * Retorna lista de Aulas.
	 * @return
	 */
	List<Aula> listarAulas();
	
	/**
	 * 
	 * inserir aula
	 * 
	 * @param aula
	 */
	void inserirAula(Aula aula);
	
	/**
	 * 
	 * deletar aula
	 * 
	 */
	void deletarAula(Aula aula);
	
	/**
	 * 
	 * atualizar aula
	 * 
	 */
	void atualizarAula(Aula aula);
	
	/**
	 * 
	 * Buscar aula por Id
	 * 
	 */
	Aula AulaPorId(int id);
}