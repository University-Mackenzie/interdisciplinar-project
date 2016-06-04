package br.mackenzie.interdisciplinarproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.mackenzie.interdisciplinarproject.dao.ChamadaDAO;
import br.mackenzie.interdisciplinarproject.model.Chamada;
import br.mackenzie.interdisciplinarproject.service.ChamadaService;

@Service
@Transactional
public class ChamadaServiceImpl implements ChamadaService{

	@Autowired
	private ChamadaDAO chamadaDAO;
	
	@Override
	public List<Chamada> listarChamadas() {
		return chamadaDAO.listar();
	}
}