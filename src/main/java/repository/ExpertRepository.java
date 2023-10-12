package repository;

import model.Customer;
import model.Expert;
import model.User;

import java.util.List;

public interface ExpertRepository {

    Expert create(Expert expert);

    Expert update(Expert expert);

    void delete(Expert expert);

    Expert findById(Long id);

    List<Expert> findAll();

    Customer findByUser(User user);
}
