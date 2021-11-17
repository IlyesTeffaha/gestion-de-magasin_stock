package tn.esprit.tp2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.tp2.entity.Facture;

import tn.esprit.tp2.repository.FactureRepository;

@Service
public class FactureServiceImp1 implements IFactureService{
	@Autowired
	FactureRepository factureRepository;

	@Override
	public List<Facture> retrieveAllFactures() {
		List<Facture> factures = (List<Facture>) factureRepository.findAll() ;
		
		for(Facture facture : factures){
	System.out.println("factures +++ :" +facture);
		}
		
		return factures;
	}

	@Override
	public void cancelFacture(Long id) {
		Facture a=factureRepository.findById(id).get();
		a.setActive(false);
		factureRepository.save(a);
	}

	@Override
	public Facture retrieveFacture(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
