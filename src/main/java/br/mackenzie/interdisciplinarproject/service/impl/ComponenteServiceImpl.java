package br.mackenzie.interdisciplinarproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.mackenzie.interdisciplinarproject.dao.ComponenteDAO;
import br.mackenzie.interdisciplinarproject.model.Componente;
import br.mackenzie.interdisciplinarproject.service.ComponenteService;

@Service
@Transactional
public class ComponenteServiceImpl implements ComponenteService{

	@Autowired
	private ComponenteDAO componenteDAO;
	
	@Override
	public List<Componente> listarComponentes() {
		return componenteDAO.listar();
	}
}