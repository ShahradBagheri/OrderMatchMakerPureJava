package repository;

import model.MainService;

import java.util.List;

public interface MainServiceRepository {

    MainService create(MainService mainService);

    MainService update(MainService mainService);

    void delete(MainService mainService);

    MainService findById(Long id);

    List<MainService> findAll();
}
