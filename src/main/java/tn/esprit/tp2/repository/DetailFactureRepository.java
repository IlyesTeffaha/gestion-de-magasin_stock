package tn.esprit.tp2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.tp2.entity.DetailFacture;
@Repository
public interface DetailFactureRepository extends CrudRepository <DetailFacture,Long>{

}
