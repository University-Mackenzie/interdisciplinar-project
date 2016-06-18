package br.mackenzie.interdisciplinarproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.mackenzie.interdisciplinarproject.dao.AlunoDAO;
import br.mackenzie.interdisciplinarproject.dto.AlunoDTO;
import br.mackenzie.interdisciplinarproject.model.Aluno;
import br.mackenzie.interdisciplinarproject.service.AlunoService;
import br.mackenzie.interdisciplinarproject.util.DTOUtil;

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
		//DTOUtil.copiarPropriedades(aluno, alunoDTO, DTOUtil.obterNomesAtributos(AlunoDTO.class));
		aluno.setEmail(alunoDTO.getEmail());
		aluno.setNome(alunoDTO.getNome());
		alunoDAO.incluir(aluno);
	}
}