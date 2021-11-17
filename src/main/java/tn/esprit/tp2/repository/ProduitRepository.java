package tn.esprit.tp2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.tp2.entity.Produit;

@Repository

public interface ProduitRepository extends CrudRepository <Produit,Long> {
	Iterable<Produit> findAll();
}