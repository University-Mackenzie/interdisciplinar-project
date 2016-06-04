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
}