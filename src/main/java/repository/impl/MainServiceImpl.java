package repository.impl;

import model.Expert;
import model.MainService;
import repository.ExpertRepository;
import repository.MainServiceRepository;
import util.EntityManagerSingleton;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class MainServiceImpl implements MainServiceRepository {

    private final EntityManager entityManager = EntityManagerSingleton.getInstanceEM();

    @Override
    public MainService create(MainService mainService) {
        entityManager.persist(mainService);
        return mainService;
    }

    @Override
    public MainService update(MainService mainService) {
        entityManager.merge(mainService);
        return mainService;
    }

    @Override
    public void delete(MainService mainService) {
        entityManager.remove(mainService);
    }

    @Override
    public MainService findById(Long id) {
        return entityManager.find(MainService.class,id);
    }

    @Override
    public List<MainService> findAll() {
        String jpql = "SELECT m FROM MainService m";
        TypedQuery<MainService> typedQuery = entityManager.createQuery(jpql, MainService.class);
        return typedQuery.getResultList();
    }
}
