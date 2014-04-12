package com.bilisimegitim.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "musteri_arama", catalog = "murat", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MusteriArama.findAll", query = "SELECT m FROM MusteriArama m"),
    @NamedQuery(name = "MusteriArama.findByAramaId", query = "SELECT m FROM MusteriArama m WHERE m.aramaId = :aramaId"),
    @NamedQuery(name = "MusteriArama.findByMusteriId", query = "SELECT m FROM MusteriArama m WHERE m.musteriId = :musteriId"),
    @NamedQuery(name = "MusteriArama.findByTarih", query = "SELECT m FROM MusteriArama m WHERE m.tarih = :tarih"),
    @NamedQuery(name = "MusteriArama.findByKonu", query = "SELECT m FROM MusteriArama m WHERE m.konu = :konu"),
    @NamedQuery(name = "MusteriArama.findByDetay", query = "SELECT m FROM MusteriArama m WHERE m.detay = :detay")})
public class MusteriArama implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "arama_id", nullable = false)
    private Integer aramaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "musteri_id", nullable = false)
    private int musteriId;
    @Temporal(TemporalType.DATE)
    private Date tarih;
    @Size(max = 40)
    @Column(length = 40)
    private String konu;
    @Size(max = 40)
    @Column(length = 40)
    private String detay;

    public MusteriArama() {
    }

    public MusteriArama(Integer aramaId) {
        this.aramaId = aramaId;
    }

    public MusteriArama(Integer aramaId, int musteriId) {
        this.aramaId = aramaId;
        this.musteriId = musteriId;
    }

    public Integer getAramaId() {
        return aramaId;
    }

    public void setAramaId(Integer aramaId) {
        this.aramaId = aramaId;
    }

    public int getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(int musteriId) {
        this.musteriId = musteriId;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public String getKonu() {
        return konu;
    }

    public void setKonu(String konu) {
        this.konu = konu;
    }

    public String getDetay() {
        return detay;
    }

    public void setDetay(String detay) {
        this.detay = detay;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aramaId != null ? aramaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MusteriArama)) {
            return false;
        }
        MusteriArama other = (MusteriArama) object;
        if ((this.aramaId == null && other.aramaId != null) || (this.aramaId != null && !this.aramaId.equals(other.aramaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bilisimegitim.dao.MusteriArama[ aramaId=" + aramaId + " ]";
    }
    
}
