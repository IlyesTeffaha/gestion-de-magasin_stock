package tn.esprit.tp2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.tp2.entity.Fournisseur;



public interface IFournisseurService {
	List<Fournisseur> retrieveAllFournisseurs();
	Long  addFournisseur(Fournisseur u);
	void deleteFournisseur(Long id);
	Fournisseur updateFournisseur(Fournisseur u);
	Fournisseur retrieveFournisseur(Long id);

}
