package com.emin.service;

import com.emin.repository.Satisrepository;
import com.emin.repository.entity.Musteri;
import com.emin.repository.entity.Satis;
import com.emin.repository.entity.Urun;

import java.util.Date;
import java.util.Scanner;

public class SatisService {

    public void satisYap() {

        Satisrepository satisrepository = new Satisrepository();

        System.out.println("****************");
        System.out.println("**** SATIŞ *****");
        System.out.println("****************");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        MusteriService musteriService = new MusteriService();
        Musteri seciliMusteri = musteriService.musteriSec();
        UrunService urunService = new UrunService();
        Urun secilenUrun = urunService.urunSec();


        System.out.println("Satılan adet : ");

        int adet = scanner.nextInt();
        /**
         * Burada Sonra satış için gerekli alanları
         * satiş nesnesi içinde yerletiriyoruz.
         */

        Satis satis = new Satis();
        satis.setMusteriId(seciliMusteri.getId());
        satis.setUrunId(secilenUrun.getId());
        satis.setBirimfiyati(secilenUrun.getSatisfiyat());
        satis.setAdet(adet);
        satis.setToplamfiyat(secilenUrun.getSatisfiyat() * adet);
        satis.setSatistarihi(new Date());
        satis.setIslemtarihi(new Date());
        satisrepository.save(satis);
    }

}
