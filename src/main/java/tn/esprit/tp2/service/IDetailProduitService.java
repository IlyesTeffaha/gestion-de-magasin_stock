package tn.esprit.tp2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.tp2.entity.DetailProduit;

public interface IDetailProduitService {
	List<DetailProduit> retrieveAllDetailProduits();
	Long  addDetailProduit(DetailProduit u);
	void deleteDetailProduit(Long id);
	DetailProduit updateDetailProduit(DetailProduit u);
	DetailProduit retrieveDetailProduit(Long id);

}
