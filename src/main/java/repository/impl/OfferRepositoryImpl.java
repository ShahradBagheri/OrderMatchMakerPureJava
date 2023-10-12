package repository.impl;

import model.Offer;
import repository.OfferRepository;
import util.EntityManagerSingleton;

import javax.persistence.EntityManager;
import java.util.List;

public class OfferRepositoryImpl implements OfferRepository {

    private final EntityManager entityManager = EntityManagerSingleton.getInstanceEM();

    @Override
    public Offer create(Offer offer) {
        return null;
    }

    @Override
    public Offer update(Offer offer) {
        return null;
    }

    @Override
    public void delete(Offer offer) {

    }

    @Override
    public Offer findById(Long id) {
        return null;
    }

    @Override
    public List<Offer> findAll() {
        return null;
    }
}
