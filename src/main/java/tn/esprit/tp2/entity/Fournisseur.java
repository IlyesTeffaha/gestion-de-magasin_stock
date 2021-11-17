package tn.esprit.tp2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;

@SuppressWarnings("serial")
@Entity
@Table( name ="Fournisseur")
public class Fournisseur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idFournisseur")
    private Long idFournisseur;
    @Column(name="code")
    private String code;
    @Column(name="libelle")
    private String libelle;

    public Long getIdFournisseur() {
        return idFournisseur;
    }

    public void setIdFournisseur(Long idFournisseur) {
        this.idFournisseur = idFournisseur;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
