package service;

import model.Expert;

import java.util.List;

public interface ExpertService {

    Expert create(Expert expert);

    Expert update(Expert expert);

    void delete(Expert expert);

    Expert findById(Long id);

    List<Expert> findAll();

    Expert changePassword(Expert expert,String password);
}
