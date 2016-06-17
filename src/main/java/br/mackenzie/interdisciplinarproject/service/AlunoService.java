package br.mackenzie.interdisciplinarproject.service;

import java.util.List;

import br.mackenzie.interdisciplinarproject.dto.AlunoDTO;
import br.mackenzie.interdisciplinarproject.model.Aluno;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
public interface AlunoService {
	
	/**
	 * Retorna lista de Alunos
	 * @return
	 */
	List<Aluno> listarAlunos();
	
	/**
	 * Inserir Aluno
	 * 
	 * @param alunoDTO
	 */
	public void inserirAluno(Aluno aluno,AlunoDTO alunoDTO);
}