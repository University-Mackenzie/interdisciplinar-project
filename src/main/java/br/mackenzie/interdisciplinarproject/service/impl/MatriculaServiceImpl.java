package br.mackenzie.interdisciplinarproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.mackenzie.interdisciplinarproject.dao.MatriculaDAO;
import br.mackenzie.interdisciplinarproject.model.Matricula;
import br.mackenzie.interdisciplinarproject.service.MatriculaService;

@Service
@Transactional
public class MatriculaServiceImpl implements MatriculaService{

	@Autowired
	private MatriculaDAO matriculaDAO;
	
	@Override
	public List<Matricula> listarMatriculas() {
		return matriculaDAO.listar();
	}
}