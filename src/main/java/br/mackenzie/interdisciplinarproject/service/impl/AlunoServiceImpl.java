package br.mackenzie.interdisciplinarproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.mackenzie.interdisciplinarproject.dao.AlunoDAO;
import br.mackenzie.interdisciplinarproject.dto.AlunoDTO;
import br.mackenzie.interdisciplinarproject.model.Aluno;
import br.mackenzie.interdisciplinarproject.service.AlunoService;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
@Service
@Transactional
public class AlunoServiceImpl implements AlunoService{

	@Autowired
	private AlunoDAO alunoDAO;
	
	@Override
	public List<Aluno> listarAlunos() {
		return alunoDAO.listar();
	}
	
	@Override
	public void inserirAluno(AlunoDTO alunoDTO) {
		Aluno aluno = new Aluno();
		aluno.setEmail(alunoDTO.getEmail());
		aluno.setNome(alunoDTO.getNome());
		alunoDAO.incluir(aluno);
	}
	
	
	public Aluno buscarAluno(String nome){
		return alunoDAO.buscarAlunoPorNome(nome);
	}

	@Override
	public void atualizarAluno(AlunoDTO alunoDTO) {
		Aluno aluno = new Aluno();
		aluno.setEmail(alunoDTO.getEmail());
		aluno.setNome(alunoDTO.getNome());
		aluno.setTia(alunoDTO.getTia());
		alunoDAO.atualizar(aluno);
	}

	@Override
	public void deletarAluno(AlunoDTO alunoDTO) {
		Aluno aluno = new Aluno();
		aluno.setEmail(alunoDTO.getEmail());
		aluno.setNome(alunoDTO.getNome());
		aluno.setTia(alunoDTO.getTia());
		alunoDAO.excluir(aluno);		
	}
}