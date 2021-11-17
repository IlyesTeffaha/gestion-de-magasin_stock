package tn.esprit.tp2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table( name ="detailProd")
public class DetailProduit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idDetailProduit")
    private Long idDetailProduit;
    @Column(name="dateCreation")
    private Date dateCreation; 
    @Column(name="dateDerniereModification")
    private Date dateDerniereModification;
    @Column(name="categorieProduit")
    private CategorieProduit categorieProduit;
    @OneToOne(mappedBy="detailproduit")
    private Produit produit;
    public Long getIdDetailProduit() {
        return idDetailProduit;
    }

    public void setIdDetailProduit(Long idDetailProduit) {
        this.idDetailProduit = idDetailProduit;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateDerniereModification() {
        return dateDerniereModification;
    }

    public void setDateDerniereModification(Date dateDerniereModification) {
        this.dateDerniereModification = dateDerniereModification;
    }

    public CategorieProduit getCategorieProduit() {
        return categorieProduit;
    }

    public void setCategorieProduit(CategorieProduit categorieProduit) {
        this.categorieProduit = categorieProduit;
    }
}
