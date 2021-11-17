package tn.esprit.tp2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.tp2.entity.Client;
import tn.esprit.tp2.entity.Produit;
import tn.esprit.tp2.entity.Stock;
import tn.esprit.tp2.repository.ClientRepository;
import tn.esprit.tp2.repository.StockRepository;
@Service
public class StockServiceImp1 implements IStockService{
	
	@Autowired
	StockRepository stockRepository;

	@Override
	public List<Stock> retrieveAllStocks() {
		List<Stock> stocks = (List<Stock>) stockRepository.findAll();
	
	for(Stock stock : stocks){
System.out.println("stocks +++ :" +stock);
	}
	
	return stocks;
}

	@Override
	public Long addStock(Stock s) {
		stockRepository.save(s);
		 return s.getIdStock();
	}

	@Override
	public Stock updateStock(Stock s) {
		return stockRepository.save(s);
	}

	@Override
	public Stock retrieveStock(Long id) {
		Stock stock = stockRepository.findById(id).get();
		return stock;
	}

}
