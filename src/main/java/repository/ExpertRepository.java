package repository;

import model.Expert;

import java.util.List;

public interface ExpertRepository {

    Expert create(Expert expert);

    Expert update(Expert expert);

    void delete(Expert expert);

    Expert findById(Long id);

    List<Expert> findAll();
}
