package com.flightsearchapi.flightsearchapi.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Ucuslar {

    // Uçuşun Kimlik Numarası
    @Id
    private Long ID;

    // Uçuşun Kalkış Havaalanı
    @Column(name = "KalkisHavaalani")
    private String kalkisHavaalani;

    // Uçuşun Varış Havaalanı
    @Column(name = "VarisHavaalani")
    private String varisHavaalani;

    // Uçuşun Kalkış Tarih ve Saati
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "KalkisTarihSaat")
    private Date kalkisTarihSaat;

    // Uçuşun Dönüş Tarih ve Saati
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DonusTarihSaat")
    private Date donusTarihSaat;

    // Uçuşun Fiyatı
    @Column(name = "Fiyat")
    private double fiyat;


    // Getter ve Setter metotları

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getKalkisHavaalani() {
        return kalkisHavaalani;
    }

    public void setKalkisHavaalani(String kalkisHavaalani) {
        this.kalkisHavaalani = kalkisHavaalani;
    }

    public String getVarisHavaalani() {
        return varisHavaalani;
    }

    public void setVarisHavaalani(String varisHavaalani) {
        this.varisHavaalani = varisHavaalani;
    }

    public Date getKalkisTarihSaat() {
        return kalkisTarihSaat;
    }

    public void setKalkisTarihSaat(Date kalkisTarihSaat) {
        this.kalkisTarihSaat = kalkisTarihSaat;
    }

    public Date getDonusTarihSaat() {
        return donusTarihSaat;
    }

    public void setDonusTarihSaat(Date donusTarihSaat) {
        this.donusTarihSaat = donusTarihSaat;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

}
