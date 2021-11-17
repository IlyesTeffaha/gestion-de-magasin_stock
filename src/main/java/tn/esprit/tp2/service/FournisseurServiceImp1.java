package tn.esprit.tp2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.tp2.entity.Fournisseur;
import tn.esprit.tp2.repository.FournisseurRepository;
@Service
public class FournisseurServiceImp1 implements IFournisseurService{
	@Autowired
	FournisseurRepository FournisseurRepository;

	@Override
	public List<Fournisseur> retrieveAllFournisseurs() {
List<Fournisseur> Fournisseurs = (List<Fournisseur>) FournisseurRepository.findAll();
		
		for(Fournisseur Fournisseur : Fournisseurs){
	System.out.println("Fournisseur +++ :" +Fournisseur);
		}
		
		return Fournisseurs;
	

	}

	@Override
	public Long addFournisseur(Fournisseur u) {
		FournisseurRepository.save(u);
		 return u.getIdFournisseur();
	}

	@Override
	public void deleteFournisseur(Long id) {
		FournisseurRepository.delete(FournisseurRepository.findById(id).get());

		
	}

	@Override
	public Fournisseur updateFournisseur(Fournisseur u) {
		return FournisseurRepository.save(u);	}

	@Override
	public Fournisseur retrieveFournisseur(Long id) {
		Fournisseur Fournisseur = FournisseurRepository.findById(id).get();
		return Fournisseur;
	}

}
