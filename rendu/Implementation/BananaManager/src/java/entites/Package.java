/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author arkeine
 */
@Entity
@Table(name = "Package")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Package.findAll", query = "SELECT p FROM Package p"),
    @NamedQuery(name = "Package.findById", query = "SELECT p FROM Package p WHERE p.id = :id"),
    @NamedQuery(name = "Package.findByGatherdate", query = "SELECT p FROM Package p WHERE p.gatherdate = :gatherdate"),
    @NamedQuery(name = "Package.findByProductor", query = "SELECT p FROM Package p WHERE p.productor = :productor"),
    @NamedQuery(name = "Package.findByHangar", query = "SELECT p FROM Package p WHERE p.hangar = :hangar"),
    @NamedQuery(name = "Package.findByClient", query = "SELECT p FROM Package p WHERE p.client = :client"),
    @NamedQuery(name = "Package.findByIsTransit", query = "SELECT p FROM Package p WHERE p.isTransit = :isTransit")})
public class Package implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "gatherdate")
    @Temporal(TemporalType.DATE)
    private Date gatherdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "productor")
    private int productor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hangar")
    private int hangar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "client")
    private int client;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_transit")
    private boolean isTransit;
    @ManyToMany(mappedBy = "packageCollection")
    private Collection<Command> commandCollection;
    @JoinTable(name = "Package_has_Stock", joinColumns = {
        @JoinColumn(name = "Package_id", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "Stock_id", referencedColumnName = "id")})
    @ManyToMany
    private Collection<Stock> stockCollection;
    @JoinColumn(name = "Banana_type_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Bananatype bananatypeid;

    public Package() {
    }

    public Package(Integer id) {
        this.id = id;
    }

    public Package(Integer id, int productor, int hangar, int client, boolean isTransit) {
        this.id = id;
        this.productor = productor;
        this.hangar = hangar;
        this.client = client;
        this.isTransit = isTransit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getGatherdate() {
        return gatherdate;
    }

    public void setGatherdate(Date gatherdate) {
        this.gatherdate = gatherdate;
    }

    public int getProductor() {
        return productor;
    }

    public void setProductor(int productor) {
        this.productor = productor;
    }

    public int getHangar() {
        return hangar;
    }

    public void setHangar(int hangar) {
        this.hangar = hangar;
    }

    public int getClient() {
        return client;
    }

    public void setClient(int client) {
        this.client = client;
    }

    public boolean getIsTransit() {
        return isTransit;
    }

    public void setIsTransit(boolean isTransit) {
        this.isTransit = isTransit;
    }

    @XmlTransient
    public Collection<Command> getCommandCollection() {
        return commandCollection;
    }

    public void setCommandCollection(Collection<Command> commandCollection) {
        this.commandCollection = commandCollection;
    }

    @XmlTransient
    public Collection<Stock> getStockCollection() {
        return stockCollection;
    }

    public void setStockCollection(Collection<Stock> stockCollection) {
        this.stockCollection = stockCollection;
    }

    public Bananatype getBananatypeid() {
        return bananatypeid;
    }

    public void setBananatypeid(Bananatype bananatypeid) {
        this.bananatypeid = bananatypeid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Package)) {
            return false;
        }
        Package other = (Package) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Package[ id=" + id + " ]";
    }
    
}
