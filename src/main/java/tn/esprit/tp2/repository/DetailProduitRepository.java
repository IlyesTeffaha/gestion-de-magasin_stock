package tn.esprit.tp2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.tp2.entity.DetailProduit;
@Repository
public interface DetailProduitRepository extends CrudRepository <DetailProduit,Long> {

}
