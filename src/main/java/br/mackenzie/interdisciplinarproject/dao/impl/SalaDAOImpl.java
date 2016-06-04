package br.mackenzie.interdisciplinarproject.dao.impl;

import org.springframework.stereotype.Repository;

import br.mackenzie.interdisciplinarproject.dao.SalaDAO;
import br.mackenzie.interdisciplinarproject.model.Sala;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
@Repository
public class SalaDAOImpl extends GenericDAOImpl<Sala, Long> implements SalaDAO {}