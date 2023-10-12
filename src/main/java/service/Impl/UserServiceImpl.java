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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserServiceImpl implements UserService {

    EntityManager entityManager = EntityManagerSingleton.getInstanceEM();
    UserRepository userRepository = ApplicationContext.userRepository;

    @Override
    public User signIn(String email, String password) {
        try {
            User user = userRepository.findByEmail(email);
            if (Objects.equals(user.getPassword(), password)) {
                return user;
            }
        } catch (PersistenceException | IllegalStateException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    @Override
    public boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }

    @Override
    public boolean isValidPassword(String password) {
        String regex = "^(?=.*[a-zA-Z])(?=.*\\d).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }
}