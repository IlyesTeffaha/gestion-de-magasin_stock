package tn.esprit.tp2.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Set;

@SuppressWarnings("serial")
@Entity
@Table( name ="Produit")
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idProduit")
    private Long idProduit;
    @Column(name="code")
    private String code;
    @Column(name="libelle")
    private String libelle;
    @Column(name="prixUnitaire")
    private float prixUnitaire;
    @ManyToOne
    Rayon rayon;
    @ManyToMany(cascade=CascadeType.ALL)
   
    private Set<Fournisseur> fournisseur;
    @ManyToOne
    Stock stock;
    @OneToOne
    private DetailProduit detailproduit;
   
    @OneToMany(cascade=CascadeType.ALL, mappedBy="produit")
    private Set<DetailFacture> DetailFactures;
    
    public Rayon getRayon() {
		return rayon;
	}

	public void setRayon(Rayon rayon) {
		this.rayon = rayon;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public Long getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Long idProduit) {
        this.idProduit = idProduit;
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

    public float getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(float prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }
}
