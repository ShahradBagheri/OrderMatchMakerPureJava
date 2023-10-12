package service.Impl;

import model.Customer;
import model.Expert;
import repository.ExpertRepository;
import service.ExpertService;
import util.ApplicationContext;
import util.EntityManagerSingleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import java.util.List;

public class ExpertServiceImpl implements ExpertService {

    private final ExpertRepository expertRepository = ApplicationContext.expertRepository;
    private final EntityManager entityManager = EntityManagerSingleton.getInstanceEM();

    @Override
    public Expert create(Expert expert) {

        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

            expertRepository.create(expert);

            entityTransaction.commit();
            return expert;
        } catch (PersistenceException | IllegalStateException e) {

            entityTransaction.rollback();
            return null;
        }
    }

    @Override
    public Expert update(Expert expert) {

        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

            expertRepository.update(expert);

            entityTransaction.commit();
            return expert;
        } catch (PersistenceException | IllegalStateException e) {

            entityTransaction.rollback();
            return null;
        }
    }

    @Override
    public void delete(Expert expert) {

        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

            expertRepository.delete(expert);

            entityTransaction.commit();
        } catch (PersistenceException | IllegalStateException e) {

            entityTransaction.rollback();
        }
    }

    @Override
    public Expert findById(Long id) {

        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

            Expert expert = expertRepository.findById(id);

            entityTransaction.commit();
            return expert;

        } catch (PersistenceException | IllegalStateException e) {

            entityTransaction.rollback();
            return null;
        }
    }

    @Override
    public List<Expert> findAll() {

        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

            List<Expert> experts = expertRepository.findAll();

            entityTransaction.commit();
            return experts;

        } catch (PersistenceException | IllegalStateException e) {

            entityTransaction.rollback();
            return null;
        }
    }

    @Override
    public Expert changePassword(Expert expert, String password) {
        return null;
    }
}
