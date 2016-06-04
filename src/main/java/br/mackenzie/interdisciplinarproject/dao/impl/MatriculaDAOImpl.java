package br.mackenzie.interdisciplinarproject.dao.impl;

import org.springframework.stereotype.Repository;

import br.mackenzie.interdisciplinarproject.dao.MatriculaDAO;
import br.mackenzie.interdisciplinarproject.model.Matricula;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
@Repository
public class MatriculaDAOImpl extends GenericDAOImpl<Matricula, Long> implements MatriculaDAO {}