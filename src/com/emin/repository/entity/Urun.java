package com.emin.repository.entity;

public class Urun {
    /**
     * benzersiz bir numara , kimlik veririz
     * id -> Identifier
     */

  long id;
  String ad;
  String marka;
  String model;
  String birim;
  int Stokmiktari;
  double alisfiyati;
  double satisfiyat;
  int KDV;



  public Urun(long id) {
    this.id = id;
  }

  public Urun(long id, String ad, String marka, String model, String birim, int stokmiktari, double alisfiyati, double satisfiyat, int KDV) {
    this.id = id;
    this.ad = ad;
    this.marka = marka;
    this.model = model;
    this.birim = birim;
    Stokmiktari = stokmiktari;
    this.alisfiyati = alisfiyati;
    this.satisfiyat = satisfiyat;
    this.KDV = KDV;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getAd() {
    return ad;
  }

  public void setAd(String ad) {
    this.ad = ad;
  }

  public String getMarka() {
    return marka;
  }

  public void setMarka(String marka) {
    this.marka = marka;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getBirim() {
    return birim;
  }

  public void setBirim(String birim) {
    this.birim = birim;
  }

  public int getStokmiktari() {
    return Stokmiktari;
  }

  public void setStokmiktari(int stokmiktari) {
    Stokmiktari = stokmiktari;
  }

  public double getAlisfiyati() {
    return alisfiyati;
  }

  public void setAlisfiyati(double alisfiyati) {
    this.alisfiyati = alisfiyati;
  }

  public double getSatisfiyat() {
    return satisfiyat;
  }

  public void setSatisfiyat(double satisfiyat) {
    this.satisfiyat = satisfiyat;
  }

  public int getKDV() {
    return KDV;
  }

  public void setKDV(int KDV) {
    this.KDV = KDV;
  }
}
