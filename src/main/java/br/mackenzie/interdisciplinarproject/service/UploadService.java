package br.mackenzie.interdisciplinarproject.service;

import java.util.List;

import br.mackenzie.interdisciplinarproject.model.Aluno;

public interface UploadService {
	
	/**
	 * Retorna lista de Alunos
	 * @return
	 */
	List<Aluno> listarAlunos();
}