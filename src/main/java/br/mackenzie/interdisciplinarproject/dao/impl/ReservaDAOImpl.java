package br.mackenzie.interdisciplinarproject.dao.impl;

import org.springframework.stereotype.Repository;

import br.mackenzie.interdisciplinarproject.dao.ReservaDAO;
import br.mackenzie.interdisciplinarproject.model.Reserva;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
@Repository
public class ReservaDAOImpl extends GenericDAOImpl<Reserva, Long> implements ReservaDAO {}