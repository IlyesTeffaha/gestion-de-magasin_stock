package tn.esprit.tp2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.tp2.entity.DetailFacture;

public interface IDetailFactureService {
	List<DetailFacture> retrieveAllDetailFactures();
	Long  addDetailFacture(DetailFacture u);
	void deleteDetailFacture(Long id);
	DetailFacture updateDetailFacture(DetailFacture u);
	DetailFacture retrieveDetailFacture(Long id);
}
