package br.mackenzie.interdisciplinarproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.mackenzie.interdisciplinarproject.dao.ComponenteDAO;
import br.mackenzie.interdisciplinarproject.dto.ComponenteDTO;
import br.mackenzie.interdisciplinarproject.model.Componente;
import br.mackenzie.interdisciplinarproject.model.Usuario;
import br.mackenzie.interdisciplinarproject.service.ComponenteService;
import br.mackenzie.interdisciplinarproject.util.DTOUtil;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
@Service
@Transactional
public class ComponenteServiceImpl implements ComponenteService {

	@Autowired
	private ComponenteDAO componenteDAO;

	@Override
	public List<Componente> listarComponentes() {
		return componenteDAO.listar();
	}

	@Override
	public void inserirComponente(Usuario usuario, ComponenteDTO componenteDTO) {

		Componente componente = new Componente();
		DTOUtil.copiarPropriedades(componente, componenteDTO, DTOUtil.obterNomesAtributos(ComponenteDTO.class));
		componenteDAO.incluir(componente);
	}
}