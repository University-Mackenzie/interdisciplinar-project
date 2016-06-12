package br.mackenzie.interdisciplinarproject.service;

import java.util.List;

import br.mackenzie.interdisciplinarproject.model.Aluno;

public interface AlunoService {
	
	/**
	 * Retorna lista de Alunos
	 * @return
	 */
	List<Aluno> listarAlunos();
}