package repository.impl;

import model.Customer;
import model.Expert;
import util.EntityManagerSingleton;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class ExpertRepositoryImpl implements repository.ExpertRepository {

    private final EntityManager entityManager = EntityManagerSingleton.getInstanceEM();

    @Override
    public Expert create(Expert expert) {
        entityManager.persist(expert);
        return expert;
    }

    @Override
    public Expert update(Expert expert) {
        entityManager.merge(expert);
        return expert;
    }

    @Override
    public void delete(Expert expert) {
        entityManager.remove(expert);
    }

    @Override
    public Expert findById(Long id) {
        return entityManager.find(Expert.class,id);
    }

    @Override
    public List<Expert> findAll() {
        String jpql = "SELECT e FROM Expert e";
        TypedQuery<Expert> typedQuery = entityManager.createQuery(jpql, Expert.class);
        return typedQuery.getResultList();
    }

    @Override
    public Customer findByEmail(String username) {
        String hql = "SELECT c FROM Customer c WHERE c.user.email = :username";
        TypedQuery<Customer> typedQuery = entityManager.createQuery(hql, Customer.class);
        typedQuery.setParameter("username",username);
        return typedQuery.getSingleResult();
    }
}
