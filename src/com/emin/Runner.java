package com.emin;

import com.emin.repository.MudurRepository;
import com.emin.repository.entity.Mudur;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        // 1. müdür
        Mudur mudur = new Mudur();
        mudur.setAd("Tuna");
        mudur.setAdres("Ankara");
        mudur.setTelefon("0 444 333 11 22");
        //2. müdür
        Mudur mudur2 = new Mudur();
        mudur2.setAd("Emin ");
        mudur2.setAdres("Angara");
        mudur2.setTelefon("0 222 333 44 55");

        // Verilerin tutuldugu yer
        MudurRepository dbMudur = new MudurRepository();
        MudurRepository dbMudur2 = new MudurRepository();
        dbMudur.save(mudur);
        dbMudur.save(mudur2);
        // Yazdırma
        System.out.println(dbMudur.findAll());
        /**
         * Müdür Listesini alıyorum (dbMudur.find.all())
         *Peki bu Listede Sıra ile ne vardır ?? Müdür Nesnesine
         */
        for (Mudur item : dbMudur.findAll()) {
            System.out.println("--------*---*--------");
            System.out.println("Id : " + item.getId());
            System.out.println("Sıra No : " + item.sirano);
            System.out.println("Ad : " + item.getAd());

        }


    }

}
