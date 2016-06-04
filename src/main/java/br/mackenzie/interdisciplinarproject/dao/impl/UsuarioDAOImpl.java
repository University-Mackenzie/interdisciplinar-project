package br.mackenzie.interdisciplinarproject.dao.impl;

import org.springframework.stereotype.Repository;

import br.mackenzie.interdisciplinarproject.dao.UsuarioDAO;
import br.mackenzie.interdisciplinarproject.model.Usuario;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
@Repository
public class UsuarioDAOImpl extends GenericDAOImpl<Usuario, Long> implements UsuarioDAO {}