package repository;

import model.Offer;

import java.util.List;

public interface OfferRepository {

    Offer create(Offer offer);

    Offer update(Offer offer);

    void delete(Offer offer);

    Offer findById(Long id);

    List<Offer> findAll();
}
