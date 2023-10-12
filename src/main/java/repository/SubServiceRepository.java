package repository;

import model.SubService;

import java.util.List;

public interface SubServiceRepository {

    SubService create(SubService subService);

    SubService update(SubService subService);

    void delete(SubService subService);

    SubService findById(SubService id);

    List<SubService> findAll();
}
