package service;

import model.Expert;
import model.User;

import java.util.List;

public interface ExpertService {

    Expert create(Expert expert);

    Expert update(Expert expert);

    void delete(Expert expert);

    Expert findById(Long id);

    List<Expert> findAll();

    Expert findByUser(User user);

    Expert changePassword(Expert expert,String password);
}
