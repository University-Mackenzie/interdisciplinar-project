package br.mackenzie.interdisciplinarproject.dao;

import br.mackenzie.interdisciplinarproject.model.Aluno;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
public interface AlunoDAO extends GenericDAO<Aluno, Long> {
	
	Aluno buscarAlunoPorNome(String nome);

}
