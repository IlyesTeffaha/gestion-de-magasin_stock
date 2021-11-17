package tn.esprit.tp2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.tp2.entity.DetailProduit;
import tn.esprit.tp2.repository.DetailProduitRepository;
@Service
public class DetailProduitServiceImp1 implements IDetailProduitService{

	@Autowired
	DetailProduitRepository DetailProduitRepository;
	@Override
	public List<DetailProduit> retrieveAllDetailProduits() {
		List<DetailProduit> DetailProduits = (List<DetailProduit>) DetailProduitRepository.findAll();
		
		for(DetailProduit DetailProduit : DetailProduits){
	System.out.println("DetailProduit +++ :" +DetailProduit);
		}
		
		return DetailProduits;
	}

	@Override
	public Long addDetailProduit(DetailProduit u) {
		DetailProduitRepository.save(u);
		 return u.getIdDetailProduit();
	}

	@Override
	public void deleteDetailProduit(Long id) {
		DetailProduitRepository.delete(DetailProduitRepository.findById(id).get());
	}

	@Override
	public DetailProduit updateDetailProduit(DetailProduit u) {
		return DetailProduitRepository.save(u);
	}

	@Override
	public DetailProduit retrieveDetailProduit(Long id) {
		DetailProduit DetailProduit = DetailProduitRepository.findById(id).get();
		return DetailProduit;
	}

}
