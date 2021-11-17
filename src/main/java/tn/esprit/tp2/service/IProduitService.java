package tn.esprit.tp2.service;
import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.tp2.entity.Produit;



public interface IProduitService {
	List<Produit> retrieveAllProduits();
	Long addProduit(Produit p, Long idRayon, Long idStock);
	Produit retrieveProduit(Long id);

}
