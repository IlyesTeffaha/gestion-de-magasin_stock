package tn.esprit.tp2.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.tp2.entity.CategorieClient;
import tn.esprit.tp2.entity.Client;
import tn.esprit.tp2.entity.Profession;

@Repository

public interface ClientRepository extends CrudRepository <Client,Long>{
	
	@Query("SELECT c FROM Client c WHERE c.profession= ?1")
	List<Client> retrieveClientsByProfession(Profession profession);
	
	@Modifying
	@Query("update Client c set c.categorieClient = ?1 where c.profession =?2")
	int updateClientCategorieByProfession( CategorieClient categorieClient, Profession profession);
	
	@Modifying
	@Query("DELETE FROM Client c WHERE c.categorieClient= ?1 AND c.profession = ?2")
	int deleteClientByCategorieClientAndProfession(CategorieClient categorieClient, Profession profession);
	
	@Modifying
	@Query(value = "INSERT INTO Client (nom, prenom,dateNaissance,email,password,profession,categorieClient) VALUES (:nom,:prenom, :dateN, :email, :password, :profession, :categorieClient)",nativeQuery = true)
	void insertClient(@Param("nom") String nom, @Param("prenom") String prenom, @Param("dateN") Date dateNaissance, @Param("email") String email,@Param("password") String password, @Param("profession") Profession profession, @Param("categorieClient") CategorieClient categorieClient);
	}
