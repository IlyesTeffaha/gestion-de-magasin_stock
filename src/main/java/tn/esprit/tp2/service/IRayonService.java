package tn.esprit.tp2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.tp2.entity.Rayon;


public interface IRayonService {
	List<Rayon> retrieveAllRayons();
	Long  addRayon(Rayon u);
	void deleteRayon(Long id);
	Rayon updateRayon(Rayon u);
	Rayon retrieveRayon(Long id);

}
