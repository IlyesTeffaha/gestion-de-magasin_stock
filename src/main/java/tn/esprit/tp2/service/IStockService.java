package tn.esprit.tp2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.tp2.entity.Stock;


public interface IStockService {
	List<Stock> retrieveAllStocks();
	Long addStock(Stock s);
	Stock updateStock(Stock u);
	Stock retrieveStock(Long id);

}
