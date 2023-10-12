package repository.impl;

import model.User;
import repository.UserRepository;
import util.EntityManagerSingleton;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class UserRepositoryImpl implements UserRepository {

    private final EntityManager entityManager = EntityManagerSingleton.getInstanceEM();

    @Override
    public User findByEmail(String email) {
        String hql = "SELECT u FROM users u WHERE u.email = :email";
        TypedQuery<User> typedQuery = entityManager.createQuery(hql, User.class);
        typedQuery.setParameter("email",email);
        return typedQuery.getSingleResult();
    }
}
