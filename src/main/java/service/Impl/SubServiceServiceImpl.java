package service.Impl;

import model.SubService;
import repository.SubServiceRepository;
import service.SubServiceService;
import util.ApplicationContext;
import util.EntityManagerSingleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import java.util.List;

public class SubServiceServiceImpl implements SubServiceService {

    private final SubServiceRepository subServiceRepository = ApplicationContext.subServiceRepository;
    private final EntityManager entityManager = EntityManagerSingleton.getInstanceEM();

    @Override
    public SubService create(SubService subService) {
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

            subServiceRepository.create(subService);

            entityTransaction.commit();
            return subService;
        } catch (PersistenceException | IllegalStateException e) {

            entityTransaction.rollback();
            return null;
        }
    }

    @Override
    public SubService update(SubService subService) {
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

            subServiceRepository.update(subService);

            entityTransaction.commit();
            return subService;
        } catch (PersistenceException | IllegalStateException e) {

            entityTransaction.rollback();
            return null;
        }
    }

    @Override
    public void delete(SubService subService) {
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

            subServiceRepository.delete(subService);

            entityTransaction.commit();
        } catch (PersistenceException | IllegalStateException e) {

            entityTransaction.rollback();
        }
    }

    @Override
    public SubService findById(Long id) {
        return null;
    }

    @Override
    public List<SubService> findAll() {
        return null;
    }
}
