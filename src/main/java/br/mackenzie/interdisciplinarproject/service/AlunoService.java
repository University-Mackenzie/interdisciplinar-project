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
	 * 
	 * @return
	 */
	List<Aluno> listarAlunos();

	/**
	 * Inserir Aluno
	 * 
	 * @param alunoDTO
	 */
	void inserirAluno(AlunoDTO alunoDTO);
	
	
	/**
	 * atualizar Aluno
	 * 
	 * @param alunoDTO
	 */
	void atualizarAluno(AlunoDTO alunoDTO);
	
	
	/**
	 * deletar Aluno
	 * 
	 * @param alunoDTO
	 */
	void deletarAluno(AlunoDTO alunoDTO);
	
	/**
	 * 
	 * Buscar Aluno por nome
	 * 
	 * @return Objeto aluno
	 */
	Aluno buscarAluno(String nome);
}