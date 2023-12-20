package com.flightsearchapi.flightsearchapi.model;

import jakarta.persistence.*;


@Entity
public class Havaalanlari {

    // Havaalani Kimlik Numarası
    @Id
    private Long ID;

    // Havaalaninin bulunduğu şehir
    @Column(name = "Sehir")
    private String sehir;


    // Getter ve Setter metotları

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }
}
