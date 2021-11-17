package tn.esprit.tp2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.tp2.entity.Facture;
@Repository
public interface FactureRepository extends CrudRepository <Facture,Long>{
	Iterable<Facture> findAll();
}
