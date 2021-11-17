package tn.esprit.tp2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.tp2.entity.CategorieClient;
import tn.esprit.tp2.entity.Client;
import tn.esprit.tp2.entity.Produit;
import tn.esprit.tp2.entity.Profession;
import tn.esprit.tp2.repository.ClientRepository;
@Service
public class ClientServiceImp1 implements IClientService{
	@Autowired
	ClientRepository clientRepository;

	@Override
	public List<Client> retrieveAllClients() {
List<Client> clients = (List<Client>) clientRepository.findAll();
		
		for(Client client : clients){
	System.out.println("clients +++ :" +client);
		}
		
		return clients;
	}

	@Override
	public Client addClient(Client c) {
		clientRepository.save(c);
		 return c;
	}

	@Override
	public void deleteClient(Long id) {
		clientRepository.delete(clientRepository.findById(id).get());
		
	}

	@Override
	public Client updateClient(Client c) {
		return clientRepository.save(c);
	}

	@Override
	public Client retrieveClient(Long id) {
		Client client = clientRepository.findById(id).get();
		return client;
	}
	@Override
	public List<Client> retrieveClientsByProfession(Profession profession) {
		List<Client> Clients= clientRepository.retrieveClientsByProfession(profession);
		
		return Clients;
	}

	@Override
	public int updateClientCategorieByProfession(CategorieClient categorieClient, Profession profession) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteClientByCategorieClientAndProfession(CategorieClient categorieClient, Profession profession) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}