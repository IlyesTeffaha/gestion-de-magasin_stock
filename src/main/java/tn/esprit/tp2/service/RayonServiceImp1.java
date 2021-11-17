package tn.esprit.tp2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.tp2.entity.Rayon;
import tn.esprit.tp2.repository.RayonRepository;
@Service
public class RayonServiceImp1 implements IRayonService{
	@Autowired
	RayonRepository RayonRepository;

	@Override
	public List<Rayon> retrieveAllRayons() {
List<Rayon> Rayons = (List<Rayon>) RayonRepository.findAll();
		
		for(Rayon Rayon : Rayons){
	System.out.println("Rayon +++ :" +Rayon);
		}
		
		return Rayons;
	}

	@Override
	public Long addRayon(Rayon u) {
		RayonRepository.save(u);
		 return u.getIdRayon();
	}

	@Override
	public void deleteRayon(Long id) {
		RayonRepository.delete(RayonRepository.findById(id).get());
		
	}

	@Override
	public Rayon updateRayon(Rayon u) {
		return RayonRepository.save(u);
	}

	@Override
	public Rayon retrieveRayon(Long id) {
		Rayon Rayon=RayonRepository.findById(id).get();
		return Rayon;
	}
}
