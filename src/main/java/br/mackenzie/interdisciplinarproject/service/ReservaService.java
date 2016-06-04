package br.mackenzie.interdisciplinarproject.service;

import java.util.List;

import br.mackenzie.interdisciplinarproject.model.Reserva;

public interface ReservaService {
	
	/**
	 * Retorna lista de Reservas
	 * @return
	 */
	List<Reserva> listarReservas();
}