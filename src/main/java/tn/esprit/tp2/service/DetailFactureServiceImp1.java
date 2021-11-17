package tn.esprit.tp2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.tp2.entity.DetailFacture;
import tn.esprit.tp2.repository.DetailFactureRepository;
@Service
public class DetailFactureServiceImp1 implements IDetailFactureService{
	@Autowired
	DetailFactureRepository DetailFactureRepository;
	
	@Override
	public List<DetailFacture> retrieveAllDetailFactures() {
		List<DetailFacture> DetailFactures = (List<DetailFacture>) DetailFactureRepository.findAll();
		for(DetailFacture DetailFacture : DetailFactures){
			System.out.println("DetailFacture +++ :" +DetailFacture);
		}
		return DetailFactures;
	}

	@Override
	public Long addDetailFacture(DetailFacture u) {
		DetailFactureRepository.save(u);
		 return u.getIdDetailFacture();
	}

	@Override
	public void deleteDetailFacture(Long id) {
		DetailFactureRepository.delete(DetailFactureRepository.findById(id).get());

		
	}

	@Override
	public DetailFacture updateDetailFacture(DetailFacture u) {
		return DetailFactureRepository.save(u);	}

	@Override
	public DetailFacture retrieveDetailFacture(Long id) {
		DetailFacture DetailFacture = DetailFactureRepository.findById(id).get();
		return DetailFacture;
	}

}
