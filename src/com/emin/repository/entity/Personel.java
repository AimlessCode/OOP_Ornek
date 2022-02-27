package com.emin.repository.entity;

import com.emin.constants.Properties;
import com.emin.utility.StaticValues;
import static com.emin.constants.Properties.*;
import static com.emin.utility.StaticValues.getPrs_sirano;
// import static com.emin.constants.Properties.PREFIX;   <- buda olur
import java.util.UUID;

public class Personel {
    /**    ** Önemli **
     *  static verileri çekerken bunları kısatmak adına
     * Properties.PREFIX -> yerine static değer içeren sınıf
     * statick olarak
     *  import ederiz ve içindeki değerler ulaşırız
     *
     */

    /**
     * Kimlik
     */
    private String id;
    public String sirano;
    String ad;
    String soyad;
    String adres;
    String telefon;
    int yas;
    /**
     * Durumu
     * 0-> Pasif
     * 1-> Aktif
     * 2-> İzinli
     */
    int state;

    public Personel() {
        /**
         * otomatik id vericek
         */
        this.id = UUID.randomUUID().toString();
        this.sirano = PREFIX + getPrs_sirano();
      //  this.sirano = Properties.PREFIX + StaticValues.getPrs_sirano();
    }

    public String getSirano() {
        return sirano;
    }

    public void setSirano() {
        this.sirano = sirano;
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
