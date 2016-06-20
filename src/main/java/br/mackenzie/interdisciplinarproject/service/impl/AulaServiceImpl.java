package br.mackenzie.interdisciplinarproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.mackenzie.interdisciplinarproject.dao.AulaDAO;
import br.mackenzie.interdisciplinarproject.model.Aula;
import br.mackenzie.interdisciplinarproject.service.AulaService;

@Service
@Transactional
public class AulaServiceImpl implements AulaService{

	@Autowired
	private AulaDAO aulaDAO;
	
	@Override
	public List<Aula> listarAulas() {
		return aulaDAO.listar();
	}

	@Override
	public void inserirAula(Aula aula) { 
		aulaDAO.incluir(aula);
		
	}

	@Override
	public void deletarAula(Aula aula) {
		aulaDAO.excluir(aula);
		
	}

	@Override
	public void atualizarAula(Aula aula) {
		aulaDAO.atualizar(aula);
	}

	@Override
	public Aula AulaPorId(int id) {
		return aulaDAO.buscarAlunoPorId(id);
	}
}