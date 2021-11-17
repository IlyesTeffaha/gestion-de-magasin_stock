package tn.esprit.tp2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.tp2.entity.CategorieClient;
import tn.esprit.tp2.entity.Client;
import tn.esprit.tp2.entity.Profession;


public interface IClientService {
	List<Client> retrieveAllClients();

	Client addClient(Client c);

	void deleteClient(Long id);

	Client updateClient(Client c);

	Client retrieveClient(Long id);
	List<Client> retrieveClientsByProfession(Profession profession);
	int updateClientCategorieByProfession(CategorieClient categorieClient,Profession profession);
	int deleteClientByCategorieClientAndProfession(CategorieClient categorieClient, Profession profession);
}
