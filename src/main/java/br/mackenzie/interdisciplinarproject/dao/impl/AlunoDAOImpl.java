package br.mackenzie.interdisciplinarproject.dao.impl;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.mackenzie.interdisciplinarproject.dao.AlunoDAO;
import br.mackenzie.interdisciplinarproject.model.Aluno;

/**
 * 
 * @author jonyfernandoschulz
 *
 */
@Repository
public class AlunoDAOImpl extends GenericDAOImpl<Aluno, Long> implements AlunoDAO {

	@Override
	public Aluno buscarAlunoPorNome(String nome) {
		StringBuilder sql = new StringBuilder();
        sql.append("SELECT c from Aluno c ");
        sql.append("WHERE c.nome like :nome");
        TypedQuery<Aluno> query = this.entityManager.createQuery(sql.toString(), Aluno.class);
        query.setParameter("nome", nome);

        try {
            return query.getSingleResult();
        } catch (NoResultException ex) {
            System.out.println("Aluno " + nome + " nao cadastrado.");
            return null;
        }
	}
}