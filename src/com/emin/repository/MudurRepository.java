package com.emin.repository;

import com.emin.repository.entity.Mudur;

import java.util.ArrayList;
import java.util.List;

/**
 * Repository amacı nedir ?
 * Herhangi bir sınıf için , verilerin işlenmesini;
 * Müdür sınıfı özelinde konusur isek,
 * müdür'ün bir yere katır edilmesi
 * müdür'ün güncellenmesi, silinmesi
 * müdür'ün ile ilgili aramlaron yapılması
 * Sıralı bir şekilde müdür listesinin çekilmesi
 * işlemlerini burada yaparız.
 */
public class MudurRepository {

    //  çok dogru olmaz->  Mudur[] mudurDizisi =new Mudur[10];
    private List<Mudur> mudurListesi = new ArrayList<>();

    /**
     * Constructor.
     * BestPractice
     */

    public MudurRepository() {
        mudurListesi = new ArrayList<>();

    }
    public void save(Mudur mudur){
        this.mudurListesi.add(mudur);

    }




}
