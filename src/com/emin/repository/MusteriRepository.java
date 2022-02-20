package com.emin.repository;

import com.emin.repository.entity.Musteri;

import java.util.ArrayList;
import java.util.List;

public class MusteriRepository {
    /**
     * Temel olarak verilerin depolandığı yerden alınarak
     * istenilen şekilde sunulması yapar.
     * 1- Herhangi bir depolama yeri olmadan hafıza veriler
     * tutularak sanal verilerle çalışılabilir.
     * 2- Geçici veritabanları veriler işlenere alınabilir
     * 3- Sabit veritabanlarından bağlantı kurularak veriler
     * alınır ve işlenerek sununlur.
     *
     */
    /**
     * Müşteri listesinin içene sadece müşteri nesneleri atılır.
     */
    // Liste Tanımla                Initialize - başlatmak.

   private List <Musteri> musterisList= new ArrayList<>();




    public List<Musteri> getMusterisList() {
        return musterisList;
    }

    public void setMusterisList(List<Musteri> musterisList) {
        this.musterisList = musterisList;
    }




    public void  RastMusteriListesiOlustur(){

       for (long i =1;i<25;i++){

           Musteri musteri =new Musteri();
           musteri.setId(i);
           musteri.setAd("musteri"+i);
           musteri.setSoyad("soyad"+i);
           musteri.setAdres("Ankara");
           musteri.setTckimlik("123123123");
           musteri.setTelefon("5 5 4564 64");

           musterisList.add(musteri);
       }






   }
}
