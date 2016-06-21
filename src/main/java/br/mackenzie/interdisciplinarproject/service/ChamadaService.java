package br.mackenzie.interdisciplinarproject.service;

import java.util.List;

import br.mackenzie.interdisciplinarproject.dto.ChamadaDTO;
import br.mackenzie.interdisciplinarproject.model.Chamada;
/**
 * Chamada
 * @author julio.cesar.maciel
 *
 */
public interface ChamadaService {
	
	/**
	 * Retorna lista de Chamadas.
	 * @return
	 */
	List<Chamada> listarChamadas();
	
	/**
	 * 
	 * inserir Chamada
	 * 
	 * @param chamadaDTO
	 */
	void inserirChamada(ChamadaDTO chamadaDTO);
	
	/**
	 * 
	 * Atualizar Chamada
	 * 
	 * @param chamadaDTO
	 */
	void atualizarChamada(ChamadaDTO chamadaDTO);
	
	/**
	 * 
	 * Deletar Chamada
	 * 
	 * @param chamadaDTO
	 */
	void deletarChamada(ChamadaDTO chamadaDTO);
}