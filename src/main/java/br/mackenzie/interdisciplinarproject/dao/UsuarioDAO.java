package br.mackenzie.interdisciplinarproject.dao;

import br.mackenzie.interdisciplinarproject.model.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario, Long> {

	Usuario buscarUsuarioPorNome(String nome);
}
