package br.mackenzie.interdisciplinarproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.mackenzie.interdisciplinarproject.dao.SalaDAO;
import br.mackenzie.interdisciplinarproject.model.Sala;
import br.mackenzie.interdisciplinarproject.service.SalaService;

@Service
@Transactional
public class SalaServiceImpl implements SalaService{

	@Autowired
	private SalaDAO salaDAO;
	
	@Override
	public List<Sala> listarSalas() {
		return salaDAO.listar();
	}
}