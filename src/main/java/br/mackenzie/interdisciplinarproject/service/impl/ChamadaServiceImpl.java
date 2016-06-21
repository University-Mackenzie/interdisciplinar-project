package br.mackenzie.interdisciplinarproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.mackenzie.interdisciplinarproject.dao.ChamadaDAO;
import br.mackenzie.interdisciplinarproject.dto.ChamadaDTO;
import br.mackenzie.interdisciplinarproject.model.Chamada;
import br.mackenzie.interdisciplinarproject.service.ChamadaService;

@Service
@Transactional
public class ChamadaServiceImpl implements ChamadaService {

	@Autowired
	private ChamadaDAO chamadaDAO;

	@Override
	public List<Chamada> listarChamadas() {
		return chamadaDAO.listar();
	}

	@Override
	public void inserirChamada(ChamadaDTO chamadaDTO) {
		Chamada chamada = new Chamada();
		chamada.setPresenca(chamadaDTO.getPresenca());
		chamada.setTia_aluno(chamadaDTO.getTia());
		chamadaDAO.incluir(chamada);
	}

	@Override
	public void atualizarChamada(ChamadaDTO chamadaDTO) {
		Chamada chamada = new Chamada();
		chamada.setPresenca(chamadaDTO.getPresenca());
		chamada.setTia_aluno(chamadaDTO.getTia());
		chamada.setId_aula(chamadaDTO.getIdAula());
		chamadaDAO.atualizar(chamada);
	}

	@Override
	public void deletarChamada(ChamadaDTO chamadaDTO) {
		Chamada chamada = new Chamada();
		chamada.setPresenca(chamadaDTO.getPresenca());
		chamada.setTia_aluno(chamadaDTO.getTia());
		chamada.setId_aula(chamadaDTO.getIdAula());
		chamadaDAO.excluir(chamada);
	}

}