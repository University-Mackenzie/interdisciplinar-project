package br.mackenzie.pi.dao;

import br.mackenzie.pi.model.Aula;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
public interface AulaDAO extends GenericDAO<Aula, Long> {
	
	public String consultaProfessor();	

}
