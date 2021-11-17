package tn.esprit.tp2.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Set;
@SuppressWarnings("serial")
@Entity
@Table( name ="Rayon")
public class Rayon implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idRayon")
    private Long idRayon;
    @Column(name="code")
    private String code;
    @Column(name="libelle")
    private String libelle;
    @OneToMany(cascade=CascadeType.ALL, mappedBy="rayon")
    private Set<Produit> Produit;

    public Long getIdRayon() {
        return idRayon;
    }

    public void setIdRayon(Long idRayon) {
        this.idRayon = idRayon;
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
