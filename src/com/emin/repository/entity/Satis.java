package com.emin.repository.entity;

import java.util.Date;

public class Satis {

    long id;
    long musteriId;
    long urunId;
    Date satistarihi;
    Date islemtarihi;
    double birimfiyati;
    int adet;
    double toplamfiyat;


    public Satis(long id, long musteriId, long urunId, Date satistarihi, Date islemtarihi, double birimfiyati, int adet, double toplamfiyat) {
        this.id = id;
        this.musteriId = musteriId;
        this.urunId = urunId;
        this.satistarihi = satistarihi;
        this.islemtarihi = islemtarihi;
        this.birimfiyati = birimfiyati;
        this.adet = adet;
        this.toplamfiyat = toplamfiyat;
    }

    public Satis() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(long musteriId) {
        this.musteriId = musteriId;
    }

    public long getUrunId() {
        return urunId;
    }

    public void setUrunId(long urunId) {
        this.urunId = urunId;
    }

    public Date getSatistarihi() {
        return satistarihi;
    }

    public void setSatistarihi(Date satistarihi) {
        this.satistarihi = satistarihi;
    }

    public Date getIslemtarihi() {
        return islemtarihi;
    }

    public void setIslemtarihi(Date islemtarihi) {
        this.islemtarihi = islemtarihi;
    }

    public double getBirimfiyati() {
        return birimfiyati;
    }

    public void setBirimfiyati(double birimfiyati) {
        this.birimfiyati = birimfiyati;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public double getToplamfiyat() {
        return toplamfiyat;
    }

    public void setToplamfiyat(double toplamfiyat) {
        this.toplamfiyat = toplamfiyat;
    }
}
