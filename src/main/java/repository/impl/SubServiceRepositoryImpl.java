package repository.impl;

import model.SubService;
import repository.SubServiceRepository;
import util.EntityManagerSingleton;

import javax.persistence.EntityManager;
import java.util.List;

public class SubServiceRepositoryImpl implements SubServiceRepository {

    private final EntityManager entityManager = EntityManagerSingleton.getInstanceEM();

    @Override
    public SubService create(SubService subService) {
        return null;
    }

    @Override
    public SubService update(SubService subService) {
        return null;
    }

    @Override
    public void delete(SubService subService) {

    }

    @Override
    public SubService findById(SubService id) {
        return null;
    }

    @Override
    public List<SubService> findAll() {
        return null;
    }
}
