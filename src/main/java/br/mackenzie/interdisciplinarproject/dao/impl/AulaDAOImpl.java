package br.mackenzie.interdisciplinarproject.dao.impl;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.mackenzie.interdisciplinarproject.dao.AulaDAO;
import br.mackenzie.interdisciplinarproject.model.Aula;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
@Repository
public class AulaDAOImpl extends GenericDAOImpl<Aula, Long> implements AulaDAO {

	@Override
	public Aula buscarAlunoPorId(int id) {
		StringBuilder sql = new StringBuilder();
        sql.append("SELECT c from Aula c ");
        sql.append("WHERE c.id like :id_aula");
        TypedQuery<Aula> query = this.entityManager.createQuery(sql.toString(), Aula.class);
        query.setParameter("id", id);

        try {
            return query.getSingleResult();
        } catch (NoResultException ex) {
            System.out.println("Aula " + id + " nao cadastrada.");
            return null;
        }
	}
	
	
	



}