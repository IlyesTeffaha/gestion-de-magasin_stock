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
@Table( name ="Stock")
public class Stock implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idStock")
    private Long idStock;
    @Column(name="qte")
    private Integer qte;
    @Column(name="qteMin")
    private Integer qteMin;
    @Column(name="libelleStock")
    private String libelleStock;
    @OneToMany(cascade=CascadeType.ALL, mappedBy="stock")
    private Set<Produit> Produit;

    public Long getIdStock() {
        return idStock;
    }

    public void setIdStock(Long idStock) {
        this.idStock = idStock;
    }

    public Integer getQte() {
        return qte;
    }

    public void setQte(Integer qte) {
        this.qte = qte;
    }

    public Integer getQteMin() {
        return qteMin;
    }

    public void setQteMin(Integer qteMin) {
        this.qteMin = qteMin;
    }

    public String getLibelleStock() {
        return libelleStock;
    }

    public void setLibelleStock(String libelleStock) {
        this.libelleStock = libelleStock;
    }
}
