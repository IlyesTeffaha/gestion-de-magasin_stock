package tn.esprit.tp2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.tp2.entity.Stock;
@Repository
public interface StockRepository extends CrudRepository <Stock,Long>{
	Iterable<Stock> findAll();
}
