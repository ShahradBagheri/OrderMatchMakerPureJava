package repository.impl;

import model.Expert;
import model.MainService;
import repository.ExpertRepository;
import repository.MainServiceRepository;
import util.EntityManagerSingleton;

import javax.persistence.EntityManager;
import java.util.List;

public class MainServiceImpl implements MainServiceRepository {

    private final EntityManager entityManager = EntityManagerSingleton.getInstanceEM();

    @Override
    public MainService create(MainService mainService) {
        return null;
    }

    @Override
    public MainService update(MainService mainService) {
        return null;
    }

    @Override
    public void delete(MainService mainService) {

    }

    @Override
    public MainService findById(Long id) {
        return null;
    }

    @Override
    public List<MainService> findAll() {
        return null;
    }
}
