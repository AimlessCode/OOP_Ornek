package com.emin.service;

import com.emin.repository.MusteriRepository;
import com.emin.repository.entity.Musteri;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MusteriService {
    public Musteri musteriSec() {

        MusteriRepository musteriRepository = new MusteriRepository();
        musteriRepository.RastGeleMusteriListesiOlustur();
        List<Musteri> mlist = musteriRepository.getMusterisList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Müsteri Listesi");
        /**
         * Müşteri listesi kadar dönecek bir for dongüsü oluşturup müşteri
         * listesini yazdırıryoruz
         */
        for (
                int i = 0; i < mlist.size(); i++) {
            /**
             * DİKKAT !! her seferde müşteri listesinde vveri çekmek yerine
             * bir defa çekerek işlem yapınız.
             */
            Musteri mst = mlist.get(i);
            System.out.print("Sno: " + i);
            System.out.print(", AD: " + mst.getAd());
            System.out.print(", Soyad: " + mst.getSoyad());
            System.out.print(", Teledon: " + mst.getTelefon());
            System.out.println();
        }

        System.out.print("Müşteri Seç...:");

        int musterisirano = scanner.nextInt() - 1;
        Musteri secilenMusteri = mlist.get(musterisirano);
        System.out.println("Seçilen Müşteri..:" + secilenMusteri.getAd());

        return secilenMusteri;
    }

}
