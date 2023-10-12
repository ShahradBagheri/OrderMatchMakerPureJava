package repository.impl;

import model.MainService;
import model.Offer;
import repository.OfferRepository;
import util.EntityManagerSingleton;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class OfferRepositoryImpl implements OfferRepository {

    private final EntityManager entityManager = EntityManagerSingleton.getInstanceEM();

    @Override
    public Offer create(Offer offer) {
        entityManager.persist(offer);
        return offer;
    }

    @Override
    public Offer update(Offer offer) {
        entityManager.merge(offer);
        return offer;
    }

    @Override
    public void delete(Offer offer) {
        entityManager.remove(offer);
    }

    @Override
    public Offer findById(Long id) {
        return entityManager.find(Offer.class,id);
    }

    @Override
    public List<Offer> findAll() {
        String jpql = "SELECT o FROM Offer o";
        TypedQuery<Offer> typedQuery = entityManager.createQuery(jpql, Offer.class);
        return typedQuery.getResultList();
    }
}
