package br.mackenzie.interdisciplinarproject.dao.impl;

import org.springframework.stereotype.Repository;

import br.mackenzie.interdisciplinarproject.dao.ComponenteDAO;
import br.mackenzie.interdisciplinarproject.model.Componente;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
@Repository
public class ComponenteDAOImpl extends GenericDAOImpl<Componente, Long> implements ComponenteDAO {}