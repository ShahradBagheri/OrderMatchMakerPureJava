package service.Impl;

import model.Expert;
import model.MainService;
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

        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

            SubService subService = subServiceRepository.findById(id);

            entityTransaction.commit();
            return subService;

        } catch (PersistenceException | IllegalStateException e) {

            entityTransaction.rollback();
            return null;
        }
    }

    @Override
    public List<SubService> findAll() {
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

            List<SubService> subServices = subServiceRepository.findAll();

            entityTransaction.commit();
            return subServices;

        } catch (PersistenceException | IllegalStateException e) {

            entityTransaction.rollback();
            return null;
        }
    }

    @Override
    public void addExpert(SubService subService, Expert expert) {

        EntityTransaction entityTransaction = entityManager.getTransaction();
        subService.getExperts().add(expert);

        try {
            entityTransaction.begin();

            subServiceRepository.update(subService);

            entityTransaction.commit();
        } catch (PersistenceException | IllegalStateException e) {

            entityTransaction.rollback();
        }
    }
}
