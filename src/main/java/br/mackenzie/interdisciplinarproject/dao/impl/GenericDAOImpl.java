package br.mackenzie.interdisciplinarproject.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.mackenzie.interdisciplinarproject.dao.GenericDAO;

/**
 * 
 * @author jony.fernando.schulz
 *
 * @param <T>
 * @param <PK>
 */
@Repository
public abstract class GenericDAOImpl<T, PK extends Serializable> implements GenericDAO<T, PK> {

    private Class<T> persistentClass;

    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public T buscarPorChave(PK chave) {
        return this.entityManager.find(getPersistentClass(), chave);
    }

    @Override
    public List<T> listar() {
        Class<T> clazz = getPersistentClass();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT entity FROM " + clazz.getSimpleName() + " entity");
        Query q = this.entityManager.createQuery(sql.toString(), clazz);
        return q.getResultList();
    }

    @Override
    public void incluir(T entidade) {
        this.entityManager.persist(entidade);
        this.entityManager.flush();
    }

    @Override
    public void excluir(T entidade) {
        this.entityManager.remove(entityManager.merge(entidade));
        this.entityManager.flush();
    }

    @Override
    public void atualizar(T entidade) {
        this.entityManager.merge(entidade);
        this.entityManager.flush();
    }

    private Class<T> getPersistentClass() {
        if (this.persistentClass == null) {
            this.persistentClass = (Class<T>) ((ParameterizedType) getClass()
                    .getGenericSuperclass()).getActualTypeArguments()[0];
        }
        return this.persistentClass;
    }
}