package repository.impl;

import model.Expert;
import util.EntityManagerSingleton;

import javax.persistence.EntityManager;
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
        return null;
    }
}
