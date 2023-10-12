package service.Impl;

import model.Expert;
import model.MainService;
import repository.MainServiceRepository;
import service.MainServiceService;
import util.ApplicationContext;
import util.EntityManagerSingleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import java.util.List;

public class MainServiceServiceImpl implements MainServiceService {

    private final EntityManager entityManager = EntityManagerSingleton.getInstanceEM();
    private final MainServiceRepository mainServiceRepository = ApplicationContext.mainServiceRepository;

    @Override
    public MainService create(MainService mainService) {

        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

            mainServiceRepository.create(mainService);

            entityTransaction.commit();
            return mainService;
        } catch (PersistenceException | IllegalStateException e) {

            entityTransaction.rollback();
            return null;
        }
    }

    @Override
    public MainService update(MainService mainService) {

        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

            mainServiceRepository.update(mainService);

            entityTransaction.commit();
            return mainService;
        } catch (PersistenceException | IllegalStateException e) {

            entityTransaction.rollback();
            return null;
        }
    }

    @Override
    public void delete(MainService mainService) {

        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

            mainServiceRepository.delete(mainService);

            entityTransaction.commit();
        } catch (PersistenceException | IllegalStateException e) {

            entityTransaction.rollback();
        }
    }

    @Override
    public MainService findById(Long id) {

        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

            MainService mainService = mainServiceRepository.findById(id);

            entityTransaction.commit();
            return mainService;

        } catch (PersistenceException | IllegalStateException e) {

            entityTransaction.rollback();
            return null;
        }
    }

    @Override
    public List<MainService> findAll() {

        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

            List<MainService> mainServices = mainServiceRepository.findAll();

            entityTransaction.commit();
            return mainServices;

        } catch (PersistenceException | IllegalStateException e) {

            entityTransaction.rollback();
            return null;
        }
    }
}
