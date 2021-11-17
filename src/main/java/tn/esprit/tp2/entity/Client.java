package tn.esprit.tp2.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
@SuppressWarnings("serial")
@Entity
@Table( name = "Client")
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idClient")
    private Long idClient;
    @Column(name="nom")
    private String nom;
    @Column(name="prenom")
    private String prenom;
    @Column(name="dateNaissance")
    private Date dateNaissance;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="categrieClient")
    private CategorieClient categorieClient;
    @Column(name="profession")
    private Profession profession;
    @OneToMany(cascade=CascadeType.ALL, mappedBy="client")
    private Set<Facture> Factures;


    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CategorieClient getCategorieClient() {
        return categorieClient;
    }

    public void setCategorieClient(CategorieClient categorieClient) {
        this.categorieClient = categorieClient;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }
}
