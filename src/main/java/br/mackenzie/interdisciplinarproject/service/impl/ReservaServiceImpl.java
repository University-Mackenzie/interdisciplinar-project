package br.mackenzie.interdisciplinarproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.mackenzie.interdisciplinarproject.dao.ReservaDAO;
import br.mackenzie.interdisciplinarproject.model.Reserva;
import br.mackenzie.interdisciplinarproject.service.ReservaService;

@Service
@Transactional
public class ReservaServiceImpl implements ReservaService {

	@Autowired
	private ReservaDAO reservaDAO;
	
	@Override
	public List<Reserva> listarReservas() {
		return reservaDAO.listar();
	}
}