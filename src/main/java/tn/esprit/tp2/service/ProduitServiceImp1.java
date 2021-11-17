package tn.esprit.tp2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.tp2.entity.Produit;
import tn.esprit.tp2.repository.ProduitRepository;
@Service
public class ProduitServiceImp1 implements IProduitService{
	@Autowired
	ProduitRepository produitRepository;

	@Override
	public List<Produit> retrieveAllProduits() {
		List<Produit> produits = (List<Produit>) produitRepository.findAll();
		
		for(Produit produit : produits){
	System.out.println("produit +++ :" +produit);
		}
		
		return produits;
	
	}

	@Override
	public Long addProduit(Produit p, Long idRayon, Long idStock) {
		
		produitRepository.save(p);
		 return p.getIdProduit();
	}

	
	@Override
	public Produit retrieveProduit(Long id) {
		Produit produit = produitRepository.findById(id).get();
		return produit;
		
	}
	
	
	
	

	
}