package service;

import model.User;

public interface UserService {

    User signIn(String username, String password);

    boolean isValidEmail(String email);
}
