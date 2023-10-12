package repository.impl;

import model.Order;
import model.SubService;
import repository.SubServiceRepository;
import util.EntityManagerSingleton;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class SubServiceRepositoryImpl implements SubServiceRepository {

    private final EntityManager entityManager = EntityManagerSingleton.getInstanceEM();

    @Override
    public SubService create(SubService subService) {
        entityManager.persist(subService);
        return subService;
    }

    @Override
    public SubService update(SubService subService) {
        entityManager.merge(subService);
        return subService;
    }

    @Override
    public void delete(SubService subService) {
        entityManager.remove(subService);
    }

    @Override
    public SubService findById(Long id) {
        return entityManager.find(SubService.class,id);
    }

    @Override
    public List<SubService> findAll() {
        String jpql = "SELECT s FROM SubService s";
        TypedQuery<SubService> typedQuery = entityManager.createQuery(jpql, SubService.class);
        return typedQuery.getResultList();
    }
}
