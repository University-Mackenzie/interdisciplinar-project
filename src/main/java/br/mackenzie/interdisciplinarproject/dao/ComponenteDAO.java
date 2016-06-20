package br.mackenzie.interdisciplinarproject.dao;

import br.mackenzie.interdisciplinarproject.model.Componente;

public interface ComponenteDAO extends GenericDAO<Componente, Long> {

	Componente buscarComponentePorNome(String nome);
}
