package service;

import model.Expert;
import model.SubService;

import java.util.List;

public interface SubServiceService {

    SubService create(SubService subService);

    SubService update(SubService subService);

    void delete(SubService subService);

    SubService findById(Long id);

    List<SubService> findAll();

    void addExpert(SubService subService, Expert expert);
}
