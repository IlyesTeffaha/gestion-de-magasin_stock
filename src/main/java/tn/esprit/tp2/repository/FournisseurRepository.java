package tn.esprit.tp2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.tp2.entity.Fournisseur;
@Repository
public interface FournisseurRepository extends CrudRepository <Fournisseur,Long>{
	Iterable<Fournisseur> findAll();
}
