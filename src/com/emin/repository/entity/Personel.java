package com.emin.repository.entity;

import java.util.UUID;

public class Personel {
    /**
     * Kimlik
     */
    private  String id;
      String ad;
      String soyad;
      String adres;
      String telefon;
      int yas;
    /**
     *     Durumu
     * 0-> Pasif
     * 1-> Aktif
     * 2-> İzinli
     */
    int state;

    public Personel(){
        /**
         * otomatik id vericek
         */
        this.id= UUID.randomUUID().toString();


    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
