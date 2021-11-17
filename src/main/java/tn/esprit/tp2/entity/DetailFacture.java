package tn.esprit.tp2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.io.Serializable;

@SuppressWarnings("serial")
@Entity
@Table( name ="DetailFacture")
public class DetailFacture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idDetailFacture")
    private Long idDetailFacture;
    @Column(name="qte")
    private Integer qte;
    @Column(name="prixTotal")
    private float prixTotal;
    @Column(name="pourcentageRemise")
    private Integer pourcentageRemise;
    @Column(name="montantRemise")
    private float montantRemise;
    @ManyToOne
    Produit produit;
    @ManyToOne
    Facture facture;
    public Long getIdDetailFacture() {
        return idDetailFacture;
    }

    public void setIdDetailFacture(Long idDetailFacture) {
        this.idDetailFacture = idDetailFacture;
    }

    public Integer getQte() {
        return qte;
    }

    public void setQte(Integer qte) {
        this.qte = qte;
    }

    public float getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(float prixTotal) {
        this.prixTotal = prixTotal;
    }

    public Integer getPourcentageRemise() {
        return pourcentageRemise;
    }

    public void setPourcentageRemise(Integer pourcentageRemise) {
        this.pourcentageRemise = pourcentageRemise;
    }

    public float getMontantRemise() {
        return montantRemise;
    }

    public void setMontantRemise(float montantRemise) {
        this.montantRemise = montantRemise;
    }
}
