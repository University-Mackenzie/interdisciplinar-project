package br.mackenzie.interdisciplinarproject.dao.impl;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.mackenzie.interdisciplinarproject.dao.UsuarioDAO;
import br.mackenzie.interdisciplinarproject.model.Usuario;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
@Repository
public class UsuarioDAOImpl extends GenericDAOImpl<Usuario, Long> implements UsuarioDAO {
	
	@Override
	public Usuario buscarUsuarioPorNome(String nome) {
		StringBuilder sql = new StringBuilder();
        sql.append("SELECT c from Usuario c ");
        sql.append("WHERE c.nome like :nome");
        TypedQuery<Usuario> query = this.entityManager.createQuery(sql.toString(), Usuario.class);
        query.setParameter("nome", nome);

        try {
            return query.getSingleResult();
        } catch (NoResultException ex) {
            System.out.println("Usuario " + nome + " nao cadastrado.");
            return null;
        }
	}
}