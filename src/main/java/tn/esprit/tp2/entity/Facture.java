package tn.esprit.tp2.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@SuppressWarnings("serial")
@Entity
@Table( name ="Facture")
public class Facture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idFacture")
    private Long idFacture;
    @Column(name="montantRemise")
    private float montantRemise;
    @Column(name="montantFacture")
    private float montantFacture;
    @Column(name="dateFacture")
    private Date dateFacture;
    @Column(name="active")
    private boolean active;
    @ManyToOne
    Client client;
    @OneToMany(cascade=CascadeType.ALL, mappedBy="facture")
    private Set<DetailFacture> detailfacture;


    public Long getIdFacture() {
        return idFacture;
    }

    public void setIdFacture(Long idFacture) {
        this.idFacture = idFacture;
    }

    public float getMontantRemise() {
        return montantRemise;
    }

    public void setMontantRemise(float montantRemise) {
        this.montantRemise = montantRemise;
    }

    public float getMontantFacture() {
        return montantFacture;
    }

    public void setMontantFacture(float montantFacture) {
        this.montantFacture = montantFacture;
    }

    public Date getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
