package service;

import model.User;

public interface UserService {

    User signIn(String email, String password);

    boolean isValidEmail(String email);

    boolean isValidPassword(String password);
}
