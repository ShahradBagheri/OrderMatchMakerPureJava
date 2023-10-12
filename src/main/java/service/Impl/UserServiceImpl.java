package service.Impl;

import model.User;
import repository.UserRepository;
import service.UserService;
import util.ApplicationContext;
import util.EntityManagerSingleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import java.util.Objects;

public class UserServiceImpl implements UserService {

    EntityManager entityManager = EntityManagerSingleton.getInstanceEM();
    UserRepository userRepository = ApplicationContext.userRepository;

    @Override
    public User signIn(String username, String password) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        try {
            entityTransaction.begin();

            User user = userRepository.findByUsername(username);
            entityTransaction.commit();
            if (Objects.equals(user.getPassword(), password)) {
                return user;
            }
        } catch (PersistenceException | IllegalStateException e) {
            entityTransaction.rollback();
        }
        return null;
    }
}