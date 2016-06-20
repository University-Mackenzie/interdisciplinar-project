package br.mackenzie.interdisciplinarproject.dao;

import br.mackenzie.interdisciplinarproject.model.Aula;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
public interface AulaDAO extends GenericDAO<Aula, Long> {
	
	 Aula buscarAlunoPorId(int id);

}
