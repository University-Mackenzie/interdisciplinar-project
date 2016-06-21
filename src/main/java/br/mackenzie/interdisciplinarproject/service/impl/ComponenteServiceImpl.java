package br.mackenzie.interdisciplinarproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.mackenzie.interdisciplinarproject.dao.ComponenteDAO;
import br.mackenzie.interdisciplinarproject.dto.ComponenteDTO;
import br.mackenzie.interdisciplinarproject.model.Componente;
import br.mackenzie.interdisciplinarproject.service.ComponenteService;

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
	public void inserirComponente(ComponenteDTO componenteDTO) {
		Componente componente = new Componente();
		componente.setNome(componenteDTO.getNome());
		componente.setCodigo(componenteDTO.getCodigo());
		componente.setImg_path(componenteDTO.getImg_path());
		componente.setTia_fk(componenteDTO.getTia_fk());
		componente.setDescricao(componenteDTO.getDescricao());
		componenteDAO.incluir(componente);
	}
	
	@Override
	public void atualizarComponente(ComponenteDTO componenteDTO) {
			Componente componente = new Componente();
			componente.setNome(componenteDTO.getNome());
			componente.setCodigo(componenteDTO.getCodigo());
			componente.setImg_path(componenteDTO.getImg_path());
			componente.setTia_fk(componenteDTO.getTia_fk());
			componente.setDescricao(componenteDTO.getDescricao());
		componenteDAO.incluir(componente);
	}
	
	@Override
	public void deletarComponente(ComponenteDTO componenteDTO) {
		Componente componente = new Componente();
		componente.setNome(componenteDTO.getNome());
		componente.setCodigo(componenteDTO.getCodigo());
		componente.setImg_path(componenteDTO.getImg_path());
		componente.setTia_fk(componenteDTO.getTia_fk());
		componente.setDescricao(componenteDTO.getDescricao());
		componenteDAO.incluir(componente);
	}
	
	public Componente buscarComponente(String nome){
		return componenteDAO.buscarComponentePorNome(nome);
	}
}