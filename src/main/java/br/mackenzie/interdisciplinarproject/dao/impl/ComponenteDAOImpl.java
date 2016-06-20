package br.mackenzie.interdisciplinarproject.dao.impl;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.mackenzie.interdisciplinarproject.dao.ComponenteDAO;
import br.mackenzie.interdisciplinarproject.model.Componente;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
@Repository
public class ComponenteDAOImpl extends GenericDAOImpl<Componente, Long> implements ComponenteDAO {
	
	@Override
	public Componente buscarComponentePorNome(String nome) {
		StringBuilder sql = new StringBuilder();
        sql.append("SELECT c from Componente c ");
        sql.append("WHERE c.nome like :nome");
        TypedQuery<Componente> query = this.entityManager.createQuery(sql.toString(), Componente.class);
        query.setParameter("nome", nome);

        try {
            return query.getSingleResult();
        } catch (NoResultException ex) {
            System.out.println("Componente " + nome + " nao cadastrado.");
            return null;
        }
	}
}