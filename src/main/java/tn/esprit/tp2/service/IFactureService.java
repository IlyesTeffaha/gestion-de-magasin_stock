package tn.esprit.tp2.service;

import java.util.List;

import tn.esprit.tp2.entity.Facture;

public interface IFactureService {
	List<Facture> retrieveAllFactures();
	void cancelFacture(Long id);
	Facture retrieveFacture(Long id);


}
