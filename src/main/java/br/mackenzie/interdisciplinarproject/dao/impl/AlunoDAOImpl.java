package br.mackenzie.interdisciplinarproject.dao.impl;

import org.springframework.stereotype.Repository;

import br.mackenzie.interdisciplinarproject.dao.AlunoDAO;
import br.mackenzie.interdisciplinarproject.model.Aluno;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
@Repository
public class AlunoDAOImpl extends GenericDAOImpl<Aluno, Long> implements AlunoDAO {}